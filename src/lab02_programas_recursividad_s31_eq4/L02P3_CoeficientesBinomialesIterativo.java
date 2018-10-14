package lab02_programas_recursividad_s31_eq4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P3_CoeficientesBinomialesIterativo {
    public static int n;
    public static int m;


    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce n:");
            n = Integer.parseInt(input.nextLine());
            System.out.println("Introduce m:");
            m = Integer.parseInt(input.nextLine());


            System.out.println("Coeficientes binomiales: "+coefBin(n, m));

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


    public static int coefBin(int num1, int num2) {
        int i,j;
        int[][] tabla = new int[num1+1][num1+1];

        if(num2 == 0 || num2 == num1) {
            return 1;
        } else {
            for (i=0; i<=num1; i++) {
                tabla[i][0] = 1;
            }

            for (i=1; i<=num1; i++) {
                tabla[i][1] = i;
            }

            for (i=2; i<=num2; i++) {
                tabla[i][i] = 1;
            }

            for (i=3; i<=num1;i++) {
                for (j=2; j<num1; j++) {
                    if(j<=num2) {
                        tabla[i][j] = tabla[i-1][j-1] + tabla[i-1][j];
                    }
                }
            }
        }

        return tabla[num1][num2];

    }



    /*
    public static void main(String[] args) {
        int rows = 10; //Aquí establecemos número de filas Integer.parseInt(args[0]);
        for(int i =0;i<rows;i++) {

            int number = 1;

            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
     */
}
