import java.util.*;
import java.io.*;

class Program249
{

    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        boolean bret = false;

        bret = fobj.createNewFile();

        if(bret == true)
        {
            System.out.println("File gets created Sucessfully.");
        }
        else
        {
            System.out.println("Unable to create file");
        }


    }
}