import java.io.*;
import java.util.*;
class Consonants
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        if(ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("consonant");
        }
        
    }
}

