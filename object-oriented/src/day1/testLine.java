package day1;

import java.util.Scanner;
public class testLine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Line[] L1 = new Line[6];
        double max = 0;
        for(int i=0;i<6;i++){
            L1[i]=new Line(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
        }
        for(int i=0;i<6;i++){
            if(max<L1[i].getLineLong())
                max = L1[i].getLineLong();
        }
        System.out.print("最长线段的长度是："+max);
    }
}