package com.io.fitnezz.index;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class PonderalIndexTest {

    @Test
    public void calculatePI() {
        double bodyWeight = 75D;
        double height = 1.69D;

        Double pi = PonderalIndex.calculate(bodyWeight, height);
        Assert.assertEquals(40.07433699793675D, pi, 0.01);
    }

    @Test
    public void calculatePIZeroWeight() {
        double bodyWeight = 0D;
        double height = 1.69D;

        Double pi = PonderalIndex.calculate(bodyWeight, height);
        Assert.assertNull(pi);
    }

    @Test
    public void calculatePIZeroHeight() {
        double bodyWeight = 75D;
        double height = 0D;

        Double pi = PonderalIndex.calculate(bodyWeight, height);
        Assert.assertNull(pi);
    }

    @Test
    public void calculatePIZeroBoth() {
        double bodyWeight = 0D;
        double height = 0D;

        Double pi = PonderalIndex.calculate(bodyWeight, height);
        Assert.assertNull(pi);
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<PonderalIndex> constructor = PonderalIndex.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}