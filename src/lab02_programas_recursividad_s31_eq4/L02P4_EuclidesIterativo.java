package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P4_EuclidesIterativo {
    public static int n;
    public static int m;

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce n:");
            n = input.nextInt();
            System.out.println("Introduce m:");
            m = input.nextInt();

            System.out.println("Euclides: "+euclides(n,m));



        }catch (InputMismatchException input){
            System.err.println("Error: "+input.getMessage());
        }catch (StackOverflowError stackOverflowError){
            System.err.println("Error: "+stackOverflowError.getMessage());
        }catch (OutOfMemoryError outOfMemoryError){
            System.err.println("Error: "+outOfMemoryError.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.err.println("Error: "+arrayIndexOutOfBoundsException.getMessage());
        }catch (NullPointerException nullPointerException){
            System.err.println("Error: "+nullPointerException.getMessage());
        }

    }




    public static int euclides(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

}
