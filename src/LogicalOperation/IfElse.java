package LogicalOperation;

//三个数求最大数,不考虑等于情况
public class IfElse {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 12;
        if (a > b) {
            if (a > c) {
                System.out.println("a为最大值" + a);
            }
            else {//a<c,a>b
                System.out.println("c为最大值" + c);
            }
        }
        else {//a<b
            if (a > c) {//a<b,a>c
                System.out.println("b为最大值" + b);
            }
            else {//a<b.a<c
                if (b > c){
                    System.out.println("b为最大值" + b);
                }
                else {
                    System.out.println("c为最大值" + c);
                }
            }

        }
    }
}
