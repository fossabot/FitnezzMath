package com.io.fitnezz.protocol;

public class PollockSeven extends BaseProtocol {

    private PollockSeven() {
    }

    /**
     * Method to calculate sum of Pollock Seven Skin Folds
     *
     * @param triceps      - Triceps
     * @param subscapular  - Subscapular
     * @param axillary     - Axillary
     * @param suprailiac   - Suprailiac
     * @param abdominal    - Abdominal
     * @param thighPollock - Thigh
     * @param chest        - Chest
     * @return Sum of Pollock Seven Skin Folds
     */
    public static Double sum(double triceps, double subscapular, double axillary, double suprailiac,
                             double abdominal, double thighPollock, double chest) {

        if (triceps > 0 && subscapular > 0 && axillary > 0 && suprailiac > 0 && abdominal > 0 && thighPollock > 0 && chest > 0)
            return triceps + chest + subscapular + axillary + suprailiac + abdominal + thighPollock;
        return null;
    }

    /**
     * Method to calculate Fat Percentage
     *
     * @param age    - Age
     * @param sum    - Sum of Pollock Seven Skin Folds
     * @param isMale - true for Male and false for Female
     * @return Fat Percentage
     */
    public static Double fatPercentage(int age, double sum, boolean isMale) {
        if (age > 0 && sum > 0) {
            double bodyDensity = isMale ?
                    calculateFatPercentageForMale(age, sum) :
                    calculateFatPercentageForFemale(age, sum);
            return (4.95 / bodyDensity - 4.5) * 100;
        }

        return null;
    }

    private static double calculateFatPercentageForFemale(int age, double sum) {
        return 1.0970 - (0.00046971 * sum) + (0.00000056 * (Math.pow(sum, 2))) - (0.00012828 * age);
    }

    private static double calculateFatPercentageForMale(int age, double sum) {
        return 1.11200000 - (0.00043499 * sum) + (0.00000055 * (Math.pow(sum, 2))) - (0.00028826 * age);
    }

}