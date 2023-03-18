import java.io.IOException;
import java.util.Scanner;

import functions.fibEA;
import helpers.console_menu; 
import helpers.*; 

public class everythingApp {
 
    // Version 0.5 ==== 11-20-22 : 7:07am 
    // menu video : https://www.youtube.com/watch?v=pk2tf1EBqgY&t=316s

    public static void main (String args[]) throws IOException{

        // ==================================================== [ Initializing Functions ] ============================================================== 

        Scanner scnr = new Scanner(System.in);
 
        fibEA fib = new fibEA(); 
        fibEA rfib = new fibEA(); 
        fibEA rFibFile = new fibEA(); 

        // console_menu menu = new console_menu(); 
        // menu.run();

        menuEA menu = new menuEA(); 
        menu.run();

        // ==================================================== [ Initializing Functions ] ============================================================== 


        // ==================================================== [ Running Functions ] ==============================================================
        // ==================================================== [ CODE IN MENU-EA ] ==============================================================
        // int startNum;
        
        // System.out.println("pick a number: "); 
        // startNum = scnr.nextInt();
        // S.o(""); 
        // S.o("==============================================="); 
        // System.out.println("fibonacci(" + startNum + ") is " + fibEA.recFib(startNum)); 
        // S.o("==============================================="); 

        // System.out.println(); 
        // System.out.println("Here is the code btw :)");
        // System.out.println(); 
        // System.out.println(fibEA.rFibCode());

        //System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
        // ==================================================== [ CODE IN MENU-EA ] ==============================================================
        // ==================================================== [ Running Functions ] ==============================================================
        




        // pick menu for app in console: 1. fib, 2. palindrome, 3. linked list, 4. avl, 5. hash table, 6. heap,
        //CS: as to print code to console once completed or a seperate key
        // MATH


        // ==================================================== [ Objective 1 ] ==============================================================
        //Create an arrary that stores each option in an array and the number entered will be corrolated with the number in the array and will run the funtion 
        // https://stackoverflow.com/questions/18056878/dynamically-building-a-menu (IDK IF THIS IT)
        // ==================================================== [ Objective 1 ] ==============================================================


        // PRACTICE TRIAL OF MAKING MENU 
        // int[] pick = new int[10];   
        // int startNum;
        // int[] functionOptions = {1, 2, 3, 4, 5}; 
        // 1 =  


        // ==================================================== [ MOVED ] ============================================================== 
        // ==================================================== [ Running Functions ] ============================================================== 
        // System.out.println("pick a number: "); 
        // startNum = scnr.nextInt();
        // System.out.println("fibonacci(" + startNum + ") is " + fibEA.recFib(startNum));  

        // System.out.println(); 
        // System.out.println("Here is the code btw :)");
        // System.out.println(); 
        // System.out.println(fibEA.rFibCode());
        //System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
        // ==================================================== [ Running Functions ] ============================================================== 
        // ==================================================== [ MOVED ] ==============================================================
    }
}

        // =============================================================================================================================

        // ==================================================== [ PRESET ] ==============================================================