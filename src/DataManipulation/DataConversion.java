package DataManipulation;

public class DataConversion {
    public static void main(String[] args) {
        //研究小数double强转整数int
        double randDecimals=Math.random();
        int integer=(int)(randDecimals);
        System.out.println("随机小数为"+randDecimals+",转换为的整数为"+integer);
        //得到的一些结果
        //随机小数为0.473728930034902,转换为的整数为4
        //随机小数为0.7834005371447018,转换为的整数为7
        //随机小数为0.8590233668664188,转换为的整数为85
        //随机小数为0.34170381856653764,转换为的整数为0
        //随机小数为0.7245896777925993,转换为的整数为0
    }
}
