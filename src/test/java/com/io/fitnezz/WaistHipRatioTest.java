package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

public class WaistHipRatioTest extends BaseTest<WaistHipRatio> {

    public WaistHipRatioTest() {
        this.clazz = WaistHipRatio.class;
    }

    @Test
    public void calculateWHR() {
        double waist = 81.9;
        double hip = 99;

        Double waistHipRatio = WaistHipRatio.calculate(waist, hip);
        Assert.assertEquals(0.8272727272727274D, waistHipRatio, DELTA);
    }

    @Test
    public void calculateWHRZeroWaist() {
        double waist = 0;
        double hip = 99;

        Double waistHipRatio = WaistHipRatio.calculate(waist, hip);
        Assert.assertNull(waistHipRatio);
    }

    @Test
    public void calculateWHRZeroHip() {
        double waist = 81.9;
        double hip = 0;

        Double waistHipRatio = WaistHipRatio.calculate(waist, hip);
        Assert.assertNull(waistHipRatio);
    }

    @Test
    public void calculateWHRZeroBoth() {
        double waist = 0;
        double hip = 0;

        Double waistHipRatio = WaistHipRatio.calculate(waist, hip);
        Assert.assertNull(waistHipRatio);
    }

}