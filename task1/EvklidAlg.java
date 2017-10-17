package task1;
import java.lang.Math;
public class EvklidAlg {

    public static int num1,num2;

    public EvklidAlg(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public static int UsualEvklidAlg(int num1, int num2)//doesn`t work correct with two negative numbers, zero and negative
                                                        //for example gcd(2,-1)=-1 gcd(-5,0)=-5
    {
        if (num2 == 0)
            return num1;
        else
            return  UsualEvklidAlg(num2, num1 % num2);
    }

    public static int EvklidAlgFloorMod(int num1, int num2)
    {
        if (num2 == 0)
            return num1;
        else
            return  EvklidAlgFloorMod(num2, Math.floorMod(num1,num2));
    }
    public static int EvklidAlgRem(int num1, int num2)
    {
        if (num2 == 0)
            return Math.abs(num1);
        else
            return  EvklidAlgRem(num2, Math.abs(num1)%Math.abs(num2));
    }
}
