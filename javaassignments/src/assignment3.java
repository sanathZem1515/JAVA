import java.util.*;
import java.net.*;
import java.io.*;
public class assignment3
{
    static ArrayList<Long> ar = new ArrayList<Long>();
    static int c=0;
    public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException
    {
        int prod=10000;
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println(System.currentTimeMillis());
        currentTime = (long)System.currentTimeMillis()*prod - (long)currentTime*prod;
        if (geek.isReachable(5000))
        {
            ar.add(currentTime/prod);
            c++;
            System.out.println("Host is reachable"+currentTime);
        }

        else
            System.out.println("Sorry ! We can't reach to this host");
    }

    public static void sendPing(ArrayList<String> commandList) throws Exception
    {
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;

//        System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
//            String temp[] = s.split("=");
//            System.out.println(temp[2]);
            System.out.println(s);
        }
//        System.out.println("error (if any): ");
//        while((s = Error.readLine()) != null)
//        {
//            System.out.println(s);
//        }
    }

    public static void main(String args[]) throws  Exception
    {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            ArrayList<String> commandList = new ArrayList<String>();
            System.out.println("enter ip address or type >>quit<< for exit");
            String ip=s.next();
            if(ip.equals("quit"))
                break;
            commandList.add("ping");
            // can be replaced by IP
            commandList.add(ip);

            sendPing(commandList);
        }

        System.out.println("Median is"+ar.get(c/2));


    }
}
