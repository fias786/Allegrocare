package com.sharnoxz.allegrocare.ui.home;

public class HorizontalData {

    private int image,expand;
    private String text;

    public HorizontalData(int image, int expand, String text) {
        this.image = image;
        this.expand = expand;
        this.text = text;
    }

    public int getExpand() {
        return expand;
    }

    public void setExpand(int expand) {
        this.expand = expand;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
