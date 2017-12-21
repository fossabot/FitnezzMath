package com.io.fitnezz;

public class BodyMassIndex {

    private BodyMassIndex() {
    }

    /**
     * Method to calculate Body Mass Index
     *
     * @param weight - Body Weight
     * @param height - Human Height
     * @return Body Mass Index
     */
    public static Double calculate(Double weight, Double height) {

        if (weight > 0 && height > 0) {
            double heightSquared = Math.pow(height, 2);

            return (weight / heightSquared);
        }

        return null;
    }

}