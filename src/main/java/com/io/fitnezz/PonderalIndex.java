package com.io.fitnezz;

public class PonderalIndex {

    private PonderalIndex() {
    }

    /**
     * Method to calculate Ponderal Index
     *
     * @param weight - Body Weight
     * @param height - Human Height
     * @return Ponderal Index
     */
    public static Double calculate(Double weight, Double height) {

        if (weight > 0 && height > 0) {
            double heightInCentimeters = height * 100;
            double weightPowered = Math.pow(weight, 0.3333333);
            return heightInCentimeters / weightPowered;
        }

        return null;
    }

}