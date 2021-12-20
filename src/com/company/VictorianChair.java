package com.company;

public class VictorianChair implements Chair{
    private String material;
    @Override
    public String sit() {
        return "Nice! You are sitting on a victorian chair!";
    }
    @Override
    public String get_chair() {
        return "This is a victorian chair!";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}