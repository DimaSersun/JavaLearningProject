package com.Orange.classesandobjects.autoservicetask;

public class Tool {
    String toolName;
    int iventoryId;
    double price;

    public Tool(String toolName){
        this.toolName = toolName;
        System.out.println("Object with name " + toolName +" was created");
    }

    public  Tool(){
        System.out.println("The new object named " +this.toolName+" with ID "+this.iventoryId+" was created");
    }
}
