package com.examples.java;

/**
 * Created by Praveen Kothapally.
 */
public class MathTeacher {



    public  int addNumbers(int numberOne, int numberTwo) throws AddException{
        int total ;
        checkPositiveNumbers(numberOne);
        checkPositiveNumbers(numberTwo);
        total=  numberOne + numberTwo;
        return  total;
    }


    public int addNumbers(int numberOne, int numberTwo, int numberThree){
        int total ;
        total=  numberOne + numberTwo + numberThree;
        return  total;
    }



    public float addNumbers(float numberOne, float numberTwo){
        float total;
        total = numberOne+ numberTwo;
        return total;
    }


    private void checkPositiveNumbers(int number) throws AddException{

        if (number < 0) {
            throw new AddException("Number " + number + " is lesser than 0");
        }
    }





}

