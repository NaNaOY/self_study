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

        System.out.println("p1������Ϊ" + p1);
        System.out.println("p2������Ϊ" + p2);

        p2.movePoint(2, 2);
        System.out.print("p2�ƶ��������Ϊ" + p2);

        input.close();
    }

}