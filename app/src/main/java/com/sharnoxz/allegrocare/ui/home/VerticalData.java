package com.sharnoxz.allegrocare.ui.home;


import java.util.ArrayList;

public class VerticalData {
    private ArrayList<HorizontalData> horizontalData;
    private String title,appDetails;
    private int appIcon;
    private boolean detailsOfApp;

    public VerticalData(ArrayList<HorizontalData> horizontalData, String title, String appDetails, int appIcon, boolean detailsOfApp) {
        this.horizontalData = horizontalData;
        this.title = title;
        this.appDetails = appDetails;
        this.appIcon = appIcon;
        this.detailsOfApp = detailsOfApp;
    }


    public ArrayList<HorizontalData> getHorizontalData() {
        return horizontalData;
    }

    public void setHorizontalData(ArrayList<HorizontalData> horizontalData) {
        this.horizontalData = horizontalData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAppDetails() {
        return appDetails;
    }

    public void setAppDetails(String appDetails) {
        this.appDetails = appDetails;
    }

    public int getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(int appIcon) {
        this.appIcon = appIcon;
    }

    public boolean isDetailsOfApp() {
        return detailsOfApp;
    }

    public void setDetailsOfApp(boolean detailsOfApp) {
        this.detailsOfApp = detailsOfApp;
    }
}
