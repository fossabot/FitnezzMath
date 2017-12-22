package com.io.fitnezz;

public class BoneWeight {

    private BoneWeight() {
    }

    /**
     * Method to calculate Bone Weight
     *
     * @param height          - Human height
     * @param biStyloid       - Bi-styloid diameter (Wrist)
     * @param bicondylarFemur - Bicondylar Femur diameter (Knee)
     * @return Bone Weight
     */
    public static Double calculate(double height, double biStyloid, double bicondylarFemur) {
        if (height > 0 && biStyloid > 0 && bicondylarFemur > 0) {
            double calculus = Math.pow(height, 2) * (biStyloid / 100) * (bicondylarFemur / 100) * 400;
            return 3.02 * Math.pow(calculus, 0.712);
        }

        return null;
    }

}