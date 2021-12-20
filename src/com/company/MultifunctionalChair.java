package com.company;

public class MultifunctionalChair  implements Chair{
    private String material;
    @Override
    public String get_chair() {
        return "This is multifunctional chair!";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String sit() {
        return "Nice! You sit on multifunctional chair!";
    }

}