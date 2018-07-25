package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PenroeTest extends BaseTest<Penroe> {

    public PenroeTest() {
        this.clazz = Penroe.class;
    }

    @Test
    public void calculateFatPercentageForMaleZeroLBM() {
        double bodyWeight = 75D;
        double leanBodyMass = 0;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.fatPercentage(bodyWeight, 0, leanBodyMass, 0, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculateFatPercentageForMaleZeroBW() {
        double bodyWeight = 0;
        double leanBodyMass = 32D;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.fatPercentage(bodyWeight, 0, leanBodyMass, 0, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculateFatPercentageForMaleZeroBoth() {
        double bodyWeight = 0;
        double leanBodyMass = 0D;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.fatPercentage(bodyWeight, 0, leanBodyMass, 0, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

}
