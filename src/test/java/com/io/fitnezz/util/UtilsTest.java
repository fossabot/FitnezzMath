package com.io.fitnezz.util;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class UtilsTest {

    @Test
    public void calculateFatWeight() {
        double bodyWeight = 75D;
        double fatPercentage = 15D;

        double fatWeight = Utils.calculateFatWeight(bodyWeight, fatPercentage);
        Assert.assertEquals(11.25D, fatWeight, 0.01);
    }

    @Test
    public void calculateLeanBodyMass() {
        double bodyWeight = 75D;
        double fatWeight = 11.25D;

        double leanBodyMass = Utils.calculateLeanBodyMass(bodyWeight, fatWeight);
        Assert.assertEquals(63.75D, leanBodyMass, 0.01);
    }

    @Test
    public void calculateMuscleWeight() {
        double bodyWeight = 75D;
        double fatWeight = 11.25D;
        double boneWeight = 10.12D;
        double residualWeight = 18.08D;

        double leanBodyMass = Utils.calculateMuscleWeight(bodyWeight, fatWeight, boneWeight, residualWeight);
        Assert.assertEquals(35.55D, leanBodyMass, 0.01);
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<Utils> constructor = Utils.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}