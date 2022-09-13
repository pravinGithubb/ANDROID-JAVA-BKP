package com.app.androidreyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

    private int id;
    private String title;
    private String desc;
    private int imageId;
    private float rating;

    public Item(int id, String title, String desc, float rating, int imageId) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.imageId = imageId;
        this.rating = rating;
    }

    protected Item(Parcel in) {
        id = in.readInt();
        title = in.readString();
        desc = in.readString();
        imageId = in.readInt();
        rating = in.readFloat();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(desc);
        parcel.writeInt(imageId);
        parcel.writeFloat(rating);
    }
}
