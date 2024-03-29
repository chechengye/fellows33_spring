package com.weichuang.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Car {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    @Value("路虎")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
