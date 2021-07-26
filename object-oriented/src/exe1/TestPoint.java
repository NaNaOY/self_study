package exe1;

import java.util.Scanner;
import java.util.Scanner;

public class TestPoint {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Point p1=new Point();

        Point p2=new Point();
        p2.setX(input.nextDouble());
        p2.setY(input.nextDouble());

        System.out.println("p1的坐标为" + p1);
        System.out.println("p2的坐标为" + p2);

        p2.movePoint(2, 2);
        System.out.print("p2移动后的坐标为" + p2);

        input.close();
    }

}