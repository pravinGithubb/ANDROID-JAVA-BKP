package com.app.retrofitandroid.model;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("country_name")
    private String name;
    @SerializedName("country_short_name")
    private String shortName;
    @SerializedName("country_phone_code")
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name;
    }
}
