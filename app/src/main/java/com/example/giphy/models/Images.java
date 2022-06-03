
package com.example.giphy.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Images implements Serializable {

    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param preview
     * @param previewGif
     */
    public Images(Preview preview, PreviewGif previewGif) {
        super();
        this.preview = preview;
        this.previewGif = previewGif;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

}
