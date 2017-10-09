
package com.naulinovation.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Coordinate {

    @SerializedName("x")
    @Expose
    private long x;
    @SerializedName("y")
    @Expose
    private long y;

    /**
     * 
     * @return
     *     The x
     */
    public long getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    public void setX(long x) {
        this.x = x;
    }

    /**
     * 
     * @return
     *     The y
     */
    public long getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    public void setY(long y) {
        this.y = y;
    }

}
