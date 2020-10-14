package com.james;

public class Veggie {
    public String name = "";
    public double fiberContent = 0;
    public int calories = 0;
    public String color = "";

    public Veggie(String name, double fiberContent, int calories, String color) {
        this.name = name;
        this.fiberContent = fiberContent;
        this.calories = calories;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Veggie{" +
                "name='" + name + '\'' +
                ", fiberContent=" + fiberContent +
                ", calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }


}
