package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ResidualWeightTest {

    @Test
    public void calculateResidualWeightMale() {
        double bodyWeight = 75D;
        Double residualWeight = ResidualWeight.calculate(bodyWeight, true);
        Assert.assertEquals(15.675D, residualWeight, 0.01);
    }

    @Test
    public void calculateResidualWeightFemale() {
        double bodyWeight = 75D;
        Double residualWeight = ResidualWeight.calculate(bodyWeight, false);
        Assert.assertEquals(18.075D, residualWeight, 0.01);
    }

    @Test
    public void calculateResidualWeightZero() {
        double bodyWeight = 0D;
        Double residualWeight = ResidualWeight.calculate(bodyWeight, false);
        Assert.assertNull(residualWeight);
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<ResidualWeight> constructor = ResidualWeight.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}