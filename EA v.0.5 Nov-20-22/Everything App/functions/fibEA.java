package functions;
import java.io.IOException;
import java.nio.file.*;

public class fibEA {
    static int fibonacci(int n)
    {
        int past = 0, current = 1, sum;
        if (n == 0)
            return past;
         else if (n < 0)
            return -1;
        for (int i = 2; i <= n; i++)
        {
            sum = past + current;
            past = current;
            current = sum;
        }
        return current;
    }

    public static int recFib(int n)
    {
        // int past = 0, current = 1, sum = past + current; 
        // if(n == 0) return past; else if(n < 0) return -1; return sum + recFib(n+current); 

        if(n <= 1)
            return n; 
        return recFib(n -1) + recFib(n - 2);
    }

    public static String rFibCode() throws IOException{
        return new String(Files.readAllBytes(Paths.get("C:/Users/PC_SS/Desktop/Everything App/txtFiles/recFib.txt")));
    }
}





    // static int fibonacci(int n)
    // {
    //     int past = 0, current = 1, sum;
    //     if (n == 0)
    //         return past;
    //      else if (n < 0)
    //         return -1;
    //     for (int i = 2; i <= n; i++)
    //     {
    //         sum = past + current;
    //         past = current;
    //         current = sum;
    //     }
    //     return current;
    // }

    // static int recFib(int n)
    // {
    //     int past = 0, current = 1, sum = past + current; 
    //     if(n == 0) return past; else if(n < 0) return -1; return sum + recFib(n); 
    // }


