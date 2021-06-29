package day1;
import java.util.Scanner;
public class TestGetMonthDays
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();int month=input.nextInt();
        System.out.println(getMonthDays(year,month));
    }
    public static int getMonthDays(int year,int month)
    {
        int[] mon=new int[13];
        mon[1]=31;mon[2]=28;mon[3]=31;mon[4]=30;mon[5]=31;mon[6]=30;mon[7]=31;mon[8]=31;mon[9]=30;mon[10]=31;mon[11]=30;mon[12]=31;
        if(isLeapYear(year))
        {
            if(month==2)
            {
                return 29;
            }
            else
            {
                return mon[month];
            }
        }
        else
        {
            return mon[month];
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