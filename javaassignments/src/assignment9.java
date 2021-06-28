import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.*;

public class assignment9
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String regex = "^[A-Z][a-z0-9_-]*[.]$";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            System.out.println("No");
            return;
        }

        Matcher m = p.matcher(str);

        if (m.matches())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
