package com.io.fitnezz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;


public abstract class BaseTest<T> {

    protected Class<T> clazz;

    public BaseTest() {
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}