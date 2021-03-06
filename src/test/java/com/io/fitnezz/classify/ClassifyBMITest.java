package com.io.fitnezz.classify;

import com.io.fitnezz.enumeration.BMIClassification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassifyBMITest {

    private ClassifyBMI classifyBMI;

    @Before
    public void init(){
        classifyBMI = new ClassifyBMI();
        Assert.assertEquals("", classifyBMI.colorHex);
        Assert.assertEquals("", classifyBMI.classification);
    }

    @Test
    public void classifyUnderweightIII() {
        double bmi = 15D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.UNDERWEIGHT_III.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyUnderweightII() {
        double bmi = 16.5D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.UNDERWEIGHT_II.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyUnderweightI() {
        double bmi = 17.5D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.UNDERWEIGHT_I.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyNormal() {
        double bmi = 19D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.GREEN_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.NORMAL.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyOverweightI() {
        double bmi = 27D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.YELLOW_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.OVERWEIGHT_I.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyOverweightII() {
        double bmi = 35D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.ORANGE_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.OVERWEIGHT_II.toString(), classifyBMI.getClassification());
    }

    @Test
    public void classifyOverweightIII() {
        double bmi = 41D;

        classifyBMI.classify(bmi);
        Assert.assertEquals(Classify.RED_COLOR_HEX, classifyBMI.getColorHex());
        Assert.assertEquals(BMIClassification.OVERWEIGHT_III.toString(), classifyBMI.getClassification());
    }

}