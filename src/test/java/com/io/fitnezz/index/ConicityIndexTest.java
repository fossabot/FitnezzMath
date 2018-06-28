package com.io.fitnezz.index;

import org.junit.Assert;
import org.junit.Test;

public class ConicityIndexTest {

    @Test
    public void calculateCI(){
        double bodyWeight = 75D;
        double height = 1.69D;
        double waist = 81.9D;

        Double ci = ConicityIndex.calculate(bodyWeight, height, waist);
        Assert.assertEquals(0.6660592872626876D, ci, 0.01);
    }

    @Test
    public void calculateCIZeroWeight(){
        double bodyWeight = 0D;
        double height = 1.69D;
        double waist = 81.9D;

        Double ci = ConicityIndex.calculate(bodyWeight, height, waist);
        Assert.assertNull(ci);
    }

    @Test
    public void calculateCIZeroHeight(){
        double bodyWeight = 75D;
        double height = 0D;
        double waist = 81.9D;

        Double ci = ConicityIndex.calculate(bodyWeight, height, waist);
        Assert.assertNull(ci);
    }

    @Test
    public void calculateCIZeroWaist(){
        double bodyWeight = 75D;
        double height = 1.69D;
        double waist = 0D;

        Double ci = ConicityIndex.calculate(bodyWeight, height, waist);
        Assert.assertNull(ci);
    }

    @Test
    public void calculateCIZeroBoth(){
        double bodyWeight = 0D;
        double height = 0D;
        double waist = 0D;

        Double ci = ConicityIndex.calculate(bodyWeight, height, waist);
        Assert.assertNull(ci);
    }

}