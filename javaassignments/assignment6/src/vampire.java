import java.util.*;

public class vampire
{
    vampire(String str)
    {
        System.out.println("I am first one");
        new vampire();
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
        int len=str.length();

        for(int i=0;i<n;i++)
        {
            int mid=len/2;
            long x = Long.parseLong(combs.get(i).substring(0,mid));
            long y = Long.parseLong(combs.get(i).substring(mid,len));

            if(x%10 == 0 && y%10 == 0)
                continue;

            if((x*y)==Long.parseLong(str))
            {
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
        int num=100,i=1000,c=0;
        while(c<1000)
        {
            i++;
            String str = i+"";

            if(str.length()%2==1)
                continue;
            else
            {
                if(v.check(str))
                    c++;
            }
        }

    }
}
