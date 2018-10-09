package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PollockSevenTest extends BaseTest<PollockSeven> {

    public PollockSevenTest() {
        this.clazz = PollockSeven.class;
    }

    //Sum

    @Test
    public void sum() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertEquals(148.0D, sum, DELTA);
    }

    @Test
    public void sumZeroTriceps() {
        double triceps = 0D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroSubscapular() {
        double triceps = 10D;
        double subscapular = 0D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroAxillary() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 0D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroSuprailiac() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 0D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroAbdominal() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 0D;
        double thighPollock = 14D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroThighPollock() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 0D;
        double chest = 8D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroChest() {
        double triceps = 10D;
        double subscapular = 30D;
        double axillary = 26D;
        double suprailiac = 28D;
        double abdominal = 32D;
        double thighPollock = 14D;
        double chest = 0D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    @Test
    public void sumZeroAll() {
        double triceps = 0D;
        double subscapular = 0D;
        double axillary = 0D;
        double suprailiac = 0D;
        double abdominal = 0D;
        double thighPollock = 0D;
        double chest = 0D;

        Double sum = PollockSeven.sum(triceps, subscapular, axillary, suprailiac, abdominal, thighPollock, chest);
        Assert.assertNull(sum);
    }

    //Fat Percentage Male

    @Test
    public void FatPercentageMale() {
        int age = 19;
        double sum = 148D;
        boolean isMale = true;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertEquals(19.554049057527223D, fatPercentage, DELTA);
    }

    @Test
    public void FatPercentageMaleZeroAge() {
        int age = 0;
        double sum = 148D;
        boolean isMale = true;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void FatPercentageMaleZeroSum() {
        int age = 19;
        double sum = 0D;
        boolean isMale = true;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void FatPercentageMaleZeroAll() {
        int age = 0;
        double sum = 0D;
        boolean isMale = true;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

    //Fat Percentage Female

    @Test
    public void FatPercentageFemale() {
        int age = 19;
        double sum = 148D;
        boolean isMale = false;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertEquals(27.19497735608618D, fatPercentage, DELTA);
    }

    @Test
    public void FatPercentageFemaleZeroAge() {
        int age = 0;
        double sum = 148D;
        boolean isMale = false;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void FatPercentageFemaleZeroSum() {
        int age = 19;
        double sum = 0D;
        boolean isMale = false;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

    @Test
    public void FatPercentageFemaleZeroAll() {
        int age = 0;
        double sum = 0D;
        boolean isMale = false;

        Double fatPercentage = PollockSeven.fatPercentage(age, sum, isMale);
        Assert.assertNull(fatPercentage);
    }

}