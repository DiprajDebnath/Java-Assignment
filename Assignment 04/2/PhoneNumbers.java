/*
-------------------------------------------------------------------------------------------------------
 *A personal phone directory contains room for first names and phone numbers for 30 people.
 *Assign names and phone numbers for the first 10 people. Prompt the user for a name, 
 *and if the name is found in the list, display the corresponding phone number. 
 *If the name is not found in the list, prompt the user for a phone number, and add the new 
 *name and phone number to the list. Continue to prompt the user for names until the user enters “quit”.
 *After the arrays are full (containing 30 names), do not allow the user to add new entries. 
 *Save the file as PhoneNumbers.java.
 -------------------------------------------------------------------------------------------------------
 */
 import java.io.*;
 import java.util.*;

 class PhoneNumbers
 {
     public static void main(String args[]) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Long> hmap = new HashMap<String, Long>();
        
        String name;
        long number;

        System.out.println("****Phone Numbers****");

         System.out.println("\tMax 30 entries");
         System.out.println("\tEnter 'quit' to stop\n");
         System.out.println("\nAdd name and phone number");
         
         while((hmap.size()) < 30)
         {
             System.out.print("\nName : ");
             name = br.readLine();

             if(name.equals("quit"))
             {
                 break;
             }

             System.out.print("Ph.No. : ");
             number = Long.parseLong(br.readLine());

             hmap.put(name, number);

         }

         System.out.println("\nYour Contacts\n");
         for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Name: " + me.getKey());
          }

        System.out.print("\nEnter names to search for number or Enter 'quit' to exit\n");

        while(true)
        {
            System.out.print("\nSearch for name : ");
            name = br.readLine();
            
            if(name.equals("quit"))
            {
                System.out.println("Bye :)");
                break;
            }

            if(hmap.containsKey(name))
            {
                System.out.println("Number :" + hmap.get(name));
            }
            else
            {
                System.out.println("No match found :( ");
                if((hmap.size()) < 30)
                {
                    System.out.println("Would you like to add a number ?[y or n]");
                    if((br.readLine()).equals("y"))
                    {
                        System.out.print("Ph.No. : ");
                        number = Long.parseLong(br.readLine());
                        hmap.put(name, number);
                        System.out.print("Number added");
                    }
                    else
                    {
                        continue;
                    }

                }
                else
                {
                    System.out.println("No more space available!");
                }
            }
            
        }
     }
 }