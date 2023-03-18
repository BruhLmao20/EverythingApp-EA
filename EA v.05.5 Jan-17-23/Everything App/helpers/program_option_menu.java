package helpers; 

import java.io.IOException;
import java.util.Scanner;

// Version 0.5.1. ==== 11-2-22 : 1:40am

// https://www.youtube.com/watch?v=pk2tf1EBqgY

public class program_option_menu {
    
    Scanner scnr = new Scanner(System.in);

    public boolean is_running;

    // menu options 
    public String[] menu_items; 
    public String[] fibMenu_items; // NOTE: DONT NEED SPECIAL AS MENU ITEMS WILL BE FILLED IN NEW 

    protected String next; 

    public void run() throws IOException{
        while(is_running){
            update(); 
        }
    }

    public void update() throws IOException{
        menu_show(); 
        menu_user_input(); 
    }

    // HERE================================================================  
    public void menu_show(){
        int i = 1; 

        S.o("====================================================================================");
        S.o(""); 
        S.o("Enter Corresponding Entry To Execute Operation: "); 
        S.o(""); 
        for(String item: menu_items){
            System.out.print('\t');//tabs spaces the menu (needs to be print "NO LN" as tab is same line)
            S.o(i + ") "+item); 
            i++; 
        }
        System.out.print('\t');//tabs spaces the exit in menu (needs to be print "NO LN" as tab is same line)
        S.o("exit)  \tTo Exit the Program: ");
        S.o(""); 
        System.out.print("Enter number for desired program: ");// NOT "S.o" so that input is on same line as "...Exit the Program: "
        //S.o("====================================================================================");
    }

    public void menu_user_input() throws IOException{

        // gets user input 
        Scanner user_input = new Scanner(System.in); 
        next  = user_input.next(); 

        //exit program if user writes exit 
        if(next.equals("exit")){
            //S.o("Program Ended");     // doesnt need to show in nested options, as ending isnt ending full program 
            endp(); 
        }
    }

    public void endp(){
        is_running = false; 
    }

}