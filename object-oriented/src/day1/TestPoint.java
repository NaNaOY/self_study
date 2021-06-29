package day1;


import java.util.Scanner;

public class TestPoint {
    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        Point p1 = new Point();
        p1.setX(in.nextDouble());
        p1.setY(in.nextDouble());
        Point p2 = new Point(in.nextDouble(),in.nextDouble());
        System.out.printf("\n两点距离为%.2f" , p1.distance(p2));
        System.out.printf("\n两点距离为%.2f" , p1.distance(20,30));
    }
}

class Point{
    private double X;
    private double Y;
    
    public Point(){}
    public Point(double x,double y){
        this.X=x;
        this.Y=y;
    }
    
    public void setX(double x){
        this.X=x;
    }
    public void setY(double y){
        this.Y=y;
    }
    
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.X-p.X),2)+Math.pow((this.Y-p.Y),2));
    }
    public double distance(double x,double y){
        return Math.sqrt(Math.pow((this.X-x),2)+Math.pow((this.Y-y),2));
    }
}