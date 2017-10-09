package com.naulinovation;

import com.dinstone.beanstalkc.BeanstalkClientFactory;
import com.dinstone.beanstalkc.Configuration;
import com.dinstone.beanstalkc.Job;
import com.dinstone.beanstalkc.JobConsumer;
import com.google.gson.Gson;
import com.naulinovation.json.Coordinate;
import com.naulinovation.json.Example;
import com.naulinovation.json.Result;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

import java.util.List;

public class Controller {
    public Controller() {

        Task task = new Task<Void>() {
            @Override
            public Void call() throws Exception {

                Configuration config = new Configuration();
                config.setServiceHost("127.0.0.1");
                config.setServicePort(11300);
                BeanstalkClientFactory factory = new BeanstalkClientFactory(config);
                consumer = factory.createJobConsumer("alprd");

                System.out.println("Connected to Queue ALPRD");

                while (!stop) {
                    try {
                        Job job = consumer.reserveJob(1);
                        if (job != null) {
                            consumer.deleteJob(job.getId());

                            StatsInfo.receiveCount.incrementAndGet();
                            System.out.println("Consuming : " + job.getId());

                            System.out.println(new String(job.getData()));

                            String json = new String(job.getData());

                            Example example = new Gson().fromJson(json, Example.class);

                            Result r = example.getResults().get(0);

                            System.out.println(r.getPlate());

                            System.out.println("URL:"+"http://127.0.0.1:80/images/"+example.getUuid()+".jpg");

                            Platform.runLater(() -> {
                                updateImage(example.getResults(),r.getPlate(),r.getConfidence(),"http://127.0.0.1:80/images/"+example.getUuid()+".jpg",r.getCoordinates());

                            });

                        }
                    } catch (Exception e) {
                        StatsInfo.receiveError.incrementAndGet();
                        System.out.println("{} exception" + e);
                    }
                }

                return null;
            }
        };
        Thread th = new Thread(task);
        th.setDaemon(true);
        th.start();
    }

//    @FXML
//    private Label resultLabel;

//    @FXML
//    private Label confidenceLabel;

//    @FXML
//    private ImageView imageView;
    @FXML
    private Pane stackPane;

//    public Label getResultLabel() {
//        return resultLabel;
//    }

//    public void setResultLabel(Label resultLabel) {
//        this.resultLabel = resultLabel;
//    }

    public void updateImage(List<Result> resutls, String plate, double percentage, String fileLocation,List<Coordinate> coordinateList) {
        Image image = new Image(fileLocation);
        ImageView imageView = new ImageView(image);

        Line line1 = new Line(coordinateList.get(0).getX(),coordinateList.get(0).getY(),coordinateList.get(1).getX(),coordinateList.get(1).getY() );
        line1.setStroke(Color.YELLOW);
        Line line2 = new Line(coordinateList.get(1).getX(),coordinateList.get(1).getY(),coordinateList.get(2).getX(),coordinateList.get(2).getY() );
        line2.setStroke(Color.YELLOW);
        Line line3 = new Line(coordinateList.get(2).getX(),coordinateList.get(2).getY(),coordinateList.get(3).getX(),coordinateList.get(3).getY() );
        line3.setStroke(Color.YELLOW);
        Line line4 = new Line(coordinateList.get(3).getX(),coordinateList.get(3).getY(),coordinateList.get(0).getX(),coordinateList.get(0).getY() );
        line4.setStroke(Color.YELLOW);


        StringBuilder sb = new StringBuilder();

        for (Result result : resutls) {
            sb.append(result.getPlate()+" ("+((int)result.getConfidence())+"%)\n");
        }


        Label plateLabel = new Label(sb.toString());
        plateLabel.setFont(Font.font("Cambria", 34));
        plateLabel.setTextFill(Color.YELLOW);

        stackPane.getChildren().setAll(imageView,line1,line2,line3,line4,plateLabel);


    }


    public void drawRegion(List<Coordinate> coordinateList) {


    }

    JobConsumer consumer;
    String name = "alprd";
    volatile boolean stop;

}
