package task1;

import java.lang.String;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
            int num1, num2;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter first num");
            num1=in.nextInt();
            System.out.println("Enter second num");
            num2=in.nextInt();
            System.out.println("First num:" + num1);
            System.out.println("Second num:" + num2);

            EvklidAlg evklidalg=new EvklidAlg(num1,num2);
            System.out.println("GCD " + num1 + " and " + num2 + " = " + evklidalg.UsualEvklidAlg(num1, num2) );
            System.out.println("GCD Floor mod " + num1 + " and " + num2 + " = " + evklidalg.EvklidAlgFloorMod(num1, num2) );
            System.out.println("GCD rem " + num1 + " and " + num2 + " = " + evklidalg.EvklidAlgRem(num1, num2) );
    }
}
