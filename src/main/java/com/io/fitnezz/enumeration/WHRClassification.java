package com.io.fitnezz.enumeration;

public enum WHRClassification {

    SEVERE("Severe"),
    MODERATE("Moderate"),
    LIGHT("Light"),
    NORMAL("Normal");

    String value;

    WHRClassification(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
