package com.io.fitnezz.util;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class UtilsTest extends BaseTest<Utils> {

    public UtilsTest() {
        this.clazz = Utils.class;
    }

    @Test
    public void calculateFatWeight() {
        double bodyWeight = 75D;
        double fatPercentage = 15D;

        double fatWeight = Utils.calculateFatWeight(bodyWeight, fatPercentage);
        Assert.assertEquals(11.25D, fatWeight, DELTA);
    }

    @Test
    public void calculateLeanBodyMass() {
        double bodyWeight = 75D;
        double fatWeight = 11.25D;

        double leanBodyMass = Utils.calculateLeanBodyMass(bodyWeight, fatWeight);
        Assert.assertEquals(63.75D, leanBodyMass, DELTA);
    }

    @Test
    public void calculateMuscleWeight() {
        double bodyWeight = 75D;
        double fatWeight = 11.25D;
        double boneWeight = 10.12D;
        double residualWeight = 18.08D;

        double leanBodyMass = Utils.calculateMuscleWeight(bodyWeight, fatWeight, boneWeight, residualWeight);
        Assert.assertEquals(35.55D, leanBodyMass, DELTA);
    }

}