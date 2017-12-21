package com.io.fitnezz;

public class Somatotype {

    private Somatotype() {
    }

    /**
     * Method to calculate Endomorphy
     *
     * @param triceps      - Triceps
     * @param subscapular  - Subscapular
     * @param supraspinale - Supraspinale
     * @param height       - Human Height
     * @return Endomorphy
     */
    public static Double endomorphy(double triceps, double subscapular, double supraspinale, double height) {

        if (triceps > 0 && subscapular > 0 && supraspinale > 0 && height > 0) {
            double calculusEndomorphy = ((triceps + subscapular + supraspinale) * 170.18) / (height * 100);

            return (calculusEndomorphy * 0.1451)
                    - ((Math.pow(calculusEndomorphy, 2)) * 0.00068)
                    + ((Math.pow(calculusEndomorphy, 3)) * 0.0000014) - 0.7182;
        }

        return null;
    }

    /**
     * Method to calculate Mesomorphy
     *
     * @param bicondylarHumerus - Bicondylar Humerus
     * @param bicondylarFemur   - Bicondylar Femur
     * @param rightArm          - Right Arm
     * @param triceps           - Triceps
     * @param rightCalfBC       - Right Calf circumference
     * @param calfSF            - Calf Skin Fold
     * @param height            - Human Height
     * @return Mesomorphy
     */
    public static Double mesomorphy(double bicondylarHumerus, double bicondylarFemur,
                                    double rightArm, double triceps, double rightCalfBC,
                                    double calfSF, double height) {

        if (bicondylarHumerus > 0 && bicondylarFemur > 0 && rightArm > 0 && triceps > 0
                && rightCalfBC > 0 && calfSF > 0 && height > 0) {

            double partOneMesomorphy = (0.858 * bicondylarHumerus)
                    + (0.601 * bicondylarFemur) + (0.188 * (rightArm - (triceps / 10)));

            double partTwoMesomorphy = (0.161 * (rightCalfBC - (calfSF / 10)))
                    - (0.131 * height * 100) + 4.5;

            return partOneMesomorphy + partTwoMesomorphy;
        }

        return null;
    }

    /**
     * Method to calculate Ectomorphy
     *
     * @param ponderalIndex - Ponderal Index
     * @return Ectomorphy
     */
    public static Double ectomorphy(double ponderalIndex) {
        if (ponderalIndex > 0) {

            double ectomorphy;

            if (ponderalIndex >= 40.75) {
                ectomorphy = (0.732 * ponderalIndex) - 28.58;
            } else if (ponderalIndex < 40.75 && ponderalIndex > 38.25) {
                ectomorphy = (0.463 * ponderalIndex) - 17.63;
            } else {
                ectomorphy = 0.1;
            }
            return ectomorphy;
        }

        return null;
    }

}
