package DataStorage;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //这是直接赋值的数组定义,和python列表[]括号不同其他都一样
//        int[] a ={0,1,2,3};
//        System.out.println(a[1]);
        Scanner scanner = new Scanner(System.in);
        String[] names = {"语文", "数学", "外语", "物理", "化学", "生物"};
//        //定义后可以再次修改
//        names[0]="体育";
//        for (int i=0;i<names.length;i++){
//            System.out.println(names[i]);
//        }

        System.out.println("请输入需要生成多少年的成绩：");
        int yearCount = scanner.nextInt();//year :年
        //定义一个多维数组储存
        double[][] scores = new double[yearCount][names.length];
        for (int i = 0; i < yearCount; i++) {//这个for循环一次就会多一年的成绩
            for (int j = 0; j < names.length; j++) {//这个for循环一次就会把一年的6科成绩生成
                scores[i][j] = 80 + Math.random() * 20;
            }
        }
        //到这里已经生成了想要的年份的各科成绩
        System.out.println("需要查询哪年的成绩");
        //给用户使用，-1，使索引不是从0开始
        int yearToUse = scanner.nextInt() - 1;
        System.out.println("请问要查看第几科的成绩？");

        int scoreToUse = scanner.nextInt() - 1;

        System.out.println("第" + (yearToUse + 1) + "年的第" + (scoreToUse + 1) + "门的成绩是：" + scores[yearToUse][+scoreToUse]);

    }
}
