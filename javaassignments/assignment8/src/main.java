import java.util.*;

public class main
{
    public static void  main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        try
        {
            if(i==1)
            {
                throw new Exception1("i never is 1");
            }
            if(i==2)
            {
                throw new Exception2("i never is 2");
            }
            if(i==3)
            {
                throw new Exception3("i never is 3");
            }
            if(i==4)
            {
                throw new NullPointerException("null");
            }
        }
        catch(Exception1 | Exception2 | Exception3 err)
        {
            System.out.println(err);
        }
        finally
        {
            System.out.println("finally");
        }

    }

}
