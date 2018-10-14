package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P2_FuncionAckermannRecursivo {


    public static int n;
    public static int m;
    public static long result;

    public static void main(String[] args) {

       try {
           Scanner input = new Scanner(System.in);
           System.out.println("Introduce m:");
           m = Integer.parseInt(input.nextLine());
           System.out.println("Introduce n:");
           n = Integer.parseInt(input.nextLine());
           result = Ackerman(m,n);
           System.out.println("Ack(" + m + "," + n + ") = " + result);
       }catch (InputMismatchException input){
           System.err.println("Error: "+input.getMessage());
       }catch (StackOverflowError stackOverflowError){
           System.err.println("Error: "+stackOverflowError.getMessage());
       }catch (OutOfMemoryError outOfMemoryError){
           System.err.println("Error: "+outOfMemoryError.getMessage());
       }


    }


    /**
     * Ackermann method
     * @param m
     * @param n
     * @return
     */
    public static long Ackerman(long m,long n){
        if(m == 0){
            return (n + 1);
        }else if(m > 0 && n == 0){
            return Ackerman(m - 1, 1);
        }else{
            return Ackerman(m - 1, Ackerman(m, n - 1));
        }
    }
}
