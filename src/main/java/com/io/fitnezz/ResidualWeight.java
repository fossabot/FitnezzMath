package com.io.fitnezz;

public class ResidualWeight {

    private ResidualWeight() {
    }

    /**
     * Method to calculate Residual Weight
     *
     * @param bodyWeight - Body Weight
     * @param isMaleSex  - true for Male and false for Female
     * @return Residual Weight
     */
    public static Double calculate(double bodyWeight, boolean isMaleSex) {
        if (bodyWeight > 0) {
            return isMaleSex ? calculateMaleResidualWeight(bodyWeight) : calculateFemaleResidualWeight(bodyWeight);
        }

        return null;
    }

    private static double calculateMaleResidualWeight(double bodyWeight) {
        return (bodyWeight * 20.9D) / 100D;
    }

    private static double calculateFemaleResidualWeight(double bodyWeight) {
        return (bodyWeight * 24.1D) / 100D;
    }

}