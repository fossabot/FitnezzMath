package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PollockThreeTest extends BaseTest<PollockThree> {

    public PollockThreeTest() {
        this.clazz = PollockThree.class;
    }

    @Test
    public void sumFemale() {
        double triceps = 10D;
        double thigh = 14D;
        double suprailiac = 28D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertEquals(52D, sumFemale, DELTA);
    }

    @Test
    public void sumFemaleZeroTriceps() {
        double triceps = 0D;
        double thigh = 14D;
        double suprailiac = 28D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertNull(sumFemale);
    }

    @Test
    public void sumFemaleZeroThigh() {
        double triceps = 10D;
        double thigh = 0D;
        double suprailiac = 28D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertNull(sumFemale);
    }

    @Test
    public void sumFemaleZeroSuprailiac() {
        double triceps = 10D;
        double thigh = 14D;
        double suprailiac = 0D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertNull(sumFemale);
    }

    @Test
    public void sumFemaleZeroAll() {
        double triceps = 0D;
        double thigh = 0D;
        double suprailiac = 0D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertNull(sumFemale);
    }

    @Test
    public void sumMale() {
        double abdominal = 32D;
        double thigh = 14D;
        double chest = 8D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertEquals(54D, sumMale, DELTA);
    }

    @Test
    public void sumMaleZeroAbdominal() {
        double abdominal = 0D;
        double thigh = 14D;
        double chest = 8D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertNull(sumMale);
    }

    @Test
    public void sumMaleZeroThigh() {
        double abdominal = 32D;
        double thigh = 0D;
        double chest = 8D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertNull(sumMale);
    }

    @Test
    public void sumMaleZeroChest() {
        double abdominal = 32D;
        double thigh = 14D;
        double chest = 0D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertNull(sumMale);
    }

    @Test
    public void sumMaleZeroAll() {
        double abdominal = 0D;
        double thigh = 0D;
        double chest = 0D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertNull(sumMale);
    }

    @Test
    public void fatPercentageFemale() {
        int age = 19;
        double sum = 52D;

        Double fatPercentage = PollockThree.fatPercentage(age, sum, false);
        Assert.assertEquals(20.78485160813921D, fatPercentage, DELTA);
    }

    @Test
    public void fatPercentageMale() {
        int age = 19;
        double sum = 54D;

        Double fatPercentage = PollockThree.fatPercentage(age, sum, true);
        Assert.assertEquals(15.001279458065842D, fatPercentage, DELTA);
    }

    @Test
    public void fatPercentageZeroAge() {
        int age = 0;
        double sum = 54D;

        Double fatPercentage = PollockThree.fatPercentage(age, sum, true);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroSum() {
        int age = 19;
        double sum = 0D;

        Double fatPercentage = PollockThree.fatPercentage(age, sum, true);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void fatPercentageZeroAll() {
        int age = 0;
        double sum = 0D;

        Double fatPercentage = PollockThree.fatPercentage(age, sum, true);
        Assert.assertNull(fatPercentage);
    }

}