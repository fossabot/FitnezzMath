package com.io.fitnezz.index;

public class BodyMassIndex {

    private BodyMassIndex() {
    }

    /**
     * Method to calculate Body Mass Index
     *
     * @param bodyWeight - Body Weight
     * @param height     - Human Height
     * @return Body Mass Index
     */
    public static Double calculate(double bodyWeight, double height) {
        if (bodyWeight > 0 && height > 0) {
            double heightSquared = Math.pow(height, 2);

            return (bodyWeight / heightSquared);
        }

        return null;
    }

}