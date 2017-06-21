import java.io.*;
import java.util.*;
class Palindromeno
{
    public static void main(String args[])
    {   
        int count=0,r,rev=0;
        Scanner ob=new Scanner(System.in);
        int N=ob.nextInt();
        int temp=N;
        while(N>0)
        {
            r=N%10;
            rev=(rev*10)+r;
            N=N/10;
        }
        System.out.println(rev);
        if(temp==rev)
        System.out.println("palindrome");
        else
        System.out.println("not");
        
    }
}

