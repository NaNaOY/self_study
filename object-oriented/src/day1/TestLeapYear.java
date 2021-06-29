package day1;
import java.util.Scanner;

public class TestLeapYear
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int p=input.nextInt();
        if(isLeapYear(p))
        {
            System.out.println(p+"年是闰年");
        }
        else
        {
            System.out.println(p+"年不是闰年");
        }

    }
    public static boolean isLeapYear(int year)
    {
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    return true;
                }
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
   }