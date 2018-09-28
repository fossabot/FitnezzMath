package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class GuedesTest extends BaseTest<Guedes> {

    public GuedesTest() {
        this.clazz = Guedes.class;
    }

    //Sum

    @Test
    public void sum() {
        double triceps = 10D;
        double suprailiac = 28D;
        double abdominal = 32D;

        Double sum = Guedes.sum(triceps, suprailiac, abdominal);
        Assert.assertEquals(70D, sum, DELTA);
    }

    @Test
    public void sumZeroTriceps() {
        double triceps = 0;
        double suprailiac = 28D;
        double abdominal = 32D;

        Double sum = Guedes.sum(triceps, suprailiac, abdominal);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroSuprailiac() {
        double triceps = 10D;
        double suprailiac = 0;
        double abdominal = 32D;

        Double sum = Guedes.sum(triceps, suprailiac, abdominal);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroAbdominal() {
        double triceps = 10D;
        double suprailiac = 28D;
        double abdominal = 0;

        Double sum = Guedes.sum(triceps, suprailiac, abdominal);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroAll() {
        double triceps = 0;
        double suprailiac = 0;
        double abdominal = 0;

        Double sum = Guedes.sum(triceps, suprailiac, abdominal);
        Assert.assertNull(sum);
    }

    //Fat Percentage

    @Test
    public void fatPercentage() {
        double sum = 70D;

        Double fatPercentage = Guedes.fatPercentage(sum);
        Assert.assertEquals(22.496086139460925D, fatPercentage, DELTA);

    }

    @Test
    public void fatPercentageZero() {
        double sum = 0;

        Double fatPercentage = Guedes.fatPercentage(sum);
        Assert.assertNull(fatPercentage);
    }

}
