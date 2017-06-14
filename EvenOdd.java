import java.io.*;
import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        if(a%2==0)
        {
            System.out.print("even");
        }
        else
        System.out.print("odd");
    }
}
