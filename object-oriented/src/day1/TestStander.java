package day1;
import java.util.Scanner;
public class TestStander
{
    public static void main(String[] args)
    {
        double[] p=new double[6];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            p[i]=input.nextDouble();
        }
        System.out.println("平均值是 "+mean(p));
        System.out.println("标准差是 "+deviation(p));
    }
    public static double mean(double[] x)
    {
        double sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        return sum/x.length;
    }
    public static double deviation(double[] x)
    {
        double meann=mean(x);
        double sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=(x[i]-meann)*(x[i]-meann);
        }
        return Math.sqrt(sum/(x.length-1));
    }
}