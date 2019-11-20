/*
  -----------------------------------------------------------------------------------------------------
  *Write a Java Program to perform the following:
  *Given a string, count the number of words ending in 'y' or 'z' -- 
  *so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
    Example:
    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2
  ------------------------------------------------------------------------------------------------------
*/

import java.util.*;

class CountYZ
{

    static int countYZ(String str)
    {
        String arr[] = str.split(" ");
        int count = 0;

        for(String temp : arr)
        {
            if(temp.charAt((temp.length())-1) == 'y' || temp.charAt((temp.length())-1) == 'Y' 
               || temp.charAt((temp.length())-1) == 'z' || temp.charAt((temp.length())-1) == 'Z')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        String str = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string.");
        str = sc.nextLine();

        System.out.println("Count = " + countYZ(str));
    }
}