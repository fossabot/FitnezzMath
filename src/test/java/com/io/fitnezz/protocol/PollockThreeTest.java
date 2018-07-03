package com.io.fitnezz.protocol;

import org.junit.Assert;
import org.junit.Test;

public class PollockThreeTest {

    private static final double DELTA = 0.001;

    @Test
    public void sumFemale() {
        double triceps = 10D;
        double thigh = 14D;
        double suprailiac = 28D;

        Double sumFemale = PollockThree.sumFemale(triceps, thigh, suprailiac);
        Assert.assertEquals(52D, sumFemale, DELTA);
    }

    @Test
    public void sumMale() {
        double abdominal = 32D;
        double thigh = 14D;
        double chest = 8D;

        Double sumMale = PollockThree.sumMale(abdominal, thigh, chest);
        Assert.assertEquals(54D, sumMale, DELTA);
    }

}