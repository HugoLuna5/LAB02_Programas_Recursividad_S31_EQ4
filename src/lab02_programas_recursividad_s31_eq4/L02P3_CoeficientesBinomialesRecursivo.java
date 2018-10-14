package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P3_CoeficientesBinomialesRecursivo {
    public static int n;
    public static int m;

    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce n:");
            n = Integer.parseInt(input.nextLine());
            System.out.println("Introduce m:");
            m = Integer.parseInt(input.nextLine());


            System.out.println("Coeficientes binomiales: "+coefbin(n, m));

        }catch (InputMismatchException input){
            System.err.println("Error: "+input.getMessage());
        }catch (StackOverflowError stackOverflowError){
            System.err.println("Error: "+stackOverflowError.getMessage());
        }catch (OutOfMemoryError outOfMemoryError){
            System.err.println("Error: "+outOfMemoryError.getMessage());
        }

    }



    public static int coefbin(int n, int k){
        if(k == 0 || k == n)
            return 1;
        else if(k > n)
            return 0;
        else
            return coefbin(n-1, k-1) + coefbin(n-1, k);
    }
}


