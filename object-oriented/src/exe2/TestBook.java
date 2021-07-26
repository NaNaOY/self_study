package exe2;
import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Book book1=new Book();

        Book book2=new Book();
        book2.setBookName(input.next());
        book2.setAuthor(input.next());
        book2.setPrice(input.nextDouble());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println();

        book1.setBookName("面向对象技术");
        book1.setAuthor("张三");
        book1.setPrice(50);

        System.out.println(book1.toString());
        System.out.print(book2.toString());
        input.close();
    }

}