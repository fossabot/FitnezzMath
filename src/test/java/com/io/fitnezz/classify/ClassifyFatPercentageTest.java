package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.FatPercentageClassification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassifyFatPercentageTest {

    private ClassifyFatPercentage classifyFatPercentage;

    @Before
    public void init() {
        classifyFatPercentage = new ClassifyFatPercentage();
        Assert.assertEquals("", classifyFatPercentage.colorHex);
        Assert.assertEquals("", classifyFatPercentage.classification);
        Assert.assertArrayEquals(new String[]{}, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 25 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil25Excellent() {
        double fatPercentage = 10.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25Good() {
        double fatPercentage = 18.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25AboveAverage() {
        double fatPercentage = 21.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25Average() {
        double fatPercentage = 23.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25BelowAverage() {
        double fatPercentage = 27.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25Bad() {
        double fatPercentage = 30.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil25VeryBad() {
        double fatPercentage = 32.0D;
        int age = 18;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 35 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil35Excellent() {
        double fatPercentage = 12.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35Good() {
        double fatPercentage = 18.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35AboveAverage() {
        double fatPercentage = 21.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35Average() {
        double fatPercentage = 24.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35BelowAverage() {
        double fatPercentage = 27.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35Bad() {
        double fatPercentage = 30.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil35VeryBad() {
        double fatPercentage = 34.0D;
        int age = 30;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 45 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil45Excellent() {
        double fatPercentage = 15.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45Good() {
        double fatPercentage = 21.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45AboveAverage() {
        double fatPercentage = 24.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45Average() {
        double fatPercentage = 27.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45BelowAverage() {
        double fatPercentage = 31.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45Bad() {
        double fatPercentage = 34.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil45VeryBad() {
        double fatPercentage = 37.0D;
        int age = 40;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 55 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil55Excellent() {
        double fatPercentage = 18.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55Good() {
        double fatPercentage = 23.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55AboveAverage() {
        double fatPercentage = 27.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55Average() {
        double fatPercentage = 30.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55BelowAverage() {
        double fatPercentage = 32.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55Bad() {
        double fatPercentage = 36.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil55VeryBad() {
        double fatPercentage = 39.0D;
        int age = 50;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_55_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 65 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleUntil65Excellent() {
        double fatPercentage = 20.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65Good() {
        double fatPercentage = 24.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65AboveAverage() {
        double fatPercentage = 28.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65Average() {
        double fatPercentage = 31.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65BelowAverage() {
        double fatPercentage = 33.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65Bad() {
        double fatPercentage = 37.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleUntil65VeryBad() {
        double fatPercentage = 40.0D;
        int age = 60;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_UNTIL_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Female - Until 65 YO
    // -----------------------------------------------------

    @Test
    public void classifyFemaleOver65Excellent() {
        double fatPercentage = 18.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65Good() {
        double fatPercentage = 24.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65AboveAverage() {
        double fatPercentage = 28.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65Average() {
        double fatPercentage = 31.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65BelowAverage() {
        double fatPercentage = 33.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65Bad() {
        double fatPercentage = 36.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyFemaleOver65VeryBad() {
        double fatPercentage = 39.0D;
        int age = 70;

        classifyFatPercentage.female(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.FEMALE_OVER_65_YO, classifyFatPercentage.getPercentageLevels());
    }


    // -----------------------------------------------------
    //                  Male - Until 25 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil25Excellent() {
        double fatPercentage = 4.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25Good() {
        double fatPercentage = 7.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25AboveAverage() {
        double fatPercentage = 11.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25Average() {
        double fatPercentage = 15.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25BelowAverage() {
        double fatPercentage = 18.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25Bad() {
        double fatPercentage = 22.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil25VeryBad() {
        double fatPercentage = 26.0D;
        int age = 18;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_25_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Male - Until 35 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil35Excellent() {
        double fatPercentage = 9.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35Good() {
        double fatPercentage = 13.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35AboveAverage() {
        double fatPercentage = 17.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35Average() {
        double fatPercentage = 19.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35BelowAverage() {
        double fatPercentage = 22.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35Bad() {
        double fatPercentage = 26.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil35VeryBad() {
        double fatPercentage = 28.0D;
        int age = 30;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_35_YO, classifyFatPercentage.getPercentageLevels());
    }

    // -----------------------------------------------------
    //                  Male - Until 45 YO
    // -----------------------------------------------------

    @Test
    public void classifyMaleUntil45Excellent() {
        double fatPercentage = 12.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.EXCELLENT.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45Good() {
        double fatPercentage = 16.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.GOOD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45AboveAverage() {
        double fatPercentage = 19.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.ABOVE_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45Average() {
        double fatPercentage = 22.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45BelowAverage() {
        double fatPercentage = 24.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BELOW_AVERAGE.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45Bad() {
        double fatPercentage = 27.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

    @Test
    public void classifyMaleUntil45VeryBad() {
        double fatPercentage = 31.0D;
        int age = 40;

        classifyFatPercentage.male(fatPercentage, age);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyFatPercentage.getColorHex());
        Assert.assertEquals(FatPercentageClassification.VERY_BAD.toString(), classifyFatPercentage.getClassification());
        Assert.assertArrayEquals(ClassifyFatPercentage.MALE_UNTIL_45_YO, classifyFatPercentage.getPercentageLevels());
    }

}