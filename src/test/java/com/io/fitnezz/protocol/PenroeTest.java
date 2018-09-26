package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PenroeTest extends BaseTest<Penroe> {

    public PenroeTest() {
        this.clazz = Penroe.class;
    }

    // Lean Body Mass For Male

    @Test
    public void calculatLeanBodyMassForMale() {
        double bodyWeight = 75D;
        double abdomen = 89D;
        double fist = 10D;
        boolean isMaleSex = true;

        Double leanBodyMass = Penroe.leanBodyMass(bodyWeight, abdomen, fist, 0, isMaleSex);
        Assert.assertEquals(54.439310000000006D, leanBodyMass, DELTA);
    }

    @Test
    public void calculatLeanBodyMassForMaleZeroBW() {
        double bodyWeight = 0;
        double abdomen = 89D;
        double fist = 10D;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, abdomen, fist, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculatLeanBodyMassForMaleZeroAbdomen() {
        double bodyWeight = 75D;
        double abdomen = 0;
        double fist = 10D;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, abdomen, fist, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculatLeanBodyMassForMaleZeroFist() {
        double bodyWeight = 75D;
        double abdomen = 89D;
        double fist = 0;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, abdomen, fist, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculatLeanBodyMassForMaleZeroAll() {
        double bodyWeight = 0;
        double abdomen = 0;
        double fist = 0;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, abdomen, fist, 0, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    // Lean Body Mass For Female

    @Test
    public void calculatLeanBodyMassForFemale() {
        double bodyWeight = 75D;
        double fatWeight = 14.95D;
        boolean isMaleSex = false;

        Double leanBodyMass = Penroe.leanBodyMass(bodyWeight, 0, 0, fatWeight, isMaleSex);
        Assert.assertEquals(60.05D, leanBodyMass, DELTA);
    }

    @Test
    public void calculatLeanBodyMassForFemaleZeroBW() {
        double bodyWeight = 0;
        double fatWeight = 14.95D;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, 0, 0, fatWeight, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculatLeanBodyMassForFemaleZeroFW() {
        double bodyWeight = 75D;
        double fatWeight = 0;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, 0, 0, fatWeight, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculatLeanBodyMassForFemaleZeroBoth() {
        double bodyWeight = 0;
        double fatWeight = 0;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.leanBodyMass(bodyWeight, 0, 0, fatWeight, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    //Fat Percentage For Male

    @Test
    public void calculateFatPercentageForMale() {
        double bodyWeight = 75D;
        double leanBodyMass = 54.43D;
        boolean isMaleSex = true;

        Double fatPercentage = Penroe.fatPercentage(bodyWeight, 0, leanBodyMass, 0, 0, isMaleSex);
        Assert.assertEquals(27.426666666666666, fatPercentage, DELTA);
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

    //Fat Percentage For Female

    @Test
    public void calculateFatPercentageForFemale() {
        double height = 169D;
        double hip = 99D;
        double abdomen = 89D;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.fatPercentage(0, height, 0, hip, abdomen, isMaleSex);
        Assert.assertEquals(30.38000000000001, fatPercentage, DELTA);
    }

    @Test
    public void calculateFatPercentageForFemaleZeroHeight() {
        double height = 0;
        double hip = 99D;
        double abdomen = 89D;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.fatPercentage(0, height, 0, hip, abdomen, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculateFatPercentageForFemaleZeroHip() {
        double height = 169D;
        double hip = 0;
        double abdomen = 89D;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.fatPercentage(0, height, 0, hip, abdomen, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculateFatPercentageForFemaleZeroAbdomen() {
        double height = 169D;
        double hip = 99D;
        double abdomen = 0;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.fatPercentage(0, height, 0, hip, abdomen, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void calculateFatPercentageForFemaleZeroAll() {
        double height = 0;
        double hip = 0;
        double abdomen = 0;
        boolean isMaleSex = false;

        Double fatPercentage = Penroe.fatPercentage(0, height, 0, hip, abdomen, isMaleSex);
        Assert.assertNull(fatPercentage);
    }

}
