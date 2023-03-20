package menu;

import java.io.IOException;
import java.util.Scanner;

import functions.fibEA;
import helpers.*;
import helpers.program_option_menu;


public class menuFIB extends program_option_menu{
    
    // Version 0.5.1. ==== 12-16-22 : 2:00am

    Scanner scnr = new Scanner(System.in);

    public menuFIB(){
        is_running = true;
        menu_items = new String[]{
        "\tRun this Program Again", 
        "\tPrint the Code used for this program",}; 
    } 

    public void menu_user_input() throws IOException{
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
            screen.clear();
            S.o(""); 
            S.o("==============================================="); 
            System.out.println("The Fibonacci of (" + startNum + ") is " + fibEA.recFib(startNum)); // imported fibEA from functions 
            S.o("===============================================");

            // FIB MENU AFTER RUN
            // LOCATED IN MENU PACKAGE 12-16-22 : 2:00am 
            menuFIB menuFIB = new menuFIB(); 
            menuFIB.run(); 
            menuFIB.endp();
        }       

        if(next.equals("1")){
            System.out.println(); 
            System.out.println("Here is the code btw :)");
            System.out.println(); 
            System.out.println(fibEA.rFibCode());//located in the functions package
        }

    }

}