package com.test;

public class Variable {

    public enum VariableType {
        FLOAT, STRING, BOOL
    }

    private String name;
    private VariableType type;

    /* wrapper classes such that they can all be initialized to NULL */
    private Float floatVal;
    private String stringVal;
    private Boolean boolVal;


    public Variable(String name, float value) {
        this.name = name;
        this.floatVal = value;
    }
    public Variable(String name, VariableType type, String value) {
        this.name = name;
        this.type = type;
        if(type == VariableType.FLOAT)
        {
            this.floatVal = Float.parseFloat(value);
        }
        else if(type == VariableType.STRING)
        {
            this.stringVal = value;
        }
        else
        {
            assert value.equals("True") || value.equals("False") : "boolean value was not one of 'True' or 'False'";
            this.boolVal = value == "True" ? true : false;
        }
    }

    public String getName() {
        return this.name;
    }

    public float getValue() {
        return this.floatVal;
    }

    public void updateValue(float value) {
        this.floatVal = value;
    }
}