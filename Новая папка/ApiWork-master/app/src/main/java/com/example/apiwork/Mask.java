package com.example.apiwork;

import android.os.Parcel;
import android.os.Parcelable;

public class Mask implements Parcelable {
    private int ID;
    private int MinCostForAgent;
    private String ProductTypeID;
    private String Title;
    private String ArticleNumber;

    public Mask(int ID, int minCostForAgent, String productTypeID, String title, String articleNumber) {
        this.ID = ID;
        MinCostForAgent = minCostForAgent;
        ProductTypeID = productTypeID;
        Title = title;
        ArticleNumber = articleNumber;
    }

    protected Mask(Parcel in) {
        ID = in.readInt();
        MinCostForAgent = in.readInt();
        ProductTypeID = in.readString();
        Title = in.readString();
        ArticleNumber = in.readString();
    }

    public static final Creator<Mask> CREATOR = new Creator<Mask>() {
        @Override
        public Mask createFromParcel(Parcel in) {
            return new Mask(in);
        }

        @Override
        public Mask[] newArray(int size) {
            return new Mask[size];
        }
    };


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMinCostForAgent(int minCostForAgent) {
        MinCostForAgent = minCostForAgent;
    }

    public void setProductTypeID(String productTypeID) {
        ProductTypeID = productTypeID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setArticleNumber(String articleNumber) {
        ArticleNumber = articleNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ID);
        parcel.writeInt(MinCostForAgent);
        parcel.writeString(ProductTypeID);
        parcel.writeString(Title);
        parcel.writeString(ArticleNumber);
    }

    public int getMinCostForAgent() {
        return MinCostForAgent;
    }

    public String getProductTypeID() {
        return ProductTypeID;
    }

    public String getTitle() {
        return Title;
    }

    public String getArticleNumber() {
        return ArticleNumber;
    }

    public int getID() {
        return ID;
    }
}
