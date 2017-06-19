import java.io.*;
import java.util.*;
class Digits
{
    public static void main(String args[])
    {   
        int i=0;
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.print("the no of digits is"+i);
        
    
    }
}
