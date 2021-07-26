package exercise;

import java.util.Scanner;
public class testFan
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Fan f1=new Fan();Fan f2=new Fan();
        f1.setSpeed(Fan.FAST);
        f2.setSpeed(Fan.MEDIUM);
        f1.setRadius(input.nextDouble());f1.setColor(input.next());f1.setOn(input.nextBoolean());
        f2.setRadius(input.nextDouble());f2.setColor(input.next());f2.setOn(input.nextBoolean());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
class Fan
{
    final static int SLOW=1,MEDIUM=2,FAST=3;
    private int speed=1;
    private double radius=5;
    private String color="blue";
    private boolean on=false;
    Fan()
    {

    }
    Fan(int spe,double r,String col,boolean key)
    {
        speed=spe;radius=r;color=col;on=key;
    }
    void setSpeed(int a)
    {
        speed=a;
    }
    void setRadius(double a)
    {
        radius=a;
    }
    void setColor(String s)
    {
        color=s;
    }
    void setOn(boolean k)
    {
        on=k;
    }
    int getSpeed()
    {
        return speed;
    }
    double getRadius()
    {
        return radius;
    }
    String getColor()
    {
        return color;
    }
    boolean getOn()
    {
        return on;
    }
    public String toString()
    {
        if(on)
        {
            return "该风扇的速度为"+speed+"\n颜色是"+color+"\n半径是"+radius;
        }
        else
        {
            return "风扇没有开启"+"\n该风扇的颜色是"+color+"\n半径是"+radius;
        }
    }
}