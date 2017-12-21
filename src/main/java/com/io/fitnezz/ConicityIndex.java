package com.io.fitnezz;

public class ConicityIndex {

    private ConicityIndex() {
    }

    /**
     * Method to calculate Conicity Index
     *
     * @param weight - Body Weight
     * @param height - Human Height
     * @param waist  - Waist circumference
     * @return Conicity Index
     */
    public static Double calculate(Double weight, Double height, Double waist) {

        if (weight > 0 && height > 0 && waist > 0) {
            double sqrt = Math.sqrt(weight / height);
            double base = 0.109 * sqrt;
            return (waist / 100) / base;
        }

        return null;
    }

}
