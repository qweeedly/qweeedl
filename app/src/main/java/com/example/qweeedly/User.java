package com.example.qweeedly;

public class User {
    private String name;
    private int ImageId;

    public User(String name, int imageId) {
        this.name = name;
        ImageId = imageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
