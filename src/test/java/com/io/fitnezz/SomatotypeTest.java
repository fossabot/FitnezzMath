package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

public class SomatotypeTest extends BaseTest<Somatotype> {

    public SomatotypeTest(){
        this.clazz = Somatotype.class;
    }

    @Test
    public void calculateEndomorphy() {
        double triceps = 10.0D;
        double subscapular = 30.0D;
        double supraspinale = 20.0D;
        double height = 1.69D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertEquals(5.875061648893173D, endomorphy, DELTA);
    }

    @Test
    public void calculateEndomorphyZeroTriceps() {
        double triceps = 0D;
        double subscapular = 30.0D;
        double supraspinale = 20.0D;
        double height = 1.69D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertNull(endomorphy);
    }

    @Test
    public void calculateEndomorphyZeroSubscapular() {
        double triceps = 10.0D;
        double subscapular = 0D;
        double supraspinale = 20.0D;
        double height = 1.69D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertNull(endomorphy);
    }

    @Test
    public void calculateEndomorphyZeroSupraspinale() {
        double triceps = 10.0D;
        double subscapular = 30.0D;
        double supraspinale = 0D;
        double height = 1.69D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertNull(endomorphy);
    }

    @Test
    public void calculateEndomorphyZeroHeight() {
        double triceps = 10.0D;
        double subscapular = 30.0D;
        double supraspinale = 20.0D;
        double height = 0D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertNull(endomorphy);
    }

    @Test
    public void calculateEndomorphyZeroAll() {
        double triceps = 0D;
        double subscapular = 0D;
        double supraspinale = 0D;
        double height = 0D;

        Double endomorphy = Somatotype.endomorphy(triceps, subscapular, supraspinale, height);
        Assert.assertNull(endomorphy);
    }

}
