package com.io.fitnezz.protocol;

public class Guedes extends BaseProtocol {

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

}