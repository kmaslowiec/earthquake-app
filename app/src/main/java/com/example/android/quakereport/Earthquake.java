package com.example.android.quakereport;

public class Earthquake {

    private double mMag;
    private String mPlace;
    private String mDate;

    public Earthquake(double mMag, String mPlace, String mDate) {
        this.mMag = mMag;
        this.mPlace = mPlace;
        this.mDate = mDate;
    }

    public double getmMag() {
        return mMag;
    }

    public void setmMag(double mMag) {
        this.mMag = mMag;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
