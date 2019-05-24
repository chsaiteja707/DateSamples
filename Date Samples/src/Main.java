


import java.io.BufferedReader;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the date in dd-MM-yyyy");
        String a=br.readLine();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ob=LocalDate.parse(a,dtf);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy, MMMM dd");
        String ma=ob.format(dtf1);
        System.out.println("Select add or subtract");
        System.out.println("1. add");
        System.out.println("2 subtract");
        /*
         LocalDate ob1=LocalDate.now();
		LocalDate ob2=ob1.plus(Period.ofDays(6));
		int days=Period.between(ob1,ob2).getDays();
		System.out.println(days);
		Long days1=ChronoUnit.DAYS.between(ob1, ob2);//to get between days
		System.out.println(days1);
         */
        int ch=Integer.parseInt(br.readLine());
        if(ch==1)
        {
            System.out.println("1. add months");
            System.out.println("2. add days");
            System.out.println("3. add years");
            int n=Integer.parseInt(br.readLine());
            switch(n)
            {
                case 1:
                {
                    System.out.println("enter number of months to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.plus(m, ChronoUnit.MONTHS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after adding months is "+b);
                    break;
                }
                case 2:
                {
                    System.out.println("enter number of days to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.plus(3, ChronoUnit.DAYS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after adding is "+b);
                    break;
                }
                case 3:
                {
                    System.out.println("enter number of years to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.plus(3, ChronoUnit.YEARS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after adding is "+b);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
        else if(ch==2)
        {
            System.out.println("1. subtract months");
            System.out.println("2. subtract days");
            System.out.println("3. subtract years");
            int n=Integer.parseInt(br.readLine());
            switch(n)
            {
                case 1:
                {
                    System.out.println("enter number of months to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.minus(m, ChronoUnit.MONTHS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after subtracting months is "+b);
                    break;
                }
                case 2:
                {
                    System.out.println("enter number of days to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.minus(3, ChronoUnit.DAYS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after subtracting is "+b);
                    break;
                }
                case 3:
                {
                    System.out.println("enter number of years to add");
                    int m=Integer.parseInt(br.readLine());
                    LocalDate ob1=ob.minus(3, ChronoUnit.YEARS);
                    String b=ob1.format(dtf1);
                    System.out.println("the date after subtracting is "+b);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
        else
            System.out.println("Invalid choice");
        System.out.println("want to check wheather date is leap year or not");
        String choice=br.readLine();
        if(choice.equals("yes"))
            {
            if(ob.isLeapYear())
                System.out.println(ma+" is a leap year");
            else
                System.out.println(ma+" is not a leap year");
        }
    }

}

