package chapter13.pr6;

public class StringFormat {
    int a = 0;
    float b = 0;
    double c = 0;
    long d = 0;
    StringFormat(int i, long l, float f, double d) {
        this.a = i;
        this.d = l;
        this.b = f;
        this.c = d;
    }
    @Override
    public String toString() {
        return String.format("[ %d. %f, %f, %d ]",a,b,c,d);

    }

    public static void main(String[] args) {
        StringFormat stringFormat = new StringFormat(-2147483648, -9223372036854775808L, 1.1754943508222875E-38f, 2.2250738585072014E-308);
        System.out.println(stringFormat.toString());
    }
}
