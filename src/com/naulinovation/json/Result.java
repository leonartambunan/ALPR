
package com.naulinovation.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("plate")
    @Expose
    private String plate;
    @SerializedName("confidence")
    @Expose
    private double confidence;
    @SerializedName("matches_template")
    @Expose
    private long matchesTemplate;
    @SerializedName("plate_index")
    @Expose
    private long plateIndex;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("region_confidence")
    @Expose
    private long regionConfidence;
    @SerializedName("processing_time_ms")
    @Expose
    private double processingTimeMs;
    @SerializedName("requested_topn")
    @Expose
    private long requestedTopn;
    @SerializedName("coordinates")
    @Expose
    private List<Coordinate> coordinates = new ArrayList<Coordinate>();
    @SerializedName("candidates")
    @Expose
    private List<Candidate> candidates = new ArrayList<Candidate>();

    /**
     * 
     * @return
     *     The plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * 
     * @param plate
     *     The plate
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * 
     * @return
     *     The confidence
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * 
     * @param confidence
     *     The confidence
     */
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    /**
     * 
     * @return
     *     The matchesTemplate
     */
    public long getMatchesTemplate() {
        return matchesTemplate;
    }

    /**
     * 
     * @param matchesTemplate
     *     The matches_template
     */
    public void setMatchesTemplate(long matchesTemplate) {
        this.matchesTemplate = matchesTemplate;
    }

    /**
     * 
     * @return
     *     The plateIndex
     */
    public long getPlateIndex() {
        return plateIndex;
    }

    /**
     * 
     * @param plateIndex
     *     The plate_index
     */
    public void setPlateIndex(long plateIndex) {
        this.plateIndex = plateIndex;
    }

    /**
     * 
     * @return
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The regionConfidence
     */
    public long getRegionConfidence() {
        return regionConfidence;
    }

    /**
     * 
     * @param regionConfidence
     *     The region_confidence
     */
    public void setRegionConfidence(long regionConfidence) {
        this.regionConfidence = regionConfidence;
    }

    /**
     * 
     * @return
     *     The processingTimeMs
     */
    public double getProcessingTimeMs() {
        return processingTimeMs;
    }

    /**
     * 
     * @param processingTimeMs
     *     The processing_time_ms
     */
    public void setProcessingTimeMs(double processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    /**
     * 
     * @return
     *     The requestedTopn
     */
    public long getRequestedTopn() {
        return requestedTopn;
    }

    /**
     * 
     * @param requestedTopn
     *     The requested_topn
     */
    public void setRequestedTopn(long requestedTopn) {
        this.requestedTopn = requestedTopn;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The candidates
     */
    public List<Candidate> getCandidates() {
        return candidates;
    }

    /**
     * 
     * @param candidates
     *     The candidates
     */
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

}
