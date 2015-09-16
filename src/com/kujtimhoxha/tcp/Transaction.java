package com.kujtimhoxha.tcp;

import java.io.Serializable;


public class Transaction implements Serializable {
    private String message;
    private int someIntValue;
    private double someDoubleValue;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSomeIntValue() {
        return someIntValue;
    }

    public void setSomeIntValue(int someIntValue) {
        this.someIntValue = someIntValue;
    }

    public double getSomeDoubleValue() {
        return someDoubleValue;
    }

    public void setSomeDoubleValue(double someDoubleValue) {
        this.someDoubleValue = someDoubleValue;
    }
}
