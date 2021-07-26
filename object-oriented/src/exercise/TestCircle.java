package exercise;

public class TestCircle {
    public static void main(String[]args){
        Circle c1 = new Circle();
        Point p1 = new Point(3.0,4.0);
        Point p2 = new Point(7.0,8.0);
        c1.setCenter(p1);
        c1.setRadius(4.0);
        System.out.println("c1的圆心坐标为 (" + c1.getCenter().getX() + ',' + c1.getCenter().getY() + ')');
        System.out.println("c1的面积为 " + c1.getArea(c1) + ", c1的周长为 " + c1.getPerimeter(c1));
        Circle c2 = new Circle(p2,5.2);
        Point p = new Point();
        p.setX(3.2);
        p.setY(4.5);
        System.out.println("p是否在c2内 " + c2.contains(p));
        System.out.println("c2的面积为 " + c2.getArea(c2) + ", c2的周长为 " + c2.getPerimeter(c2));
    }
}
class Point{
    private double x,y;
    Point(){
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    void setX(double _x){
        x = _x;
    }
    void setY(double _y){
        y = _y;
    }     
    double distance(Point p){
        double d;
        d = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        return d;
    }
}
class Circle{
    private Point center = new Point();
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(Point p,double r){
        center = p;
        radius = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point _o) {
        center = _o;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Boolean contains(Point p ){
        boolean i = (radius > p.distance(center));
        return i;
    }
    public double getArea(Circle p){
        double s = Math.PI * p.radius * p.radius;
        return s;
    }
    public double getPerimeter(Circle p){
        double l = Math.PI * 2 * p.radius;
        return l;
    }
}