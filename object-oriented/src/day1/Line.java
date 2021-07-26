package day1;

public class Line {
    private Point stratPoint,endPoint;
    public Line(){
        
    }
    public Line(Line line){
        this(line.stratPoint,line.endPoint);
    }
    public Line(Point stratPoint, Point endPoint) {
        this.stratPoint = stratPoint;
        this.endPoint = endPoint;
    }
    public Line(double x1, double y1,double x2,double y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }
    public double getLineLong(){
        return stratPoint.distance(endPoint);
    }
    public Point getStratPoint() {
        return stratPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public void setStratPoint(Point stratPoint) {
        this.stratPoint = stratPoint;
    }
    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    @Override
    public String toString() {
        return "Line{" + "stratPoint=" + stratPoint + ", endPoint=" + endPoint + '}';
    }
    
}