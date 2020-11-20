package LogicalOperation;

public class IfEles1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 12;
        if (a == b && b == c) {
            System.out.println("a，b和c相等");
        } else if (a > b && a > c) {
            System.out.println("a最大" + a);
            System.out.println("这个python的elif差不多");
        } else if (b > a && b > c) {
            System.out.println("b为最大" + b);
            System.out.println("这个python的elif差不多");
        } else if (c > a && c > b) {
            System.out.println("c为最大" + c);
            System.out.println("这个python的elif差不多");
        }
    }
}
