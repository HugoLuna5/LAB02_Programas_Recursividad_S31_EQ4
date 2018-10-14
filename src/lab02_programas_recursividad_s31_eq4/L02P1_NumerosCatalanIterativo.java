package lab02_programas_recursividad_s31_eq4;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L02P1_NumerosCatalanIterativo {

    public static void main(String[] args) {
        try{

            String cadenaLimite = JOptionPane.showInputDialog(null,
                    "Ingrese el número de elementos",
                    "Números de Catalan",
                    JOptionPane.QUESTION_MESSAGE);

            int n = Integer.parseInt(cadenaLimite);

            JTextArea textArea = new JTextArea("");
            textArea.append("Contador\tCatalan\n");
            textArea.append("********************\n");
            //System.out.println(CNDP(n));
            System.out.println(CNcnk(n));

            JOptionPane.showMessageDialog(null,
                    textArea,
                    "Números de Catalan",
                    JOptionPane.INFORMATION_MESSAGE);

        }catch (InputMismatchException input){
            System.err.println("Error: "+input.getMessage());
        }catch (StackOverflowError stackOverflowError){
            System.err.println("Error: "+stackOverflowError.getMessage());
        }catch (OutOfMemoryError out){
            System.err.println("Error: "+out.getMessage());
        }

    }


    static long CNDP(int n) {
        long[] catalan = new long[n + 1];
        catalan[0] = catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan[n];
    }

    static long CnkIterative(int n, int k) {
        long res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    static long CNcnk(int n) {
        long c = CnkIterative(2 * n, n);
        return c / (n + 1);
    }


}

