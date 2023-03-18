package functions;

public class N_0_N {
    public static void printNumPattern(int num1, int num2){
        if(num1<= 0){
          System.out.print(0+" "); 
          return; 
        }
        else{
          System.out.print(num1+" "); 
          printNumPattern(num1-num2, num2);
          System.out.print(num1+" "); 
        }
    }
    public static void main(String[] args) {
    
        int num1 = 12; 
        int num2 = 3; 
    
        printNumPattern(num1, num2);
    
        }
}




