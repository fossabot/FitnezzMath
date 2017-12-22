package com.io.fitnezz;

import com.io.fitnezz.util.Utils;

public class PollockThree {

    private PollockThree() {
    }

    /**
     * Method to calculate sum of Pollock Three Skin Folds
     *
     * @param abdominal    - Abdominal
     * @param thighPollock - Thigh
     * @param chest        - Chest
     * @return Sum of Pollock Three Skin Folds
     */
    public static Double sum(double abdominal, double thighPollock, double chest) {
        if (abdominal > 0 && thighPollock > 0 && chest > 0) {
            return abdominal + thighPollock + chest;
        }

        return null;
    }

    /**
     * Method to calculate Fat Percentage
     *
     * @param age    - Age
     * @param sum    - Sum of Pollock Three Skin Folds
     * @param isMale - true for Male and false for Female
     * @return Fat Percentage
     */
    public static Double fatPercentage(int age, double sum, boolean isMale) {
        if (age > 0 && sum > 0) {
            double bodyDensity = isMale ?
                    calculateFatPercentageForMale(age, sum) :
                    calculateFatPercentageForFemale(age, sum);

            return ((4.95 / bodyDensity) - 4.5) * 100;
        }

        return null;
    }

    /**
     * Method to calculate Fat Weight
     *
     * @param fatPercentage - Fat Percentage
     * @param bodyWeight    - Body Weight
     * @return Fat Weight
     */
    public static Double fatWeight(double fatPercentage, double bodyWeight) {
        if (bodyWeight > 0 && fatPercentage > 0) {
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

    private static double calculateFatPercentageForFemale(int age, double sum) {
        return 1.0994921 - (0.0009929 * sum) + (0.0000023 * (Math.pow(sum, 2))) - (0.0001392 * age);
    }

    private static double calculateFatPercentageForMale(int age, double sum) {
        return 1.1093800 - (0.0008267 * sum) + (0.0000016 * (Math.pow(sum, 2))) - (0.0002574 * age);
    }

}
