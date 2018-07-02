package com.io.fitnezz.index;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class BodyMassIndexTest extends BaseTest<BodyMassIndex> {

    public BodyMassIndexTest() {
        this.clazz = BodyMassIndex.class;
    }

    @Test
    public void calculateBMI() {
        double bodyWeight = 75D;
        double height = 1.69D;

        Double bmi = BodyMassIndex.calculate(bodyWeight, height);
        Assert.assertEquals(26.25958474843318D, bmi, DELTA);
    }

    @Test
    public void calculateBMIZeroWeight() {
        double bodyWeight = 0D;
        double height = 1.69D;

        Double bmi = BodyMassIndex.calculate(bodyWeight, height);
        Assert.assertNull(bmi);
    }

    @Test
    public void calculateBMIZeroHeight() {
        double bodyWeight = 75D;
        double height = 0D;

        Double bmi = BodyMassIndex.calculate(bodyWeight, height);
        Assert.assertNull(bmi);
    }

    @Test
    public void calculateBMIZeroBoth() {
        double bodyWeight = 0D;
        double height = 0D;

        Double bmi = BodyMassIndex.calculate(bodyWeight, height);
        Assert.assertNull(bmi);
    }

}