package com.io.fitnezz.protocol;

public class Penroe {

    private Penroe() {
    }

    /**
     * Method to calculate Fat Percentage
     *
     * @param bodyWeight   - Body Weight
     * @param height       - Human Height
     * @param leanBodyMass - Lean Body Mass
     * @param hip          - Hip
     * @param abdomen      - Abdomen
     * @param isMaleSex    - true for Male and false for Female
     * @return Fat Percentage
     */
    public static Double fatPercentage(double bodyWeight, double height, double leanBodyMass,
                                       double hip, double abdomen, boolean isMaleSex) {

        return isMaleSex ?
                calculateFatPercentageForMale(bodyWeight, leanBodyMass) :
                calculateFatPercentageForFemale(height, hip, abdomen);
    }

    private static Double calculateFatPercentageForMale(double bodyWeight, double leanBodyMass) {
        if (bodyWeight > 0 && leanBodyMass > 0) {
            return ((bodyWeight - leanBodyMass) / bodyWeight) * 100;
        }

        return null;
    }

    private static Double calculateFatPercentageForFemale(double height, double hip, double abdomen) {
        if (hip > 0 && height > 0 && abdomen > 0) {
            return (0.55 * hip) - (0.24 * height) + (0.28 * abdomen) - 8.43;
        }

        return null;
    }

    /**
     * Method to calculate Lean Body Mass
     *
     * @param bodyWeight - Body Weight
     * @param abdomen    - Abdomen
     * @param fist       - Fist
     * @param fatWeight  - Fat Weight
     * @param isMaleSex  - true for Male and false for Female
     * @return Lean Body Mass
     */
    public static Double leanBodyMass(double bodyWeight, double abdomen, double fist, double fatWeight, boolean isMaleSex) {
        return isMaleSex ?
                calculateLbmForMale(bodyWeight, abdomen, fist) :
                calculateLbmForFemale(bodyWeight, fatWeight);
    }

    private static Double calculateLbmForFemale(double bodyWeight, double fatWeight) {
        return BaseProtocol.leanBodyMass(bodyWeight, fatWeight);
    }

    private static Double calculateLbmForMale(double bodyWeight, double abdomen, double fist) {
        if (bodyWeight > 0 && abdomen > 0 && fist > 0) {
            return (41.955 + (1.038786 * bodyWeight)) - (0.82816 * (abdomen - fist));
        }

        return null;
    }

}