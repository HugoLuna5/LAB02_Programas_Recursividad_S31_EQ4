/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class L02P5_CadenaInvertidaRecursivo {
    private static Scanner sc;

    public static void main(String[] args) {

        try{
        sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        sc.close();
        String invertida = invertirCadena(cadena);
        System.out.printf("Cadena introducida: %s%n", cadena);
        System.out.printf("Cadena invertida: %s", invertida);

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

    private static String invertirCadena(String cadena){
        if(cadena.length()==1){
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
