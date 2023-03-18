package functions;
import helpers.S;
import java.util.Scanner;
//import java.io.*; 

public class matrix {
    
    // Version 0.5.5. ==== 1-12-23 : 1:45am
    // =============================================================================================================================
    // scanner for matrix_io
    static Scanner scnr = new Scanner(System.in);

    
    //1. Creates a static 2d with preset or random (no user input) 
    public static void genMat(){
        //Servin Help
        int[][] array = new int[4][4]; 

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                int r = (int)(Math.random()*100+1); 
                array[row][col] = r; 
            }
            //System.out.println("TEST 2, array[row].length: "+array[row].length);
        }

        print(array);     
        
        //System.out.println("TEST 1, array.length: "+array.length);
        
    }

    // =============================================================================================================================

    public static int[][] ReturnMat(){
        //Servin Help
        int[][] array = new int[4][4]; 

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                int r = (int)(Math.random()*100+1); 
                array[row][col] = r; 
            }
            //System.out.println("TEST 2, array[row].length: "+array[row].length);
        }

        S.o("Newly Generated Matrix: "); 
        print(array);
        return array;     
        
        //System.out.println("TEST 1, array.length: "+array.length);
        
    }

    // =============================================================================================================================


    public static void print(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col]+"\t");
            }
            S.o(""); 
        }
        S.o(""); 
    }
    
    // =============================================================================================================================

    
    //  takes user input to make 2d array
    // needs row and column length from user, then can insert numbers 
    // asks if they want to go point to point input,
    // or can input all numbers in single paste, starting input, left to right, top to bottom, 
    // (selects a row, then fills all columns then next to next row and fills all columns there)
    
    public static void matrix_io(){

        // 1. ask dimensions row, col
        // 2. 
        // CREATE A LIMIT ON MARTIX SIZE ( NO BIGGER THAN 10 BY 10) 

        int row; 
        int col; 

        System.out.print("Enter row dimensions: ");
        row = scnr.nextInt();
        System.out.print("Enter col dimensions: ");
        col = scnr.nextInt();

        // ex. row = 3 is 0,1,2
        int[][] array = new int[row][col]; 

        // user input one at a time 
        for(int r = 0; r < array.length; r++){
            for(int c = 0; c < array[r].length; c++){ 
                System.out.print("Enter number at ["+(1+r)+"] x ["+(1+c)+"]: "); 
                array[r][c] = scnr.nextInt(); 
            }
        }
            print(array); 
    }

    // =============================================================================================================================

    public static int[][] populateArray(int r, int c){
        int[][] array = new int [r][c];
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                int ran = (int)(Math.random()*100+1); 
                array[row][col] = ran; 
            }
        }
        return array; 
    }

    public static void slowPrint(int[][] array) throws InterruptedException{
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(ANSI_GREEN+array[row][col]+"\t"+ANSI_RESET);
            }
            S.o(""); 
            Thread.sleep(30); 
        }
    }

    public static void matrixVerse() throws InterruptedException{
        int [][] a = populateArray(1000, 1000);
        slowPrint(a);
    }

    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m"; 

    public static final String ANSI_GREEN = "\u001B[32m"; 



    //2. Print 

    // 1. findSum() it takes a 2d array and calculates the addition of all values 

    public static void sum(int[][] array){

        int sum = 0; 

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                //S.o("1: "+sum); 
                sum += array[row][col];
                //S.o("2: "+sum); 
            } 
        } 
        S.o("Sum: "+sum);
    }

    // 2. findAVG() it takes a 2d array and calculate average of the matrix values 

    public static void findAVG(int[][] array){

        int sum = 0; 
        int AVG = 0;

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                
                AVG = array.length*array[row].length;
                
                //S.o("1: "+sum); 
                sum += array[row][col];
                //S.o("2: "+sum); 
            } 
        } 
        
        //int AVG = row*col; 
        //protected static int AVG = array.length*array[row].length;

        S.o("AVG: "+sum/AVG);
    }

    // 3. findMaxPerRow() it takes a 3d array and will print the largest value in each row

    public static void findMaxPerRow(int[][] array){

        int rows = array.length; 
        int[] results = new int[rows]; 

        int i = 0; 
        int max = 0; 
        while(i<rows){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j]; 
                }
            }
            results[i] = max; 
            max = 0;
            i++; 
        }
        printMaxRow(results); 
    }

    public static void printMaxRow(int[] results){
        for(int i = 0; i < results.length; i++){
            S.o("row "+(i+1)+": "+results[i]); 
        }
    }


    // 4. findMaxPerColum() it takes a 3d array and will print the largest value in each colum 

    public static void findMaxPerCol(int[][] array){

        int cols = array[0].length; 
        //int[] results = new int[cols]; 

        //for(int i = 0; i < cols; i++) 
        // OLD CODE: for(int i = 0; i < array[i].length; i++)
        for(int i = 0; i < cols; i++){
            int max = array[0][i]; 
            for(int j = 1; j < array[i].length; j++)
                if(array[j][i] > max)
                    max = array[j][i]; 

            S.o("col "+(i+1)+": "+max); 
        }
    }


    // 5. transpose() it takes a 3d array and it will return a 2d transposed from original. a transpose matrix is the translation of rows per column and vise versa 
        
        public static int[][] transpose(int[][] array){
            
            int rows = array.length; 
            int cols = array[rows].length; 

            int [][] newMatrix = new int[rows][cols]; 

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    newMatrix[j][i] = array[i][j]; 
                }
            }


            return newMatrix;

        }

        // create exception that crashes when matrix isnt transposable 
        public static void transposePrint(int[][] array){
            
            int rows = array.length; 
            int cols = array[0].length; 

            int [][] newMatrix = new int[rows][cols]; 

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    newMatrix[j][i] = array[i][j]; 
                }
            }

            S.o(""); 
            S.o("Newly Transposed Matrix: ");
            print(newMatrix);

        }

    // =============================================================================================================================


    public static void main(String[] args) throws InterruptedException {
        //matrix a1 = new matrix(); 

        //a1.genMat(); 
        //a1.matrix_io();

        // ==================================================== [ Matrix moving ] ==============================================================
        // https://www.youtube.com/watch?v=1k-WPW_b6Ik

        int [][] a = populateArray(1000, 1000); 
        slowPrint(a);

        // https://www.youtube.com/watch?v=1k-WPW_b6Ik

        // matrix.matrixVerse(); // TURN ON AFTER TEST!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // ==================================================== [ Matrix moving ] ==============================================================


        // ==================================================== [ TESTING ] ==============================================================

        // TEST 1: SUM
        // int[][] array = new int[4][4];

        // array = matrix.ReturnMat();
        // matrix.sum(array);

        //---------------------------------------------

        // TEST 2: AVG
        // int[][] array = new int[4][4];

        // array = matrix.ReturnMat();
        // matrix.findAVG(array);

        //---------------------------------------------

        // TEST 3: Max Per Row
        
        // int[][] array = new int[4][4];

        // array = matrix.ReturnMat();
        // matrix.findMaxPerRow(array);

        //---------------------------------------------

        // TEST 4: Max Per Col

        // int[][] array = new int[4][4]; 

        // array = matrix.ReturnMat(); 
        // matrix.findMaxPerCol(array);

        //---------------------------------------------

        // TEST 4: Transpose 

        // int[][] array = new int[4][4];

        // array = matrix.ReturnMat(); 
        // matrix.transposePrint(array);


        // ==================================================== [ TESTING ] ==============================================================

        


        // create a save option where the numbers are stored in a cache and users can use them 
        // 
    }

}   
// ==================================================== [ END OF PROGRAM  ] ==============================================================

// ==================================================== [ PERSONAL NOTES ] ==============================================================
    // =============================================================================================================================


        // Personal Trial

        // Random mix = new Random(); 
        // int number; 

        // //2d will have 4x4 
        // for(int counter = 1; counter <= 10; counter++){
        //     number = 1+random.nextInt(16);
        // }
