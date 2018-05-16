package com.example.android.quakereport;

public class Earthquake {

    private double mMag;
    private String mPlace;
    private Long mDate;
    private String mUrl;



    public Earthquake(double mMag, String mPlace, Long mDate, String mUrl) {
        this.mMag = mMag;
        this.mPlace = mPlace;
        this.mDate = mDate;
        this.mUrl = mUrl;

    }

    public double getmMag() {
        return mMag;
    }


    public String getmPlace() {
        return mPlace;
    }

    public Long getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

}
