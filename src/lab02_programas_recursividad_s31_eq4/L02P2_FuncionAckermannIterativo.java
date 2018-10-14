package lab02_programas_recursividad_s31_eq4;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class L02P2_FuncionAckermannIterativo {

    public static int n;
    public static int m;
    public static long result;

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce m:");
            m = input.nextInt();

            System.out.println("Introduce n:");
            n = input.nextInt();
            result = Ackermann(n,m);
            System.out.println("Ack(" + m + "," + n + ") = " + result);
        }catch (InputMismatchException input){
            System.err.println("Error: "+input.getMessage());
        }catch (StackOverflowError stackOverflowError){
            System.err.println("Error: "+stackOverflowError.getMessage());
        }catch (OutOfMemoryError outOfMemoryError){
            System.err.println("Error: "+outOfMemoryError.getMessage());
        }
    }



    public static int Ackermann(int n, int m){
        Stack<Integer> s = new Stack<Integer>();
        s.add(m);
        while(!s.isEmpty()){
            m=s.pop();
            if(m==0) { n+=m+1; }
            else if(n==0)
            {
                n += 1;
                s.add(--m);
            }
            else{
                s.add(--m);
                s.add(++m);
                n--;
            }
        }
        return n;
    }
}



