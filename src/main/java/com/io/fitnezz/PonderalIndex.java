package com.io.fitnezz;

public class PonderalIndex {

    private PonderalIndex() {
    }

    /**
     * Method to calculate Ponderal Index
     *
     * @param bodyWeight - Body Weight
     * @param height     - Human Height
     * @return Ponderal Index
     */
    public static Double calculate(double bodyWeight, double height) {
        if (bodyWeight > 0 && height > 0) {
            double heightInCentimeters = height * 100;
            double weightPowered = Math.pow(bodyWeight, 0.3333333);
            return heightInCentimeters / weightPowered;
        }

        return null;
    }

}