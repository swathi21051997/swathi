import java.io.*;
import java.util.*;
class Power
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int p=ob.nextInt();
        int result=(int)(Math.pow(a,p));
        System.out.print(result);
    }
}
