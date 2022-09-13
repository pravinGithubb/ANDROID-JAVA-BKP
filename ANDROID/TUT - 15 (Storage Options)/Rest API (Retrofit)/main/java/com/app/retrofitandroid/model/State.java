package com.app.retrofitandroid.model;

import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("state_name")
    private String stateName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return stateName;
    }
}
