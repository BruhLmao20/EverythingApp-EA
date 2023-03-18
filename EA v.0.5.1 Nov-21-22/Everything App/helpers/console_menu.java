package helpers; 

import java.util.Scanner;

import functions.fibEA; 

// Version 0.5.1. ==== 11-2-22 : 1:40am

// https://www.youtube.com/watch?v=pk2tf1EBqgY

public class console_menu {
    
    Scanner scnr = new Scanner(System.in);

    public boolean is_running;

    // menu options 
    public String[] menu_items; 
    public String[] fibMenu_items; 
    // public String[] fibMenu_items;
    // public String[] fibMenu_items;

    protected String next; 
    //protected menu_manager mm; 

    // // MAYBE DONT NEED (may be menuEA function) 
    // public console_menu(){
    //     is_running = true;
    //     menu_items = new String[]{"palEA", "fibEA",}; 
    // }

    public void run(){
        while(is_running){
            update(); 
        }
    }

    public void update(){
        menu_show(); 
        menu_user_input(); 
    }

    // HERE================================================================  
    public void menu_show(){
        int i = 1; 

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
    }

    public void menu_user_input(){

        // gets user input 
        Scanner user_input = new Scanner(System.in); 
        next  = user_input.next(); 

        //exit program if user writes exit 
        if(next.equals("exit")){
            S.o("program ended");
            endp(); 
        }
    }

    public void endp(){
        is_running = false; 
        //if(mm != null) {mm.is_running=false;}
    }

}
