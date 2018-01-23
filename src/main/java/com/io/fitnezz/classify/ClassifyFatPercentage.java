package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.FatPercentageClassification;

public class ClassifyFatPercentage extends Classify {

    private static final String[] MALE_OVER_18_YO = new String[]{"Until 6", "6 &#8211; 10", "10 &#8211; 13", "13 &#8211; 16", "16 &#8211; 20", "20 &#8211; 24", "Greater than 24"};
    private static final String[] MALE_OVER_26_YO = new String[]{"Until 11", "11 &#8211; 15", "15 &#8211; 18", "18 &#8211; 20", "20 &#8211; 24", "24 &#8211; 27", "Greater than 27"};
    private static final String[] MALE_OVER_36_YO = new String[]{"Until 14", "14 &#8211; 18", "18 &#8211; 21", "21 &#8211; 23", "23 &#8211; 25", "25 &#8211; 29", "Greater than 29"};
    private static final String[] MALE_OVER_46_YO = new String[]{"Until 16", "16 &#8211; 20", "20 &#8211; 23", "23 &#8211; 25", "25 &#8211; 27", "27 &#8211; 30", "Greater than 30"};
    private static final String[] MALE_OVER_56_YO = new String[]{"Until 18", "18 &#8211; 21", "21 &#8211; 23", "23 &#8211; 25", "25 &#8211; 27", "27 &#8211; 30", "Greater than 30"};
    private static final String[] MALE_OVER_65_YO = new String[]{"Until 18", "18 &#8211; 21", "21 &#8211; 23", "23 &#8211; 24", "24 &#8211; 26", "26 &#8211; 29", "Greater than 29"};

    private static final String[] FEMALE_OVER_18_YO = new String[]{"Until 16", "16 &#8211; 19", "19 &#8211; 22", "22 &#8211; 25", "25 &#8211; 28", "28 &#8211; 31", "Greater than 31"};
    private static final String[] FEMALE_OVER_26_YO = new String[]{"Until 16", "16 &#8211; 20", "20 &#8211; 23", "23 &#8211; 25", "25 &#8211; 29", "29 &#8211; 33", "Greater than 33"};
    private static final String[] FEMALE_OVER_36_YO = new String[]{"Until 19", "19 &#8211; 23", "23 &#8211; 26", "26 &#8211; 29", "29 &#8211; 32", "32 &#8211; 36", "Greater than 36"};
    private static final String[] FEMALE_OVER_46_YO = new String[]{"Until 21", "21 &#8211; 25", "25 &#8211; 28", "28 &#8211; 31", "31 &#8211; 34", "34 &#8211; 38", "Greater than 38"};
    private static final String[] FEMALE_OVER_56_YO = new String[]{"Until 22", "22 &#8211; 26", "26 &#8211; 29", "29 &#8211; 32", "32 &#8211; 35", "35 &#8211; 38", "Greater than 38"};
    private static final String[] FEMALE_OVER_65_YO = new String[]{"Until 20", "20 &#8211; 26", "26 &#8211; 29", "29 &#8211; 32", "32 &#8211; 34", "34 &#8211; 37", "Greater than 37"};


    private String[] percentageLevels = new String[0];

    public String[] getPercentageLevels() {
        return percentageLevels;
    }

    public void female(double fatPercentage, int age) {
        if (age >= 1 && age <= 25)
            fatPercentageForFemaleUntilTwentyFiveYO(fatPercentage);
        else if (age >= 26 && age <= 35)
            fatPercentageForFemaleUntilThirtyFiveYO(fatPercentage);
        else if (age >= 36 && age <= 45)
            fatPercentageForFemaleUntilFortyFiveYO(fatPercentage);
        else if (age >= 46 && age <= 55)
            fatPercentageForFemaleUntilFiftyFiveYO(fatPercentage);
        else if (age >= 56 && age <= 65)
            fatPercentageForFemaleUntilSixtyFiveYO(fatPercentage);
        else if (age > 65)
            fatPercentageForFemaleOverSixtyFiveYO(fatPercentage);

    }

    public void male(double fatPercentage, int age) {
        if (age >= 1 && age <= 25)
            fatPercentageForMaleUntilTwentyFiveYO(fatPercentage);
        else if (age >= 26 && age <= 35)
            fatPercentageForMaleUntilThirtyFiveYO(fatPercentage);
        else if (age >= 36 && age <= 45)
            fatPercentageForMaleUntilFortyFiveYO(fatPercentage);
        else if (age >= 46 && age <= 55)
            fatPercentageForMaleUntilFiftyFiveYO(fatPercentage);
        else if (age >= 56 && age <= 65)
            fatPercentageForMaleUntilSixtyFiveYO(fatPercentage);
        else if (age > 65)
            fatPercentageForMaleOverSixtyFiveYO(fatPercentage);
    }

    private void fatPercentageForFemaleOverSixtyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_65_YO;
        int[] fatLevels = {0, 20, 26, 29, 32, 34, 37};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForFemaleUntilSixtyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_56_YO;
        int[] fatLevels = {0, 22, 26, 29, 32, 35, 38};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForFemaleUntilFiftyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_46_YO;
        int[] fatLevels = {0, 21, 25, 28, 31, 34, 38};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForFemaleUntilFortyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_36_YO;
        int[] fatLevels = {0, 19, 23, 26, 29, 32, 36};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForFemaleUntilThirtyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_26_YO;
        int[] fatLevels = {0, 16, 20, 23, 25, 29, 33};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForFemaleUntilTwentyFiveYO(double fatPercentage) {
        percentageLevels = FEMALE_OVER_18_YO;
        int[] fatLevels = {0, 16, 19, 22, 25, 28, 31};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleOverSixtyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_65_YO;
        int[] fatLevels = {0, 18, 21, 23, 24, 26, 29};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleUntilSixtyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_56_YO;
        int[] fatLevels = {0, 18, 21, 23, 25, 27, 30};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleUntilFiftyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_46_YO;
        int[] fatLevels = {0, 16, 20, 23, 25, 27, 30};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleUntilFortyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_36_YO;
        int[] fatLevels = {0, 14, 18, 21, 23, 25, 29};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleUntilThirtyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_26_YO;
        int[] fatLevels = {0, 11, 15, 18, 20, 24, 27};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageForMaleUntilTwentyFiveYO(double fatPercentage) {
        percentageLevels = MALE_OVER_18_YO;
        int[] fatLevels = {0, 6, 10, 13, 16, 20, 24};
        fatPercentageHelper(fatPercentage, fatLevels);
    }

    private void fatPercentageHelper(double fatPercentage, int[] fatLevels) {
        if (fatPercentage > fatLevels[0] && fatPercentage <= fatLevels[1])
            setExcellent();
        else if (fatPercentage > fatLevels[1] && fatPercentage <= fatLevels[2])
            setGood();
        else if (fatPercentage > fatLevels[2] && fatPercentage <= fatLevels[3])
            setAboveAverage();
        else if (fatPercentage > fatLevels[3] && fatPercentage <= fatLevels[4])
            setAverage();
        else if (fatPercentage > fatLevels[4] && fatPercentage <= fatLevels[5])
            setBelowAverage();
        else if (fatPercentage > fatLevels[5] && fatPercentage <= fatLevels[6])
            setBad();
        else if (fatPercentage > fatLevels[6])
            setVeryBad();
    }

    private void setVeryBad() {
        classification = FatPercentageClassification.VERY_BAD.toString();
        colorHex = RED_COLOR_HEX;
    }

    private void setBad() {
        classification = FatPercentageClassification.BAD.toString();
        colorHex = RED_COLOR_HEX;
    }

    private void setBelowAverage() {
        classification = FatPercentageClassification.BELOW_AVERAGE.toString();
        colorHex = ORANGE_COLOR_HEX;
    }

    private void setAverage() {
        classification = FatPercentageClassification.AVERAGE.toString();
        colorHex = YELLOW_COLOR_HEX;
    }

    private void setAboveAverage() {
        classification = FatPercentageClassification.ABOVE_AVERAGE.toString();
        colorHex = YELLOW_COLOR_HEX;
    }

    private void setGood() {
        classification = FatPercentageClassification.GOOD.toString();
        colorHex = GREEN_COLOR_HEX;
    }

    private void setExcellent() {
        classification = FatPercentageClassification.EXCELLENT.toString();
        colorHex = GREEN_COLOR_HEX;
    }

}