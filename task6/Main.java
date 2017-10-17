//package task6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main{
    public static void main(String args[])
    {
    //String s=args[0];
	System.out.println("Input letter: ");
    	char letter=args[0].charAt(0);
        try{
        FileInputStream fis=new FileInputStream("Temp.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int i;
        int count=0;
        while((i=bis.read())!=-1)
        {
            char a=(char)i;
            if(a==letter)
            {
                count++;
            }
        }
        System.out.println("Letter " + letter +" appears in the file "+count+" times");
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }
}
