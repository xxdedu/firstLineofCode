package com.example.recyclerviewtest;

/**
 * 作为适配器的适配类型
 */
public class Fruit {

    private String name;

    /**
     * 水果对应图片的资源id
     */
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
