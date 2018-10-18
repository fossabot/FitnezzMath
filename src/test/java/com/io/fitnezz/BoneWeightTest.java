package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

public class BoneWeightTest extends BaseTest<BoneWeight> {

    public BoneWeightTest(){
        this.clazz = BoneWeight.class;
    }

    @Test
    public void calculateBoneWeight() {
        double height = 1.69D;
        double biStyloid = 5.2D;
        double bicondylarFemur = 9.2D;

        Double boneWeight = BoneWeight.calculate(height, biStyloid, bicondylarFemur);
        Assert.assertEquals(10.12035246033729D, boneWeight, DELTA);
    }

    @Test
    public void calculateBoneWeightZeroHeight() {
        double height = 0D;
        double biStyloid = 5.2D;
        double bicondylarFemur = 9.2D;

        Double boneWeight = BoneWeight.calculate(height, biStyloid, bicondylarFemur);
        Assert.assertNull(boneWeight);
    }

    @Test
    public void calculateBoneWeightZeroBiStyloid() {
        double height = 1.69D;
        double biStyloid = 0D;
        double bicondylarFemur = 9.2D;

        Double boneWeight = BoneWeight.calculate(height, biStyloid, bicondylarFemur);
        Assert.assertNull(boneWeight);
    }

    @Test
    public void calculateBoneWeightZeroBicondylarFemur() {
        double height = 1.69D;
        double biStyloid = 5.2D;
        double bicondylarFemur = 0D;

        Double boneWeight = BoneWeight.calculate(height, biStyloid, bicondylarFemur);
        Assert.assertNull(boneWeight);
    }

    @Test
    public void calculateBoneWeightZeroAll() {
        double height = 0D;
        double biStyloid = 0D;
        double bicondylarFemur = 0D;

        Double boneWeight = BoneWeight.calculate(height, biStyloid, bicondylarFemur);
        Assert.assertNull(boneWeight);
    }

}
