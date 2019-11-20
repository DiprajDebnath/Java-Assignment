
/*
 ---------------------------------------------------------------------------------------------------
 *Write a Java Program to perform the following:
 *Given a string, return a version without the first 2 chars, except keep the first char if it is 'a' 
 *and keep the second char if it is 'b'. The string may be any length.
    Example:
    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
 ---------------------------------------------------------------------------------------------------
*/

import java.util.*;

class KeepAB
{
    static String deFront(String str)
    {
        if(str.equals("a")) return str;
        else if(str.length() < 2) return "";
        
        boolean first = str.charAt(0) == 'a';
        boolean second = str.charAt(1) == 'b';

        if(first && second) return str;
        else if(!first && second) return str.substring(1);
        else if(first && !second) return str.charAt(0) + str.substring(2);
        else return str;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");

        String str = sc.next();

        System.out.println(deFront(str));
    }
}