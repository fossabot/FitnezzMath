package com.io.fitnezz.protocol;

public class PollockThree extends BaseProtocol {

    private PollockThree() {
    }

    /**
     * Method to calculate Female sum of Pollock Three Skin Folds
     *
     * @param triceps    - Triceps
     * @param thigh      - Thigh
     * @param suprailiac - Suprailiac
     * @return Female Sum of Pollock Three Skin Folds
     */
    public static Double sumFemale(double triceps, double thigh, double suprailiac) {
        if (triceps > 0 && suprailiac > 0 && thigh > 0) {
            return triceps + suprailiac + thigh;
        }

        return null;
    }

    /**
     * Method to calculate Male sum of Pollock Three Skin Folds
     *
     * @param abdominal - Abdominal
     * @param thigh     - Thigh
     * @param chest     - Chest
     * @return Male Sum of Pollock Three Skin Folds
     */
    public static Double sumMale(double abdominal, double thigh, double chest) {
        if (abdominal > 0 && thigh > 0 && chest > 0) {
            return abdominal + thigh + chest;
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

    private static double calculateFatPercentageForFemale(int age, double sum) {
        return 1.0994921 - (0.0009929 * sum) + (0.0000023 * (Math.pow(sum, 2))) - (0.0001392 * age);
    }

    private static double calculateFatPercentageForMale(int age, double sum) {
        return 1.1093800 - (0.0008267 * sum) + (0.0000016 * (Math.pow(sum, 2))) - (0.0002574 * age);
    }

}