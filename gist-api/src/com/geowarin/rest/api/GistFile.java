package com.geowarin.rest.api;

import com.google.gson.annotations.SerializedName;

public class GistFile {
    private String filename;
    private String type;
    private String language;
    @SerializedName("raw_url")
    private String rawUrl;
    private long size;
    private String content;

    public String getFilename() {
        return filename;
    }

    public String getType() {
        return type;
    }

    public String getLanguage() {
        return language;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public long getSize() {
        return size;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "GistFile{" +
                "filename='" + filename + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", rawUrl='" + rawUrl + '\'' +
                ", size=" + size +
                '}';
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isBinary() {
        return false;  //To change body of created methods use File | Settings | File Templates.
    }
}
