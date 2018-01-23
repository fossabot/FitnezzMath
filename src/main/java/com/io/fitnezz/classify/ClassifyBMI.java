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
            colorHex = RED_COLOR_HEX;
            classification = BMIClassification.UNDERWEIGHT_III.toString();
        } else if (bmi >= 16 && bmi < 17) {
            colorHex = ORANGE_COLOR_HEX;
            classification = BMIClassification.UNDERWEIGHT_II.toString();
        } else if (bmi >= 17 && bmi < 18.50) {
            colorHex = YELLOW_COLOR_HEX;
            classification = BMIClassification.UNDERWEIGHT_I.toString();
        } else if (bmi >= 18.50 && bmi < 25) {
            colorHex = GREEN_COLOR_HEX;
            classification = BMIClassification.NORMAL.toString();
        } else if (bmi >= 25 && bmi < 30) {
            colorHex = YELLOW_COLOR_HEX;
            classification = BMIClassification.OVERWEIGHT_I.toString();
        } else if (bmi >= 30 && bmi < 40) {
            colorHex = ORANGE_COLOR_HEX;
            classification = BMIClassification.OVERWEIGHT_II.toString();
        } else if (bmi >= 40) {
            colorHex = RED_COLOR_HEX;
            classification = BMIClassification.OVERWEIGHT_III.toString();
        }
    }

}
