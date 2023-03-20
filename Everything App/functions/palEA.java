package functions;

import java.util.Scanner;

import helpers.S;

public class palEA {

    // 1. Exclude
    // 2. Print true or not 
    // 


    // public static void main(String[] args) {
    //     Scanner scnr = new Scanner(System.in);
    //     String word = scnr.next();
    //     String reverse = ""; 
        
    //         int i = 0; 
    //         for (i = word.length() -1; i >= 0; i--){
    //             reverse += word.charAt(i);
    //         }
            
    //         boolean palindrome = true; 
    //         for (i=0; i < word.length(); i++){
    //             if ( word.charAt(i) != reverse.charAt(i)) {
    //                palindrome = false; 
    //             }   
    //         }
    //         if (palindrome){
    //             System.out.println("palindrome: " + word);
    //         }
    //         else {
    //             System.out.println("not a palindrome: " + word);
    //     }
    // }

    public static void main(String[] args) {

        //
        //ExcludeSpacesNSymbols(null);
        //toString(null);

        // make sure to tell user to input or else program will run forever 
        // Scanner scnr = new Scanner(System.in);
        // String word = scnr.next();

        // racecar
        String r = "ra!@#$%^&^&c=e=ca/*r"; 
        ExcludeSpacesNSymbols(r);  
        
    }

    // user input happens in the main; 
    public static void palindrome(String word){
        // Scanner scnr = new Scanner(System.in);
        // String word = scnr.next();
        String reverse = ""; 
        
            int i = 0; 
            for (i = word.length() -1; i >= 0; i--){
                reverse += word.charAt(i);
            }
            
            boolean palindrome = true; 
            for (i=0; i < word.length(); i++){
                if ( word.charAt(i) != reverse.charAt(i)) {
                   palindrome = false; 
                }   
            }
            if (palindrome){
                System.out.println("palindrome: " + word);
            }
            else {
                System.out.println("not a palindrome: " + word);
        }
    }

    // is it a palindrome? boolean 
    public static void isPalindrome(){

    }


    public static void ExcludeSpacesNSymbols(String userText){

        int length = userText.length(); 
        char[] ca = new char[length]; 

        for (int i=0; i<userText.length(); ++i){
            if ((userText.charAt(i) >= 'a' && userText.charAt(i) <= 'z') || (userText.charAt(i) >= 'A' && userText.charAt(i) <= 'Z'))
            ca[i] = userText.charAt(i);  
            //else

            }
            S.o(toString(ca));
        }

        public static String toString(char[] a){
            String string = new String(a); 

            return string; 
        }

    }

    // ============================[ TEST ]=====================================
    
    //     public static String ExcludeSpacesNSymbols(String userText) {
    //     //    Scanner scnr = new Scanner(System.in);
    //     //    String userText;
    //        int count = 0;
        
    //        //userText = scnr.nextLine();  // Gets entire line, including spaces. 
     
    //        for (int i=0; i<userText.length(); ++i){
    //           if ((userText.charAt(i) != ' ') && (userText.charAt(i) != ',') && (userText.charAt(i) != '!') && (userText.charAt(i) != '.')) {
    //              count++; // put character in array of char to later be put together to then check with only character 
    //           }
    //        }
    //        System.out.println(count);
    //     return userText;
              
    //     }
    //  }

//