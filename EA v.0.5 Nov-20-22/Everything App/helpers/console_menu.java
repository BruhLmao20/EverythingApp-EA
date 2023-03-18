package helpers; 

import java.util.Scanner;

import functions.fibEA; 

// https://www.youtube.com/watch?v=pk2tf1EBqgY

public class console_menu {
    
    Scanner scnr = new Scanner(System.in);

    public boolean is_running;
    public String[] menu_items; 
    protected String next; 
    //protected menu_manager mm; 

    public console_menu(){
        is_running = true;
        menu_items = new String[]{"palEA", "fibEA",}; 
    }

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

        S.o("Enter Corresponding Entry To Execute Operation: "); 
        for(String item: menu_items){
            S.o(i + ") "+item); 
            i++; 
        }
        S.o("exit)  to exit program: "); 
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
