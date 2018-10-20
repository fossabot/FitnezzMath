package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.WHRClassification;

public class ClassifyWHR extends Classify {

    protected static final String[] MALE_UNTIL_29_YO = new String[]{"Less than 0.83", "0.83 &#8211; 0.88", "0.89 &#8211; 0.94", "Greater than 0.94"};
    protected static final String[] MALE_UNTIL_39_YO = new String[]{"Less than 0.84", "0.84 &#8211; 0.91", "0.92 &#8211; 0.96", "Greater than 0.96"};
    protected static final String[] MALE_UNTIL_49_YO = new String[]{"Less than 0.88", "0.88 &#8211; 0.95", "0.96 &#8211; 1.00", "Greater than 1.00"};
    protected static final String[] MALE_UNTIL_59_YO = new String[]{"Less than 0.90", "0.90 &#8211; 0.96", "0.97 &#8211; 1.02", "Greater than 1.02"};
    protected static final String[] MALE_OVER_60_YO = new String[]{"Less than 0.91", "0.91 &#8211; 0.98", "0.99 &#8211; 1.03", "Greater than 1.03"};

    protected static final String[] FEMALE_UNTIL_29_YO = new String[]{"Less than 0.71", "0.71 &#8211; 0.77", "0.78 &#8211; 0.82", "Greater than 0.82"};
    protected static final String[] FEMALE_UNTIL_39_YO = new String[]{"Less than 0.72", "0.72 &#8211; 0.78", "0.79 &#8211; 0.84", "Greater than 0.84"};
    protected static final String[] FEMALE_UNTIL_49_YO = new String[]{"Less than 0.73", "0.73 &#8211; 0.79", "0.80 &#8211; 0.87", "Greater than 0.87"};
    protected static final String[] FEMALE_UNTIL_59_YO = new String[]{"Less than 0.74", "0.74 &#8211; 0.81", "0.82 &#8211; 0.88", "Greater than 0.88"};
    protected static final String[] FEMALE_OVER_60_YO = new String[]{"Less than 0.76", "0.76 &#8211; 0.83", "0.84 &#8211; 0.90", "Greater than 0.90"};

    private String[] whrLevelsClassification;
    private double[] levels;


    public String[] getWhrLevelsClassification() {
        return whrLevelsClassification;
    }

    /**
     * Method to classify Waist to Hip Ratio for Female
     *
     * @param whr -  Waist to Hip Ratio
     * @param age - Age
     */
    public void female(double whr, int age) {
        if (age > 0 && age <= 29) {
            whrLevelsClassification = FEMALE_UNTIL_29_YO;
            levels = new double[]{0.71, 0.77, 0.82};
            classify(whr);
        } else if (age >= 30 && age <= 39) {
            whrLevelsClassification = FEMALE_UNTIL_39_YO;
            levels = new double[]{0.72, 0.78, 0.84};
            classify(whr);
        } else if (age >= 40 && age <= 49) {
            whrLevelsClassification = FEMALE_UNTIL_49_YO;
            levels = new double[]{0.73, 0.79, 0.87};
            classify(whr);
        } else if (age >= 50 && age <= 59) {
            whrLevelsClassification = FEMALE_UNTIL_59_YO;
            levels = new double[]{0.74, 0.81, 0.88};
            classify(whr);
        } else if (age >= 60) {
            whrLevelsClassification = FEMALE_OVER_60_YO;
            levels = new double[]{0.76, 0.83, 0.90};
            classify(whr);
        }
    }

    /**
     * Method to classify Waist to Hip Ratio for Male
     *
     * @param whr -  Waist to Hip Ratio
     * @param age - Age
     */
    public void male(double whr, int age) {
        if (age > 0 && age <= 29) {
            whrLevelsClassification = MALE_UNTIL_29_YO;
            levels = new double[]{0.83, 0.88, 0.94};
            classify(whr);
        } else if (age >= 30 && age <= 39) {
            whrLevelsClassification = MALE_UNTIL_39_YO;
            levels = new double[]{0.84, 0.91, 0.96};
            classify(whr);
        } else if (age >= 40 && age <= 49) {
            whrLevelsClassification = MALE_UNTIL_49_YO;
            levels = new double[]{0.88, 0.95, 1.00};
            classify(whr);
        } else if (age >= 50 && age <= 59) {
            whrLevelsClassification = MALE_UNTIL_59_YO;
            levels = new double[]{0.90, 0.96, 1.02};
            classify(whr);
        } else if (age >= 60) {
            whrLevelsClassification = MALE_OVER_60_YO;
            levels = new double[]{0.91, 0.98, 1.03};
            classify(whr);
        }
    }

    private void classify(double whr) {
        if (whr < levels[0]) {
            classification = WHRClassification.NORMAL.toString();
            colorHex = GREEN_COLOR_HEX;
        } else if (whr >= levels[0] && whr < levels[1]) {
            classification = WHRClassification.LIGHT.toString();
            colorHex = YELLOW_COLOR_HEX;
        } else if (whr >= levels[1] && whr < levels[2]) {
            classification = WHRClassification.MODERATE.toString();
            colorHex = ORANGE_COLOR_HEX;
        } else if (whr >= levels[2]) {
            classification = WHRClassification.SEVERE.toString();
            colorHex = RED_COLOR_HEX;
        }
    }

}
