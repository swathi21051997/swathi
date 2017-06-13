import java.io.*;
import java.util.*;
class Character
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        char ch[]=s.toCharArray();
        if(ch[0]>='a' &&ch[0]<='z')
        {
            System.out.println("Character");
        }
        else
        {
            System.out.println("Not a Character");
        }
        
    }
}

