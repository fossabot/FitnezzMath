package com.io.fitnezz.util;

public class Utils {

    private Utils() {
    }

    /**
     * Method to calculate Fat Weight.
     * to: Faulkner, Guedes, Pollock3 and Pollock7
     *
     * @param bodyWeight    - Body Weight
     * @param fatPercentage - Fat Percentage
     * @return Fat Weight
     */
    public static double calculateFatWeight(double bodyWeight, double fatPercentage) {
        return (bodyWeight * fatPercentage) / 100;
    }

    /**
     * Method to calculate Lean Body Mass
     *
     * @param bodyWeight - Body Weight
     * @param fatWeight  - Fat Weight
     * @return Lean Body Mass
     */
    public static double calculateLeanBodyMass(double bodyWeight, double fatWeight) {
        return bodyWeight - fatWeight;
    }

    /**
     * Method to calculate Muscle Weight.
     * to: Faulkner, Guedes, Pollock3 and Pollock7
     *
     * @param bodyWeight     - Body Weight
     * @param fatWeight      - Fat Weight
     * @param boneWeight     - Bone Weight
     * @param residualWeight - Residual Weight
     * @return Muscle Weight
     */
    public static double calculateMuscleWeight(double bodyWeight, double fatWeight, double boneWeight, double residualWeight) {
        return bodyWeight - (residualWeight - boneWeight - fatWeight);
    }

}
