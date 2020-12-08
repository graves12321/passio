package com.cmajor7.passio.DTO;

public class TinTuc {
    private int image;
    private String Title;
    private String Description;

    public TinTuc(int image, String title, String description) {
        this.image = image;
        Title = title;
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
