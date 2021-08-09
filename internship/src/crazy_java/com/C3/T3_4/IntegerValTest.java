package crazy_java.com.C3.T3_4;

public class IntegerValTest {
    //下面代码是正确的，系统会自动把56当成byte类型处理
    byte a=56;
    /*
    下面代码是错误的，系统不会把39999999999当成long类型处理
    所以超出int的表数范围，从而引起错误
     */
    // long bigValue=99999999999;
    //下面代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
    long bigValue2=92233720368854775807L;
    //以0开头的整数值是八进制的整数
    int octalValue=013;
    //以0x或0X开头的整数值是十六进制的整数
    int hexValue1=0x13;
    int hexValue2=0XaF;
}
