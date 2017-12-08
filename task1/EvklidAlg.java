package task1;
import java.lang.Math;
public class EvklidAlg {

    public static int num1,num2;

    public EvklidAlg(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public static int UsualEvklidAlg(int num1, int num2)//doesn`t work correct with two negative numbers, 
                                                        //for example gcd(2,-1)=-1 
    {
        /*if (num2 == 0)
            return num1;
        else
            return  UsualEvklidAlg(num2, num1 % num2);*/
        while (num1!=0 && num2!=0) {
            if (Math.abs(num1) > Math.abs(num2))
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        return num1 + num2;
    }

    public static int EvklidAlgFloorMod(int num1, int num2) //does not work correct with first positive and second negative
    {
        /*if (num2 == 0)
            return num1;
        else
            return  EvklidAlgFloorMod(num2, Math.floorMod(num1,num2));
        */
        while (num1!=0 && num2!=0) {
            if (Math.abs(num1) > Math.abs(num2))
                num1 = Math.floorMod(num1 , num2);
            else
                num2 = Math.floorMod(num2 , num1);
        }
        return num1 + num2;
    }
    public static int EvklidAlgRem(int num1, int num2) //correct
    {
     /*   if (num2 == 0)
            return Math.abs(num1);
        else
            return  EvklidAlgRem(num2, Math.abs(num1)%Math.abs(num2));*/
        while (num1!=0 && num2!=0) {
            if (Math.abs(num1) > Math.abs(num2))
                num1 = Math.abs(num1 % num2);
            else
                num2 = Math.abs(num2 % num1);
        }
        return num1 + num2;
    }
}
