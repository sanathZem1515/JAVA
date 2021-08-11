import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class assignment4
{
    public static void solve(String a,String b) throws ParseException
    {
        Date old1=new SimpleDateFormat("dd-MM-yyyy").parse(a);
        Date curr1 = new SimpleDateFormat("dd-MM-yyyy").parse(b);

        GregorianCalendar old = new GregorianCalendar();
        old.setTime(old1);
        GregorianCalendar curr = new GregorianCalendar();
        curr.setTime(curr1);


        int old_year=old.getWeekYear();
        int curr_year=curr.getWeekYear();

        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        formatter.setLenient(false);

        if(old_year<curr_year)
        {
            int diff = curr_year-old_year;
            old.add(1,diff);

            old.add(5,-30);
            System.out.print(formatter.format(old.getTime())+" ");
            old.add(5,60);

            if(old.before(curr))
            {
                System.out.println(formatter.format(old.getTime()));
            }
            else
            {
                System.out.println(formatter.format(curr.getTime()));
            }
        }
        else
        {
            System.out.println("No range");
        }

    }
    public static void main(String args[]) throws ParseException
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println();


        for(int i1=0;i1<n;i1++)
        {
            String a =s.next();
            String b=s.next();

            solve(a,b);

        }
    }
}
