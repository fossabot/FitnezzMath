package com.io.fitnezz.index;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class BodyMassIndexTest {

    @Test
    public void calculateBMI() {
        double bodyWeight = 75D;
        double height = 1.69D;

        Double bmi = BodyMassIndex.calculate(bodyWeight, height);
        Assert.assertEquals(26.25958474843318D, bmi, 0.01);
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

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<BodyMassIndex> constructor = BodyMassIndex.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}