/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Komasquin A. Lopez
 */
public class Operations {   
    //these variables are used to hold inputs passed to the class through the constructor
    int counter;
    String[] variables;
    
    //here is the class constructor initialize the variables
    public Operations(int count, String[] values){
        this.counter = count;
        variables = new String[values.length];
        for(int j = 0 ; j < values.length ; j++){
            this.variables[j] = values[j];
        }
    }//end of 'constructor method'
    
    //this method is used to access the data in the 'calculations' method 
    public double calculation(){
        return calculations();
    }//end of method 'calculations'
    
    //this method is private to protect it from being modified from its original intent
    private double calculations(){
        //the variable to be returned
        int output = 0;
        //this 'for loop' is used to iterate through the 'variables' array
        for(int i = 0; i < counter; i++){
            //this 'if statement' is used to determine what operation to perform and allows that operation
            if(variables[i].equals("+")){
                //similar in each condition: the position is incremented to retrieve the number stored next to the operator
                i++;
                //similar in each condition: the 'String' is cast to an 'int' and operated upon to calculate the output
                output = output + Integer.parseInt(variables[i]);
                //System.out.println("Test for add: " + output + " <-- ouput value");
            }else if(variables[i].equals("-")){
                i++;
                output = output - Integer.parseInt(variables[i]);
                //System.out.println("Test for minus: " + output + " <-- ouput value");
            }else if(variables[i].equals("/")){
                i++;
                output = output / Integer.parseInt(variables[i]);
                //System.out.println("Test for division: " + output + " <-- ouput value");
            }else if(variables[i].equals("*")){
                i++;
                output = output * Integer.parseInt(variables[i]);
                //System.out.println("Test for multiplication: " + output + " <-- ouput value");
            }else if(i == 0){
                output = Integer.parseInt(variables[i]);
                //System.out.println("Test for first value: " + output + " <-- ouput value");
            }else{
                //used to exit 'if statement' gracefully in case of wrong input
                continue;
            }//end of 'if statement'
                //System.out.println("TEST for values in 'variables' Array " + variables[i]);
        }//end of 'for loop'

/**
        //This 'for loop' is a test to show the array is populating
        for(int j = 0; j < variables.length;j++){
            System.out.println("'variables' Array TEST " + variables[j]);
        }
**/
        return (double)output;
    }//end of method 'calculations'
}
