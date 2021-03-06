package day1;
public class Point {
    private double x,y;
    public Point(){
        
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point x){
        double distance;
        distance = (this.x - x.x)*(this.x - x.x)+(this.y - x.y)*(this.y - x.y);
        return distance;
    }
}