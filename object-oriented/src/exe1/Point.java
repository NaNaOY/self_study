package exe1;
public class Point {
    private  double x;
    private  double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public void movePoint(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    @Override
    public String toString() {
        return "(" +
                "" + x +
                ", " + y +
                ')';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
