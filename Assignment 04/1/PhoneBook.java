/*
----------------------------------------------------------------------------------------------------------------------
 *Write an application that allows a user to enter the names and phone numbers of up to 20 friends.
 *Continue to prompt the user for names and phone numbers until the user enters “ zzz” or has entered 20 names, 
 *whichever comes first. When the user is finished entering names, produce a count of how many names were entered, 
 *but make certain not to count the application-ending dummy “ zzz” entry. Then display the names. Ask the user to 
 *type one of the names and display the corresponding phone number. Save the application as PhoneBook.java.
 ----------------------------------------------------------------------------------------------------------------------
 */

 import java.io.*;
 import java.util.*;

 class PhoneBook
 {
     public static void main(String args[]) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Long> hmap = new HashMap<String, Long>();
        
        String name;
        long number;

        System.out.println("****PhoneBook*****");

         System.out.println("Max entries 20");
         System.out.println("Type ' zzz' to stop\n");
         System.out.println("Add name and phone number");
         
         for(int i = 0; i < 20; i++)
         {
             System.out.print("\nName : ");
             name = br.readLine();

             if(name.equals(" zzz"))
             {
                 break;
             }

             System.out.print("Ph.No. : ");
             number = Long.parseLong(br.readLine());

             hmap.put(name, number);

         }

         System.out.println("\nYour PhoneBook\n");
         for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Name: " + me.getKey());
          }

        System.out.print("\nEnter a name to check the number: ");
        System.out.println(hmap.get(br.readLine()));

     }
 }
