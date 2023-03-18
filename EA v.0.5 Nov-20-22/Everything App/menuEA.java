//package yourPackageHere; 

import java.util.Scanner;

import functions.fibEA;
import helpers.S;
import helpers.console_menu; 

public class menuEA extends console_menu {

    Scanner scnr = new Scanner(System.in);

    public menuEA(){
        is_running = true;
        menu_items = new String[]{"palEA", "fibEA",}; 
    }

    
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

            // Program finishs and then shows new menu if you want to see the 1. code or 2. run it again or 3. exit 

        }

        // FACTORIAL
        // convert to float then to integer or string 
        if(next.equals("2")){
            S.o("-----------"); 
            S.o("Factorial Program");
            S.o("-----------");

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
        }

        if(next.equals("exit")){
            S.o("Program Ended");
            endp(); 
        }

    }
}


// if(next.equals("1")){
//     S.o("-----------"); 
//     S.o("Preset Program");
//     S.o("-----------");
// }