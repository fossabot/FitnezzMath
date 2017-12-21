package com.io.fitnezz;

public class ResidualWeight {

    private ResidualWeight() {
    }

    /**
     * Method to calculate Residual Weight
     *
     * @param weight    - Body Weight
     * @param isMaleSex - true for Male and false for Female
     * @return Peso Residual
     */
    public static Double calculate(double weight, boolean isMaleSex) {

        if (weight > 0) {
            return isMaleSex ? calculateMaleResidualWeight(weight) : calculateFemaleResidualWeight(weight);
        }

        return null;
    }

    private static double calculateMaleResidualWeight(double weight) {
        return (weight * 20.9D) / 100D;
    }

    private static double calculateFemaleResidualWeight(double weight) {
        return (weight * 24.1D) / 100D;
    }

}