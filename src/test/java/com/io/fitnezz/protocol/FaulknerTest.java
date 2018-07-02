package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class FaulknerTest extends BaseTest<Faulkner> {

    public FaulknerTest() {
        this.clazz = Faulkner.class;
    }

    @Test
    public void fatPercentage() {
        double triceps = 10D;
        double subscapular = 30D;
        double suprailiac = 28D;
        double abdominal = 32D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertEquals(21.083D, fatPercentage, DELTA);
    }

    @Test
    public void fatPercentageZeroTriceps() {
        double triceps = 0D;
        double subscapular = 30D;
        double suprailiac = 28D;
        double abdominal = 32D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroSubscapular() {
        double triceps = 10D;
        double subscapular = 0D;
        double suprailiac = 28D;
        double abdominal = 32D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroSuprailiac() {
        double triceps = 10D;
        double subscapular = 30D;
        double suprailiac = 0D;
        double abdominal = 32D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroAbdominal() {
        double triceps = 10D;
        double subscapular = 30D;
        double suprailiac = 28D;
        double abdominal = 0D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroAll() {
        double triceps = 0D;
        double subscapular = 0D;
        double suprailiac = 0D;
        double abdominal = 0D;

        Double fatPercentage = Faulkner.fatPercentage(triceps, subscapular, suprailiac, abdominal);
        Assert.assertNull(fatPercentage);
    }

}