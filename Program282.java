import java.util.*;
import java.io.*;

class Program282
{
    public static void main(String arg[]) throws Exception
    {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String str = sobj.nextLine();

        str = str.trim();

        System.out.println("After trim : "+str);

        str = str.replaceAll("\\s+"," ");

        System.out.println("After replaceAll : "+str);

        String words[] = str.split(" ");

        System.out.println("Number of words is sentence are "+words.length);

        for(int i = 0; i<words.length; i++)
        {
            System.out.println(words[i]);
        }
    }      
}
