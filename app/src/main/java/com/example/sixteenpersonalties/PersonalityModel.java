package com.example.sixteenpersonalties;

public class PersonalityModel {
    // This is the data class of our app. It stores the basic details of a cat.
    // THIS ACTS AS A 'MODEL' of MVC architecture
    int image;
    String desc;

    // this is a model class / a data class
    public PersonalityModel(int image, String desc) {
        this.image = image;
        this.desc = desc;
    }
}
