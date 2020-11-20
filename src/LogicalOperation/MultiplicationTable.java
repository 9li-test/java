package LogicalOperation;

public class MultiplicationTable {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int a = 1; a <= i; a++) {//这边a <= i来控制多余的乘法表达式，就是1只能乘以1，2只能乘以1，2，依次类推
//                System.out.print(i + "*" + a + "=" + i * a + "\t");//这\t就是单行之间加空格
//            }
//            System.out.println();//每操作完一行换行，这里是下面这个for
//        }
        for (int i = 1; i < 10; i++) {
            for (int a = 1; a <= 9; a++) {//这边a <= i来控制多余的乘法表达式，就是1只能乘以1，2只能乘以1，2，依次类推
                if(a>i){//只有*右边大于左边的才跳过，避免重复
                    break;
                }
                System.out.print(i + "*" + a + "=" + i * a + "\t");//这\t就是单行之间加空格
            }
            System.out.println();//每操作完一行换行，这里是下面这个for
        }
    }
}
