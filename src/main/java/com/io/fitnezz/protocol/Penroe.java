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
    public Double fatPercentage(double bodyWeight, double height, double leanBodyMass,
                                double hip, double abdomen, boolean isMaleSex) {

        if (!isMaleSex && hip > 0 && height > 0 && abdomen > 0) {
            return (0.55 * hip) - (0.24 * height) + (0.28 * abdomen) - 8.43;
        } else if (isMaleSex && bodyWeight > 0 && hip > 0) {
            return ((bodyWeight - leanBodyMass) / bodyWeight) * 100;
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
        return BaseProtocol.fatWeight(bodyWeight, fatPercentage);
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
    public Double leanBodyMass(double bodyWeight, double abdomen, double fist, double fatWeight, boolean isMaleSex) {
        if (!isMaleSex && bodyWeight > 0 && fatWeight > 0) {
            return BaseProtocol.leanBodyMass(bodyWeight, fatWeight);
        } else if (isMaleSex && abdomen > 0 && fist > 0 && bodyWeight > 0) {
            return (41.955 + (1.038786 * bodyWeight)) - (0.82816 * (abdomen - fist));
        }

        return null;
    }


}
