import java.util.*;
import java.io.*;

class Program270
{
    public static void main(String arg[]) throws Exception
    {
        
        Scanner sobj = new Scanner(System.in);
        

        System.out.println("Enter the name of Pack File that you want to unpack: ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);
        FileInputStream fiobj = new FileInputStream(fobj);

        byte Header[] = new byte[100];

        fiobj.read(Header,0,100);
        String Hstr = new String(Header);

        System.out.println(Hstr);

        System.out.println("Length of Header  String is: "+Hstr.length());

        String str = Hstr.trim();

        System.out.println("Length of final Header  String is: "+str.length());
    }      
}
