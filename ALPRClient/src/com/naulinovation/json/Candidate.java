
package com.naulinovation.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Candidate {

    @SerializedName("plate")
    @Expose
    private String plate;
    @SerializedName("confidence")
    @Expose
    private double confidence;
    @SerializedName("matches_template")
    @Expose
    private long matchesTemplate;

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

}
