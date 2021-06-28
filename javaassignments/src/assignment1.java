import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class assignment1
{
    static void display(String file_path,String reg)
    {
        File f = new File(file_path);

        Pattern pattern = Pattern.compile(reg);

        for (File pathname : f.listFiles())
        {
//            m=pattern.matcher("geeksforgeeks.org");
            String pathname1 = pathname.getAbsolutePath();
            if(pattern.matcher(pathname1).find()) {

                System.out.println(pathname1);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("for exit type quit");
            String reg=s.next();
            if(reg.equals("quit"))
                break;
            display("C:/Users/sanat/Desktop",reg);
        }


    }
}
