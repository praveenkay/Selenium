package com.examples.java;

import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class TestMathTeacher {


    @Test (expectedExceptions = { AddException.class})
    public void testAddNumbers() throws  AddException{
        MathTeacher mathTeacher= new MathTeacher();
        Assert.assertEquals(mathTeacher.addNumbers(2,2),4);
        Assert.assertEquals(mathTeacher.addNumbers(-1,-2),0);


    }


}
