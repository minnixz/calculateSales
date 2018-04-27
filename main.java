import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
//page 241
class main {
    public static void main(String[] args) {
        
    double totalCost = 0;
    double product1 = 2.98;
    double product2 = 4.50;
    double product3 = 9.98;
    double product4 = 4.49;
    double product5 = 6.87;
    int productEntered = 0;
    int quantityEntered = 0;
    Scanner input = new Scanner(System.in);
    
    //Intro for Program
    System.out.println("Welcome to the Cash Register Program. Follow instructions and enter a -1 to quit\n");
    
    
    while(true){
        int numberInput=0;
        //Take in product number
        System.out.print("Enter your product Number: ");
        numberInput = input.nextInt();  
        if(numberInput != -1)
           productEntered = numberInput;
        else
          break;
        //Take in Quantity
        System.out.print("Enter the quantity: ");
        numberInput = input.nextInt();  
        if(numberInput != -1)
           quantityEntered = numberInput;
        else
          break; 
        //Add product cost * quantity to total
        switch(productEntered){
            
            case 1:
                totalCost += (product1*(double)quantityEntered);
                break;
            case 2:
                totalCost += (product2*(double)quantityEntered);
                break;
            case 3:
                totalCost += (product3*(double)quantityEntered);
                break;
            case 4:
                totalCost += (product4*(double)quantityEntered);
                break;
            default:
                System.out.println("ERROR INVALID PRODUCT ENTERED");
                break;
        }
        
    }
    System.out.println("Your Total Cost is: $"+totalCost);
  
    //add product cost * quantity to toal
    
    
    
    //Use a switch statement ot determine the retail price for each product
    //calclate and display the total retail value of all products sold;
    //Use a loop to add these numbers up
    
    
    }
    
    
    
    
}