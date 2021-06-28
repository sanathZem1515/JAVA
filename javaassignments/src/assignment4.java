import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.Date;
public class assignment4
{
//    public static int check(String a,String b)
//    {
//        return a.compareTo(b);
//    }
//    public static boolean compare(GregorianCalendar a,GregorianCalendar b)
//    {
//
//        int val=check(a.YEAR+"",b.YEAR+"");
//        if(val==1)
//        {
//            return true;
//        }
//        else if()
//    }
//    public static void printed(GregorianCalendar a)
//    {
//        System.out.print(a.get)
//    }

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
//            solve(s.next(),s.next());
//            System.out.println(i1);
            String a =s.next();
            String b=s.next();

            solve(a,b);

        }
    }
}
