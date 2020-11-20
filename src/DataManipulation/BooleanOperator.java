package DataManipulation;

public class BooleanOperator {
    public static void main(String[] args) {
        //布尔类型（boolean）true=真，false=假
        //&& 就是and，并且的意思 数学口诀 一假则假
        //|| 就是or ，或者的意思 数学口诀 一真则真
        //2个&&,||和1个&,|的区别是2个的只要在比较真假时，只要左边的真（假）能决定整个表达式的真假，就不会去判断右边的真（假了）
        boolean a = true;
        boolean b = false;
        System.out.println(b & a);
        //这里就是例子，第一个就因为a为真（true），就没有执行后面的错误语句没有报错，第二个执行了10/0这个错误表达式
        System.out.println(a || 10/0>1);
        System.out.println(a | 10/0>1 );
        //这里也一样，想要执行下面的2句先注释上一句，不然报错会到上一句止步运行
        System.out.println(b && 10/0>1);
        System.out.println(b & 10/0>1);


    }
}
