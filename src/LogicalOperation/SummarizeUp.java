package LogicalOperation;

import java.util.Scanner;
public class SummarizeUp {
    public static void main(String[] args) {
//        double randNum = 0;
//        int rangeStart = 99;
//        int rangeEnd = 180;
//
//        for (int i = 0; i < 100; i++) {
//            // 确定模
//            int mod = rangeEnd - rangeStart;
//
//            //生成随机数
//            randNum = Math.random();
//            // num的值会在0到mod-1，也就是0到rangeEnd - rangeStart -1
//            int num = ((int) (randNum * rangeEnd * 100)) % mod;
//
//            // num加rangeStart之后，值域是0到rangeEnd - 1
//            num += rangeStart;
//
//            if (num <= rangeStart) {
//                num = rangeStart + 1;
//            }
//            // 根据数据分析，这个条件不会满足，只是为了做最后的防护
//            if (num >= rangeEnd) {
//                num = rangeEnd - 1;
//            }
//            System.out.println("这次的随机数是：" + num);
//        }

        Scanner in = new Scanner(System.in);//标准语句，申明并开启系统标准处理（键盘输入
        System.out.println("输入整数");
        int intt = in.nextInt();//生成一个键盘输入的int
        double randNum = 0;//rand 单词含义 随机 ，num 单词含义 数
        while (randNum < 0.5) {
            //Math.random()生成的随机0到1之间的小数的函数，[0,1)
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("此时大于0.5的值为" + randNum);
        int rangeStart = 30;//range:范围，start:开始
        int rangeEnd = 49;//range:范围,end:结束
        int differenceValue = rangeStart - rangeEnd;//difference:差 value:值
        //生成一个(30,90)的随机数
        if (rangeEnd < 0 || rangeStart < 0) {
            System.out.println("起点和终点小于0，游戏不能开始");
        } else if (rangeEnd - rangeStart < 10) {
            System.out.println("起码地搞几个随机数，少了不好");
        } else {
            for (int i = 0; i < 20; i++) {
                int bigRandNum = (int) (Math.random() * 100);
                if (bigRandNum > rangeStart && bigRandNum < rangeEnd) {
                    System.out.println("满足条件的数" + bigRandNum);
                } else {
                    System.out.println("不满足条件的数" + bigRandNum);
                }
            }
        }
   }
}
