import java.util.*;

public class vampire
{
//    static ArrayList<String> combs = new ArrayList<String>();
//    static int c=0;

    vampire(String str)
    {
        System.out.println("I am first one");
        new vampire();
//        check(str);
    }

    vampire()
    {
        System.out.println("I am called by first one and I am second");
    }

     void permute(String s , String answer,ArrayList<String> combs)
    {
        if (s.length() == 0)
        {
            combs.add(answer);
//            System.out.println(answer);
//            c++;
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch,combs);
        }
    }

    boolean check(String str)
    {
        ArrayList<String>  combs = new ArrayList<>();
        permute(str,"",combs);

        int n = combs.size();

//        for(int i=0;i<n;i++)
////        {
//            System.out.print(combs.get(i)+" ");
////        }
        int len=str.length();
//        int c=0;
//        System.out.println(len);
        for(int i=0;i<n;i++)
        {
            int mid=len/2;
//            System.out.println(combs.get(i));

            long x = Long.parseLong(combs.get(i).substring(0,mid));
            long y = Long.parseLong(combs.get(i).substring(mid,len));

//            System.out.println(combs.get(i));
//            System.out.println(x+" "+y);

            if(x%10 == 0 && y%10 == 0)
                continue;

            if((x*y)==Long.parseLong(str))
            {
//                c++;
                System.out.println("correct "+str);
                System.out.println(x+"   "+y);
                combs=new ArrayList<>();
                return true;
            }
        }
        return false;
    }


    public static void main(String args[])
    {

        vampire v = new vampire();

        int num=100;
        int i=1000;

//        permute("1234","");
//
////        for(int i1=0;i1<combs.size();i1++)
////        {
////            System.out.print(combs.get(i1)+" ");
////        }

//        check("1260");
        int c=0;
        while(c<10)
        {
            i++;
            String str = i+"";
//            System.out.println(str);
            if(str.length()%2==1)
                continue;
            else
            {
//                System.out.println("sr "+str);
                if(v.check(str))
                    c++;

            }
        }

    }
}
