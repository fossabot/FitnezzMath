package com.io.fitnezz;

public class WaistHipRatio {

    private WaistHipRatio() {
    }

    /**
     * Method to calculate Waist to Hip Ratio
     *
     * @param waist - Waist circumference
     * @param hip   - Hip circumference
     * @return Waist to Hip Ratio
     */
    public static Double calculate(Double waist, Double hip) {
        if (waist > 0 && hip > 0) {
            return waist / hip;
        }

        return null;
    }

}