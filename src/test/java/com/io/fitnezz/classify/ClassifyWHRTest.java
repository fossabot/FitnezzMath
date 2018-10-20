package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.WHRClassification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassifyWHRTest {

    private ClassifyWHR classifyWHR;

    @Before
    public void init() {
        classifyWHR = new ClassifyWHR();
        Assert.assertEquals("", classifyWHR.colorHex);
        Assert.assertEquals("", classifyWHR.classification);
        Assert.assertNull(classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Female - Until 29 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil29Normal() {
        double whr = 0.70D;
        int age = 18;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil29Light() {
        double whr = 0.75D;
        int age = 18;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil29Moderate() {
        double whr = 0.80D;
        int age = 18;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil29Severe() {
        double whr = 0.85D;
        int age = 18;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Female - Until 39 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil39Normal() {
        double whr = 0.71D;
        int age = 35;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil39Light() {
        double whr = 0.76D;
        int age = 35;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil39Moderate() {
        double whr = 0.80D;
        int age = 35;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil39Severe() {
        double whr = 0.87D;
        int age = 35;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Female - Until 49 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil49Normal() {
        double whr = 0.71D;
        int age = 45;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil49Light() {
        double whr = 0.75D;
        int age = 45;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil49Moderate() {
        double whr = 0.85D;
        int age = 45;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil49Severe() {
        double whr = 0.89D;
        int age = 45;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Female - Until 59 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil59Normal() {
        double whr = 0.70D;
        int age = 55;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil59Light() {
        double whr = 0.76D;
        int age = 55;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil59Moderate() {
        double whr = 0.85D;
        int age = 55;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleUntil59Severe() {
        double whr = 0.89D;
        int age = 55;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Female - Over 60 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleOver60Normal() {
        double whr = 0.72D;
        int age = 65;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleOver60Light() {
        double whr = 0.80D;
        int age = 65;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleOver60Moderate() {
        double whr = 0.85D;
        int age = 65;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyFemaleOver60Severe() {
        double whr = 0.91D;
        int age = 65;

        classifyWHR.female(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.FEMALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }



    // -----------------------------------------------------
    //                  Male - Until 29 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil29Normal() {
        double whr = 0.80D;
        int age = 18;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil29Light() {
        double whr = 0.85D;
        int age = 18;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil29Moderate() {
        double whr = 0.92D;
        int age = 18;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil29Severe() {
        double whr = 0.96D;
        int age = 18;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_29_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Male - Until 39 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil39Normal() {
        double whr = 0.81D;
        int age = 35;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil39Light() {
        double whr = 0.86D;
        int age = 35;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil39Moderate() {
        double whr = 0.93D;
        int age = 35;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil39Severe() {
        double whr = 0.97D;
        int age = 35;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_39_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Male - Until 49 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil49Normal() {
        double whr = 0.85D;
        int age = 45;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil49Light() {
        double whr = 0.90D;
        int age = 45;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil49Moderate() {
        double whr = 0.97D;
        int age = 45;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil49Severe() {
        double whr = 1.01D;
        int age = 45;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_49_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Male - Until 59 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil59Normal() {
        double whr = 0.85D;
        int age = 55;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil59Light() {
        double whr = 0.93D;
        int age = 55;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil59Moderate() {
        double whr = 1.00D;
        int age = 55;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleUntil59Severe() {
        double whr = 1.05D;
        int age = 55;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_UNTIL_59_YO, classifyWHR.getWhrLevelsClassification());
    }

    // -----------------------------------------------------
    //                  Male - Over 60 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleOver60Normal() {
        double whr = 0.88D;
        int age = 65;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.NORMAL.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleOver60Light() {
        double whr = 0.95D;
        int age = 65;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.LIGHT.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleOver60Moderate() {
        double whr = 1.01D;
        int age = 65;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.MODERATE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }

    @Test
    public void classifyMaleOver60Severe() {
        double whr = 1.05D;
        int age = 65;

        classifyWHR.male(whr, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyWHR.getColorHex());
        Assert.assertEquals(WHRClassification.SEVERE.toString(), classifyWHR.getClassification());
        Assert.assertArrayEquals(ClassifyWHR.MALE_OVER_60_YO, classifyWHR.getWhrLevelsClassification());
    }


}
