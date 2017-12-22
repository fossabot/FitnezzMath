package com.io.fitnezz;

import com.io.fitnezz.util.Utils;

public class Guedes {

    private Guedes() {
    }

    /**
     * Method to calculate sum of Guedes Three Skin Folds
     *
     * @param triceps    - Triceps
     * @param suprailiac - Suprailiac
     * @param abdominal  - Abdominal
     * @return Sum of Guedes Three Skin Folds
     */
    public static Double sum(double triceps, double suprailiac, double abdominal) {
        if (triceps > 0 && suprailiac > 0 && abdominal > 0) {
            return triceps + suprailiac + abdominal;
        }

        return null;
    }

    /**
     * Method to calculate Fat Percentage
     *
     * @param sum - Sum of Guedes Three Skin Folds
     * @return Fat Percentage
     */
    public static Double fatPercentage(double sum) {
        if (sum > 0) {
            double fatPercentagePartOne = 1.17136 - (Math.log10(sum) * 0.06706);
            return ((4.95 / fatPercentagePartOne) - 4.5) * 100;
        }

        return null;
    }

    /**
     * Method to calculate Fat Weight
     *
     * @param bodyWeight    - Body Weight
     * @param fatPercentage - Fat Percentage
     * @return Fat Weight
     */
    public static Double fatWeight(double bodyWeight, double fatPercentage) {
        if (fatPercentage > 0 && bodyWeight > 0) {
            return Utils.calculateFatWeight(bodyWeight, fatPercentage);
        }

        return null;
    }

    /**
     * Method to calculate Lean Body Mass
     *
     * @param bodyWeight - Body Weight
     * @param fatWeight  - Fat Weight
     * @return Lean Body Mass
     */
    public static Double leanBodyMass(double bodyWeight, double fatWeight) {
        if (bodyWeight > 0 && fatWeight > 0) {
            return Utils.calculateLeanBodyMass(bodyWeight, fatWeight);
        }

        return null;
    }

    /**
     * Method to calculate Muscle Weight
     *
     * @param bodyWeight     - Body Weight
     * @param residualWeight - Residual Weight
     * @param boneWeight     - Bone Weight
     * @param fatWeight      - Fat Weight
     * @return Muscle Weight
     */
    public static Double muscleWeight(double bodyWeight, double residualWeight, double boneWeight, double fatWeight) {
        if (bodyWeight > 0 && residualWeight > 0 && boneWeight > 0 && fatWeight > 0) {
            return Utils.calculateMuscleWeight(bodyWeight, fatWeight, boneWeight, residualWeight);
        }

        return null;
    }

}