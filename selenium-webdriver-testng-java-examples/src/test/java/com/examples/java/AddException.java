package com.examples.java;

/**
 * Created by Praveen Kothapally.
 */
public class AddException  extends Exception{

    private String errorMessage = "NO ERROR";

    public AddException(String message){
        this.errorMessage = message;
    }


    public String getErrorMessage(){
        return errorMessage;
    }
}
