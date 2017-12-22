package com.io.fitnezz;

import com.io.fitnezz.util.Utils;

public class Faulkner {


    /**
     * Method to calculate Fat Percentage
     *
     * @param triceps     - Triceps
     * @param subscapular - Subscapular
     * @param suprailiac  - Suprailiac
     * @param abdominal   - Abdominal
     * @return Fat Percentage
     */
    public Double fatPercentage(double triceps, double subscapular, double suprailiac, double abdominal) {
        if (triceps > 0 && subscapular > 0 && suprailiac > 0 && abdominal > 0) {
            return (triceps + subscapular + suprailiac + abdominal) * 0.153 + 5.783;
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
    public Double fatWeight(double bodyWeight, double fatPercentage) {
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
    public Double leanBodyMass(double bodyWeight, double fatWeight) {
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
    public Double muscleWeight(double bodyWeight, double residualWeight, double boneWeight, double fatWeight) {
        if (bodyWeight > 0 && residualWeight > 0 && boneWeight > 0 && fatWeight > 0) {
            return Utils.calculateMuscleWeight(bodyWeight, fatWeight, boneWeight, residualWeight);
        }

        return null;
    }

}
