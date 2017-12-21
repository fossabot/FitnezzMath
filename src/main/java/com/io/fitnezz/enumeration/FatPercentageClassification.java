package com.io.fitnezz.enumeration;

public enum FatPercentageClassification {

    EXCELLENT("Excellent"),
    GOOD("Good"),
    ABOVE_AVERAGE("Above average"),
    AVERAGE("Average"),
    BELOW_AVERAGE("Below average"),
    BAD("Bad"),
    VERY_BAD("Very bad");

    String value;

    FatPercentageClassification(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
