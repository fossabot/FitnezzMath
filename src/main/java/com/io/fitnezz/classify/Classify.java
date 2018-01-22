package com.io.fitnezz.classify;

abstract class Classify {

    String classification = "";
    String colorHex = "";

    static final String RED_COLOR_HEX = "#D50000";
    static final String ORANGE_COLOR_HEX = "#FF6D00";
    static final String YELLOW_COLOR_HEX = "#FFC400";
    static final String GREEN_COLOR_HEX = "#4CAF50";

    public String getClassification() {
        return classification;
    }

    public String getColorHex() {
        return colorHex;
    }

}
