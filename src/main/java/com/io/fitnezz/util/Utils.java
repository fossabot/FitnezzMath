package com.io.fitnezz.util;

public class Utils {

    private Utils() {
    }

    /**
     * Method to calculate Fat Weight.
     * to: Faulkner, Guedes, Pollock3 and Pollock7
     *
     * @param weight        - Body Weight
     * @param fatPercentage - Fat Percentage
     * @return Fat Weight
     */
    public static double calculateFatWeight(double weight, double fatPercentage) {
        return (weight * fatPercentage) / 100;
    }

    /**
     * Method to calculate Lean Body Mass
     *
     * @param weight    - Body Weight
     * @param fatWeight - Fat Weight
     * @return Lean Body Mass
     */
    public static double calculateLeanBodyMass(double weight, double fatWeight) {
        return weight - fatWeight;
    }

    /**
     * Method to calculate Muscle Weight.
     * to: Faulkner, Guedes, Pollock3 and Pollock7
     *
     * @param weight         - Body Weight
     * @param fatWeight      - Fat Weight
     * @param boneWeight     - Bone Weight
     * @param residualWeight - Residual Weight
     * @return Muscle Weight
     */
    public static double calculateMuscleWeight(double weight, double fatWeight, double boneWeight, double residualWeight) {
        return weight - (residualWeight - boneWeight - fatWeight);
    }

}
