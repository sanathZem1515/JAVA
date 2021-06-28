import edu.duke.*;

public class CaesarCipher
{
    public char change(char ch,int key)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet1 = "abcdefghijklmnopqrstuvwxyz";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+ alphabet.substring(0,key);
        String shiftedAlphabet1 = alphabet1.substring(key)+ alphabet1.substring(0,key);

        int idx = alphabet.indexOf(ch);
        //If currChar is in the alphabet
        if(idx != -1){
            //Get the idxth character of shiftedAlphabet (newChar)
            char newChar = shiftedAlphabet.charAt(idx);
            //Replace the ith character of encrypted with newChar
            return newChar;
        }

        idx=alphabet1.indexOf(ch);

        if(idx != -1){
            //Get the idxth character of shiftedAlphabet (newChar)
            char newChar = shiftedAlphabet1.charAt(idx);
            //Replace the ith character of encrypted with newChar
            return newChar;
        }
        return ch;
    }
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet

        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            encrypted.setCharAt(i,change(currChar,key));


            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input,int key1,int key2)
    {
        StringBuilder encrypted = new StringBuilder(input);
       for(int i=0;i<input.length();i++)
       {
           char currChar = input.charAt(i);
           if(i%2==0)
           {
               encrypted.setCharAt(i,change(currChar,key1));
           }
           else
           {
               encrypted.setCharAt(i,change(currChar,key2));
           }
       }
       return encrypted.toString();
    }

    public boolean isVowel(char ch)
    {
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }

        if(ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            return true;
        }

        return false;
    }

    public void testCaesar()
    {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
        String enc = encryptTwoKeys("First Legion",23,17);
        System.out.println(enc);
    }
    public static void main(String args[])
    {
        CaesarCipher c = new CaesarCipher();
        c.testCaesar();
    }
}

