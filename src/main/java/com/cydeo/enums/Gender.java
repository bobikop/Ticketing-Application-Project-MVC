package com.cydeo.enums;

public enum Gender {

    MALE("Male"),          // when we want to have different style the defined by convention (ENUM)
                                //we can use fallowing steps to crete value and then constructor and getter
    FEMALE("Female");


    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
