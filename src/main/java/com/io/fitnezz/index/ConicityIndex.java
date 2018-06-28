package com.io.fitnezz.index;

public class ConicityIndex {

    private ConicityIndex() {
    }

    /**
     * Method to calculate Conicity Index
     *
     * @param bodyWeight - Body Weight
     * @param height     - Human Height
     * @param waist      - Waist circumference
     * @return Conicity Index
     */
    public static Double calculate(double bodyWeight, double height, double waist) {
        if (bodyWeight > 0 && height > 0 && waist > 0) {
            double sqrt = Math.sqrt(bodyWeight / height);
            double base = Math.pow(sqrt, 0.109);
            return (waist / 100) / base;
        }

        return null;
    }

}