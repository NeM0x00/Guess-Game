package com.mycompany.freecodecamp;

import java.util.Random;
import java.util.Scanner;

/**
          Youssef Elsheikh 
 */
public class Freecodecamp {

    public static void main(String[] args) {
    //Welcome Message :    
        System.out.print("Hi! Please Enter Your Name : ");
    
        Scanner scanner = new Scanner (System.in) ;
        String name = scanner.next();
        System.out.println("Hello " + name );
    
        // Take the premission To start ; 
        System.out.println("Start The Game ?");
        System.out.println("\t 1: Yes  ");   
        System.out.println("\t 2: No  ");
        int choice = scanner.nextInt();        
        while (choice != 1 ) {
            System.out.println("Start The Game ?");
            System.out.println("\t 1: Yes  ");   
            System.out.println("\t 2: No  ");
            choice = scanner.nextInt();
            }
        // The begin of Application  
        
        int attempts = 0 ;
        while (attempts < 5 ) { 
            Random random = new Random();
            int Guess = random.nextInt(5) +1;
            System.out.println("Enter Your Guess ");
            int answer = scanner.nextInt(); 
            if (answer == Guess ) {    
            System.out.println("Success");
            System.out.println("Game Over ");
            break;
            }
            else if (attempts == 5 ) {
                   System.out.println("Failed try Again");
                   System.out.println("Game Over ");
                   break;
                }
              else {
               System.out.println("Try Again");
            }
        
        attempts++ ;
        }   
    }
    
}
