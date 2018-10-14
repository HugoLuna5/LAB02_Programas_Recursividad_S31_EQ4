package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P5_CadenaInvertidaIterativo {


    private static Scanner sc;

    public static void main(String[] args) {

        try{
        sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        sc.close();
        String invertida = invertirCadena(cadena);
        //String invertidaReverse = invertirCadenaReverse(cadena);
        System.out.printf("Cadena introducida: %s", cadena);
        System.out.printf("%nCadena invertida: %s", invertida);
        //System.out.printf("%nCadena invertida reverse: %s", invertidaReverse);
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

    private static String invertirCadena(String cadena) {
        String invertida = "";
        for(int i=cadena.length()-1;i>=0;i--){
            invertida = invertida + cadena.charAt(i);
        }
        return invertida;
    }

   /*
    private static String invertirCadenaReverse(String cadena){
        StringBuilder builder = new StringBuilder(cadena);
        return builder.reverse().toString();
    }
    */

}
