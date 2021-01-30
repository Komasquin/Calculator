package calculator;
import java.util.*;
/**
 *
 * @author Komasquin A. Lopez
 */
public class Calculator {

    public static void main(String[] args) {
        //'answer' string is used as a test for the 'while loop' condition to allow multiple variables
        String answer = "y";
        //'variables' array is used to store operators and numbers to be calculated
        String[] variables = new String[100];//NOTE---------------------------------------------------------------you can use split()
        //this is to count the number of items in the array 'variables' to cut down on dedundancy
        int counter = 0;
        
        //three 'Scanner' objects just because I wanted to use three [aka one of Teslas fav number]
        Scanner input = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);
        Scanner lock = new Scanner(System.in);
        
        //The initial number is asked outside the 'while loop' to prevent it from being asked again
        System.out.println("Enter a number? ");
        variables[counter] = input.next();
        counter++;
        
        //this 'while loop' condition is to test the locking variable 'answer' or if the inputs are as large as the array
        while((answer.toLowerCase().equals("y")) || (counter == 100)){
        
            //these 3 lines are to ask the user to input an operator, grab the operator inut from the user, and increment the variable count 
             System.out.println("Do you want to Add, Subtract, Multiple, Divide?");
            variables[counter] = operation.next();
            counter++;
        
            //these 3 lines are to ask the user to input a variable, grab the value input from the user, and increment the variable count 
            System.out.println("Enter a number? ");
            variables[counter] = input.next();
            counter++;
        
            //these 2 lines are to ask the user if they have more input
            System.out.println("Do you want to include more numbers? ");
            answer = lock.next();
        }//end of 'while loop'
        
        //this is an object of the class 'operations'
        Operations h = new Operations(counter, variables);
        
        //a print that calls the method 'calculation' from the class operations
        System.out.println("Your answer is: " + h.calculation());
    }//end of 'main method'
    
}
