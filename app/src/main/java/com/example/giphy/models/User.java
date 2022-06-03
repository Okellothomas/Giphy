
package com.example.giphy.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class User implements Serializable {

    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("banner_image")
    @Expose
    private String bannerImage;
    @SerializedName("banner_url")
    @Expose
    private String bannerUrl;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("instagram_url")
    @Expose
    private String instagramUrl;
    @SerializedName("website_url")
    @Expose
    private String websiteUrl;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param profileUrl
     * @param bannerImage
     * @param avatarUrl
     * @param websiteUrl
     * @param isVerified
     * @param displayName
     * @param bannerUrl
     * @param description
     * @param instagramUrl
     * @param username
     */
    public User(String avatarUrl, String bannerImage, String bannerUrl, String profileUrl, String username, String displayName, String description, String instagramUrl, String websiteUrl, Boolean isVerified) {
        super();
        this.avatarUrl = avatarUrl;
        this.bannerImage = bannerImage;
        this.bannerUrl = bannerUrl;
        this.profileUrl = profileUrl;
        this.username = username;
        this.displayName = displayName;
        this.description = description;
        this.instagramUrl = instagramUrl;
        this.websiteUrl = websiteUrl;
        this.isVerified = isVerified;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

}
