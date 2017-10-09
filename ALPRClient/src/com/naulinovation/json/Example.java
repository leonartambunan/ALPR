
package com.naulinovation.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("data_type")
    @Expose
    private String dataType;
    @SerializedName("epoch_time")
    @Expose
    private long epochTime;
    @SerializedName("img_width")
    @Expose
    private long imgWidth;
    @SerializedName("img_height")
    @Expose
    private long imgHeight;
    @SerializedName("processing_time_ms")
    @Expose
    private double processingTimeMs;
    @SerializedName("regions_of_interest")
    @Expose
    private List<Object> regionsOfInterest = new ArrayList<Object>();
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("camera_id")
    @Expose
    private long cameraId;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("company_id")
    @Expose
    private String companyId;

    /**
     * 
     * @return
     *     The version
     */
    public long getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(long version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The dataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 
     * @param dataType
     *     The data_type
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 
     * @return
     *     The epochTime
     */
    public long getEpochTime() {
        return epochTime;
    }

    /**
     * 
     * @param epochTime
     *     The epoch_time
     */
    public void setEpochTime(long epochTime) {
        this.epochTime = epochTime;
    }

    /**
     * 
     * @return
     *     The imgWidth
     */
    public long getImgWidth() {
        return imgWidth;
    }

    /**
     * 
     * @param imgWidth
     *     The img_width
     */
    public void setImgWidth(long imgWidth) {
        this.imgWidth = imgWidth;
    }

    /**
     * 
     * @return
     *     The imgHeight
     */
    public long getImgHeight() {
        return imgHeight;
    }

    /**
     * 
     * @param imgHeight
     *     The img_height
     */
    public void setImgHeight(long imgHeight) {
        this.imgHeight = imgHeight;
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
     *     The regionsOfInterest
     */
    public List<Object> getRegionsOfInterest() {
        return regionsOfInterest;
    }

    /**
     * 
     * @param regionsOfInterest
     *     The regions_of_interest
     */
    public void setRegionsOfInterest(List<Object> regionsOfInterest) {
        this.regionsOfInterest = regionsOfInterest;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 
     * @return
     *     The cameraId
     */
    public long getCameraId() {
        return cameraId;
    }

    /**
     * 
     * @param cameraId
     *     The camera_id
     */
    public void setCameraId(long cameraId) {
        this.cameraId = cameraId;
    }

    /**
     * 
     * @return
     *     The siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * 
     * @param siteId
     *     The site_id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * 
     * @return
     *     The companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 
     * @param companyId
     *     The company_id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

}
