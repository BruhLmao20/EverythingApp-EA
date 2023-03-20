package menu;

import java.io.IOException;
import java.util.Scanner;

import functions.matrix; // FUNCTIONS 

import helpers.S;
import helpers.program_option_menu;


public class menuMatrix extends program_option_menu{
    
    // Version 0.5.1. ==== 12-16-22 : 2:00am

    Scanner scnr = new Scanner(System.in);

    public menuMatrix(){
        is_running = true;
        menu_items = new String[]{
        "\t2D Array [Matrix] (R-Gen) Program", 
        "\t2D Array [Matrix] (User Input) Program", 
        "\tPrint the Code used for this program",}; 
    } 

    public void menu_user_input() throws IOException{
        super.menu_user_input();

        if(next.equals("1")){
            S.o("------------------------------------"); 
            S.o("2D Array [Matrix] (R-Gen) Program");
            S.o("------------------------------------");

            // Runs Matrix
            S.o(""); 
            S.o("==============================================="); 
            matrix.genMat();
            S.o("===============================================");

            S.o(""); 
            S.o("===============================================");
            System.out.print("Run This Program Again?: ");
            S.o("===============================================");
            S.o("");


            // FIB MENU AFTER RUN
            // LOCATED IN MENU PACKAGE 12-16-22 : 2:00am 
            // menuMatrix menuMatrix = new menuMatrix(); 
            // menuMatrix.run(); 
            // menuMatrix.endp();
        }       

        if(next.equals("2")){
            S.o("------------------------------------"); 
            S.o("2D Array [Matrix] (User Input) Program");
            S.o("------------------------------------");

            // Runs Matrix
            S.o(""); 
            S.o("==============================================="); 
            matrix.matrix_io();
            S.o("===============================================");

            S.o(""); 
            S.o("===============================================");
            System.out.print("Run This Program Again?: ");
            S.o("===============================================");
            S.o("");

        }
        
        if(next.equals("3")){
            S.o("------------------------------------"); 
            S.o("2D Array [Matrix] (Into Matrix-Verse) Program");
            S.o("------------------------------------");

            S.o(""); 
            S.o("============================================================================================================================================="); 
            matrix.matrixVerse();
            S.o("=============================================================================================================================================");

        // if(next.equals("3")){
        //     System.out.println(); 
        //     System.out.println("Here is the code btw :)");
        //     System.out.println(); 
        //     System.out.println(menuMatrix.rFibCode()); //located in the functions package
        // }

    }

}