import java.io.File;

import java.io.IOException;
import java.util.HashMap;

import java.util.Scanner;

public class assignment11
{
    public static void main(String args[]) throws IOException
    {
        String path= "C:\\Users\\sanat\\Desktop\\Zemoso\\JAVA\\javaassignments\\assignment11_data.txt";

        File file = new File(path);
        Scanner s = new Scanner(file);

        HashMap<String,Integer> hm = new HashMap<>();

        while (s.hasNext())
        {
            String temp = s.next();

            if(hm.containsKey(temp))
            {
                hm.put(temp,hm.get(temp)+1);
            }
            else
            {
                hm.put(temp,1);
            }
        }

        hm.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

    }
}

