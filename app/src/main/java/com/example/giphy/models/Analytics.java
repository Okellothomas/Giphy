
package com.example.giphy.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Analytics implements Serializable {

    @SerializedName("onload")
    @Expose
    private Onload onload;
    @SerializedName("onclick")
    @Expose
    private Onclick onclick;
    @SerializedName("onsent")
    @Expose
    private Onsent onsent;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Analytics() {
    }

    /**
     * 
     * @param onclick
     * @param onsent
     * @param onload
     */
    public Analytics(Onload onload, Onclick onclick, Onsent onsent) {
        super();
        this.onload = onload;
        this.onclick = onclick;
        this.onsent = onsent;
    }

    public Onload getOnload() {
        return onload;
    }

    public void setOnload(Onload onload) {
        this.onload = onload;
    }

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    public Onsent getOnsent() {
        return onsent;
    }

    public void setOnsent(Onsent onsent) {
        this.onsent = onsent;
    }

}
