import java.io.*;
import java.util.*;
class Leapyear
{
    public static void main(String args[])
    {   
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        if((n%400 == 0) || ((n%4 == 0) && (n%100!=0)))
        {
            System.out.print("leap Year");
        }
        else
        {
            System.out.print("Not a leap year");
        }
    }
}


