import java.io.*;
import java.util.*;
class Largestthree
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        if((a>b) && (a>c))
        {
            System.out.print(+a);
        }
        if((b>a) && (b>c))
        {
            System.out.print(+b);
        }
        if((c>a) && (c>b))
        {
            System.out.print(+c);
        }
    }
}
