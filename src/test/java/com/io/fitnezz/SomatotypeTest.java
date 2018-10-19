package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

public class SomatotypeTest extends BaseTest<Somatotype> {

    public SomatotypeTest(){
        this.clazz = Somatotype.class;
    }

    //Endomorphy

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


    //Mesomorphy

    @Test
    public void calculateMesomorphy() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertEquals(4.618400000000001D, mesomorphy, DELTA);
    }

    @Test
    public void calculateMesomorphyZeroBicondylarHumerus() {
        double bicondylarHumerus = 0D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroBicondylarFemur() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 0D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroRightArm() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 0D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroTriceps() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroRightCalfBC() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 0D;
        double calfSF = 12.0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroCalfSF() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 0D;
        double height = 1.69D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroHeight() {
        double bicondylarHumerus = 6.6D;
        double bicondylarFemur = 9.2D;
        double rightArm = 29.2D;
        double triceps = 10.0D;
        double rightCalfBC = 37.0D;
        double calfSF = 12.0D;
        double height = 0D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

    @Test
    public void calculateMesomorphyZeroAll() {
        double bicondylarHumerus = 0D;
        double bicondylarFemur = 0D;
        double rightArm = 0D;
        double triceps = 0D;
        double rightCalfBC = 0D;
        double calfSF = 0D;
        double height = 0D;

        Double mesomorphy = Somatotype.mesomorphy(bicondylarHumerus, bicondylarFemur, rightArm, triceps, rightCalfBC, calfSF, height);
        Assert.assertNull(mesomorphy);
    }

}
