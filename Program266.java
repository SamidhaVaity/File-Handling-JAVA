import java.util.*;
import java.io.*;

class Program266
{

    public static void main(String arg[]) throws Exception  
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory: ");
        String DirectoryName = sobj.nextLine();

        System.out.println("Enter the name of packed file that you want to create: ");
        String PackedFile = sobj.nextLine();

        File fobjPack = new File(PackedFile);

        boolean bret = fobjPack.createNewFile();
        if(bret==false)
        {
            System.out.println("Unable to create packed file..");
            return;
        }

        File fobj = new File(DirectoryName);

        bret = fobj.isDirectory();
        if(bret == true)
        {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are:"+Arr.length);

            String Header = null;
            FileOutputStream fcombine = new FileOutputStream(PackedFile);

            //Travel Directory
            for(int i =0; i<Arr.length; i++)
            {
                //create header
                Header = Arr[i].getName()+" "+Arr[i].length();

                //Add extra white spaces at the end of header
                for(int j=Header.length(); j<100; j++)
                {
                    Header = Header + " ";
                }

                //Convert string header into byte array
                byte hArr[] = Header.getBytes();

                //write header omto combine file
                fcombine.write(hArr,0,100);
                
                //write the data into packed file after header
                byte Buffer[] = new byte[1024];
                int iRet = 0;

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                } 

                fiobj.close();
                foobj.close();
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
        
    }
}