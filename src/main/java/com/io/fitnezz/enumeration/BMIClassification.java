package com.io.fitnezz.enumeration;

public enum BMIClassification {

    UNDERWEIGHT_III("Underweight III"),
    UNDERWEIGHT_II("Underweight II"),
    UNDERWEIGHT_I("Underweight I"),
    NORMAL("Normal"),
    OVERWEIGHT_I("Overweight I"),
    OVERWEIGHT_II("Overweight II"),
    OVERWEIGHT_III("Overweight III");

    String value;

    BMIClassification(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
