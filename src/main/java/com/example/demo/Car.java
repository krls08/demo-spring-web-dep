package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    @JsonProperty("color")
    public String color;
    @JsonProperty("type")
    private String type;

    // standard getters setters
    public String getType(){
        return this.type;
    }
}