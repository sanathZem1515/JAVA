import java.util.*;
public class assignment2
{
    static boolean check(String str)
    {
        int n=str.length();

        boolean[] alpha = new boolean[26];

        str=str.toLowerCase();
        for(int i=0;i<n;i++)
        {
            alpha[str.charAt(i)-'a']=true;
        }

        for(int i=0;i<26;i++)
        {
            if(!alpha[i])
                return false;
        }
        return true;
    }

    static boolean check2(String str)
    {
        HashSet<Character> hs = new HashSet<>();
        int n=str.length();

        for(int i=0;i<n;i++)
        {
            hs.add(str.charAt(i));
        }

        if(hs.size()==26)
            return true;
        return false;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        if(check2(str))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
