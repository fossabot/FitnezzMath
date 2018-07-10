package com.io.fitnezz.protocol;

public class Faulkner extends BaseProtocol {

    private Faulkner() {
    }

    /**
     * Method to calculate Fat Percentage
     *
     * @param triceps     - Triceps
     * @param subscapular - Subscapular
     * @param suprailiac  - Suprailiac
     * @param abdominal   - Abdominal
     * @return Fat Percentage
     */
    public static Double fatPercentage(double triceps, double subscapular, double suprailiac, double abdominal) {
        if (triceps > 0 && subscapular > 0 && suprailiac > 0 && abdominal > 0) {
            return (triceps + subscapular + suprailiac + abdominal) * 0.153 + 5.783;
        }

        return null;
    }

}