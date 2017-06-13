import java.io.*;
import java.util.*;
class PositiveNeg
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        if(n>0)
        {
            System.out.println("positive");
        }
        if(n<0)
        {
            System.out.println("negative");
        }
        if(n==0)
        {
            System.out.println("zero");
        }
    }
}
