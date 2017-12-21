package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.BMIClassification;

public class ClassifyBMI extends Classify {

    /**
     * Method to classify Body Mass Index
     *
     * @param bmi - Body Mass Index
     */
    public void classify(double bmi) {

        // Source: http://apps.who.int/bmi/index.jsp?introPage=intro_3.html
        if (bmi < 16) {
            colorHex = "#D50000";
            classification = BMIClassification.UNDERWEIGHT_III.getValue();
        } else if (bmi >= 16 && bmi < 17) {
            colorHex = "#FF6D00";
            classification = BMIClassification.UNDERWEIGHT_II.getValue();
        } else if (bmi >= 17 && bmi < 18.50) {
            colorHex = "#FFC400";
            classification = BMIClassification.UNDERWEIGHT_I.getValue();
        } else if (bmi >= 18.50 && bmi < 25) {
            colorHex = "#4CAF50";
            classification = BMIClassification.NORMAL.getValue();
        } else if (bmi >= 25 && bmi < 30) {
            colorHex = "#FFC400";
            classification = BMIClassification.OVERWEIGHT_I.getValue();
        } else if (bmi >= 30 && bmi < 40) {
            colorHex = "#FF6D00";
            classification = BMIClassification.OVERWEIGHT_II.getValue();
        } else if (bmi >= 40) {
            colorHex = "#D50000";
            classification = BMIClassification.OVERWEIGHT_III.getValue();
        }
    }

}
