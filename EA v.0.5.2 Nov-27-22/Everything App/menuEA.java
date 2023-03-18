//package yourPackageHere; (this case is in the main folder so not in a package)

import java.io.IOException;
import java.util.Scanner;

import functions.fibEA;
import helpers.S;
import helpers.console_menu; 

public class menuEA extends console_menu {

    // Version 0.5.1. ==== 11-2-22 : 1:40am

    Scanner scnr = new Scanner(System.in);

    public menuEA(){
        is_running = true;
        menu_items = new String[]{"\tFibonacci Program (1, 1, 2, 3, 5, 8, ect...)", "\tFactorial Program (n!)", "\tn -> 0 -> n (Stack Implementation) Program", "\tPalindrome Program (racecar)", }; 
    } 

    //'\t'+"\tFibonacci Program (1, 1, 2, 3, 5, 8, ect...)", "\tFactorial Program (n!)"
    
    @Override
    public void menu_user_input(){
        super.menu_user_input();

        // (FIB) convert to float then to integer or string
        if(next.equals("1")){
            S.o("-----------"); 
            S.o("Fibonacci Program");
            S.o("-----------");

            // Runs Fib
            int startNum;
        
            System.out.println("pick a number: "); 
            startNum = scnr.nextInt();
            S.o(""); 
            S.o("==============================================="); 
            System.out.println("The Fibonacci of (" + startNum + ") is " + fibEA.recFib(startNum)); // imported fibEA from functions 
            S.o("===============================================");

            // FIB MENU AFTER RUN
            menuEA fibMenuEA = new menuEA(); 
            fibMenuEA.run();

            // Program finishs and then shows new menu if you want to see the 1. code or 2. run it again or 3. exit 

        }

        // FACTORIAL
        // convert to float then to integer or string 
        if(next.equals("2")){
            S.o("-----------"); 
            S.o("Factorial Program");
            S.o("-----------");

            S.o("================================="); 
            S.o("Program 2 is currently Unavailable");
            S.o("=================================");
            

            // public class RecursionExampleFactorial {
            //     public static void main(String args[]) {
            //       int n = 5; 
                  
            //       System.out.println(factorial(n)); 
            //     }
                  
            //     public static int factorial(int n){
            //         if (n >= 1){
            //             return n * factorial(--n);
            //         }
            //         else{
            //           return 1; 
            //         }
            //     }
            // }

        }

        if(next.equals("3")){
            S.o("-----------"); 
            S.o("n -> 0 -> n (Stack Implementation) Program");
            S.o("-----------");

            S.o("================================="); 
            S.o("Program 3 is currently Unavailable");
            S.o("=================================");

            // public class printNumPattern{
            //     public static void printNumPattern(int num1, int num2){
            //         if(num1<= 0){
            //           System.out.print(0+" "); 
            //           return; 
            //         }
            //         else{
            //           System.out.print(num1+" "); 
            //           printNumPattern(num1-num2, num2);
            //           System.out.print(num1+" "); 
            //         }
            //     }
            //     public static void main(String[] args) {
                
            //         int num1 = 12; 
            //         int num2 = 3; 
                
            //         printNumPattern(num1, num2);
                
            //         }
            // }

        }

        if(next.equals("4")){
            S.o("-----------"); 
            S.o("Palindrome Program");
            S.o("-----------");

            S.o("================================="); 
            S.o("Program 4 is currently Unavailable");
            S.o("=================================");
        }

        if(next.equals("exit")){
            S.o("Program Ended");
            endp(); 
        }

    }


    public void fibmenuEA(){
        is_running = true;
        fibMenu_items = new String[]{"Print the Code used for this program", "fibEA", "n -> 0 -> n (Stack Implementation) Program", "Palindrome Program", }; 
    } 


    public void fib_user_input() throws IOException{
        super.menu_user_input();

        //Prints the Code of 
        if(next.equals("1")){
        System.out.println(); 
        System.out.println("Here is the code btw :)");
        System.out.println(); 
        System.out.println(fibEA.rFibCode());//located in the functions package

        // menu options for FIB 
        // - show non recursive code
        // - show recursive code 
        // - 

        // can edit the code to make it dynamic 
        // can print the first part with txt then add the single line that has users number then print next part of the file after 

        }


    }

    // menu 1 = fib options 
    // menu 2 input = next program options 

}


// if(next.equals("1")){
//     S.o("-----------"); 
//     S.o("Preset Program");
//     S.o("-----------");
// }

    // S.o("================================="); 
    // S.o("Program "+ i +" is currently Unavailable");
    // S.o("=================================");