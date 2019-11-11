/*
 ------------------------------------------------------------------------------------
 *Write an application containing three parallel arrays that hold 10 elements each. 
 *The first array holds four-digit student ID numbers, the second holds first names, 
 *and the third holds the students’ grade point averages. Read a student ID number and 
 *display the student’s first name and grade point average. If a match is not found, 
 *display an error message that includes the invalid ID number and allow the user to 
 *search for a new ID number. Save the file as StudentIDArray.java.
 --------------------------------------------------------------------------------------
 */
 
 import java.util.*;
 import java.io.*;

 class StudentIDArray
 {
     public static void main(String args[]) throws IOException
     {
         Scanner sc = new Scanner(System.in);

         int sID[] = new int[10];
         String fName[] = new String[10];
         float grade[] = new float[10];

         System.out.println("Make entries of 10 students\n");

         for(int i = 0; i < 3; i++)
         {
             System.out.print("4-digit student ID number : ");
             sID[i] = sc.nextInt();
             System.out.print("First Name : ");
             fName[i] = sc.next();
             System.out.print("Grade : ");
             grade[i] = sc.nextFloat();
         }


         while(true)
         {
            System.out.println("\nEnter ID to check records or '0' to exit");
            int temp = sc.nextInt();

            if(temp == 0)
            {
                break;
            }

            for(int i = 0; i < 10; i++)
            {
                if(sID[i] == temp)
                {
                    System.out.println("\nID : " + sID[i] + "\nFirst Name : " + fName[i] + "\nGrades : " + grade[i]);
                    break;
                }
                if(i == (sID.length - 1))
                {
                    System.out.println("Not available");
                }
            }
         }
     }
 }