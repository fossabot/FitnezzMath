package com.io.fitnezz.protocol;

import com.io.fitnezz.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PollockSevenTest extends BaseTest<PollockSeven> {

    public PollockSevenTest() {
        this.clazz = PollockSeven.class;
    }

    @Test
    public void sumAll() {
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

}