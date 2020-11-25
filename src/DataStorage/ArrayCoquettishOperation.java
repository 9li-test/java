package DataStorage;

import java.util.Scanner;

public class ArrayCoquettishOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //定义长度为6的数组，直接赋值
        String[] names = {"语文", "数学", "外语", "物理", "化学", "生物"};

        //到这里已经生成了想要的年份的各科成绩
//        System.out.println("需要查询哪年的成绩");
//        //给用户使用，-1，使索引不是从0开始
//        int yearToUse = scanner.nextInt() - 1;
//        System.out.println("请问要查看第几科的成绩？");
//
//        int scoreToUse = scanner.nextInt() - 1;
//
//        System.out.println("第" + (yearToUse + 1) + "年的第" + (scoreToUse + 1) + "门的成绩是：" + scores[yearToUse][+scoreToUse]);
        boolean cot = true;
        while (cot) {
            //游戏初始化
            System.out.println("请输入需要生成多少年的成绩：");
            int yearCount = scanner.nextInt();//year :年
            //定义一个多维数组储存
            double[][] scores = new double[yearCount][names.length];
            for (int i = 0; i < yearCount; i++) {//这个for循环一次就会多一年的成绩
                for (int j = 0; j < names.length; j++) {//这个for循环一次就会把一年的6科成绩生成
                    scores[i][j] = 80 + Math.random() * 20;
                }
            }
            System.out.println("请选择要进行的操作：");
            System.out.println("1: 求某年最好成绩\n" +
                    "2: 求某年的平均成绩\n" +
                    "3: 求所有年份最好成绩\n" +
                    "4: 求某门课历年最好成绩");
            int opt = scanner.nextInt();
            int year = 0;
            switch (opt) {
                case 1:
                    System.out.println("请输入指定的年份");
                    year = scanner.nextInt();
                    //分2个if容易让用户知道具体的错误信息
                    if (year <= 0) {
                        System.out.println("年份为" + year + "年，你玩毛，请重新选择年份");
                        break;
                    }
                    if (year > yearCount) {
                        System.out.println("总共就" + yearCount + "年的成绩,你还要第" + year + "年的成绩，吊毛请重新选择年份");
                        break;
                    }
                    //用户输入的年份1就是想要第一年，但索引1是第二年所以减去1
                    year = year - 1;
                    //定义一个储存最高成绩的索引值
                    int maxGrade = 0;
                    for (int i = 1; i < names.length; i++) {
                        //i索引的成绩大于我定义的最大值后就取代，变为最大的索引，一直循环取代得出最大值
                        if (scores[year][i] > scores[year][maxGrade]) {
                            maxGrade = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年的最高成绩的科目为" + names[maxGrade] + scores[year][maxGrade] + "分");
                    break;
                case 2:
                    System.out.println("请输入指定的年份");
                    year = scanner.nextInt();
                    //分2个if容易让用户知道具体的错误信息
                    if (year <= 0) {
                        System.out.println("年份为" + year + "年，你玩毛，请重新选择年份");
                        break;
                    }
                    if (year > yearCount) {
                        System.out.println("总共就" + yearCount + "年的成绩,你还要第" + year + "年的成绩，吊毛请重新选择年份");
                        break;
                    }
                    //用户输入的年份1就是想要第一年，但索引1是第二年所以减去1
                    year = year - 1;
                    //定义一个储存成绩总和的值
                    double sumGrade = 0;
                    for (int i = 0; i < names.length; i++) {
                        sumGrade = sumGrade + scores[year][i];
                    }
                    //定义平均成绩
                    double avgGrade = sumGrade / names.length;
                    System.out.println("第" + (year + 1) + "年的平均成绩为" + avgGrade + "分");
                    break;
                case 3:
                    int bestYear = 0;//best:最好的 ,year:年
                    int bestGrade = 0;//grade:成绩
                    for (int i = 0; i < yearCount; i++) {//遍历年份
                        for (int j = 0; j < names.length; j++) {//遍历年份里的成绩
                            //i年份j成绩索引大于我定义的时候就取代最大值，一直循环，变为最大的索引，一直循环取代得出最大值
                            if (scores[i][j] > scores[bestYear][bestGrade]) {
                                bestYear = i;
                                bestGrade = j;
                            }
                        }
                    }
                    System.out.println("这" + yearCount + "年来最好的成绩为第" + (bestYear + 1) + "年" + names[bestGrade] + "科目，有" + scores[bestYear][bestGrade] + "分");
                    break;
                case 4:
                    System.out.println("请输入你想要的某门课历年最好成绩的科目编号");
                    int appointSubjects = scanner.nextInt() - 1;//appoint：指定，subjects:科目
                    if ((appointSubjects + 1) > names.length) {
                        System.out.println("只有" + names.length + "的科目,你输入了" + (appointSubjects + 1) + "个科目，不想玩了？重新输入");
                        break;
                    }
                    if ((appointSubjects + 1) < 0) {
                        System.out.println("输入" + (appointSubjects + 1) + "个科目，负数，不想玩了？重新输入");
                        break;
                    }
                    //定义最高的成绩
                    double bestAppointSubjects = 0;
                    for (int i = 0; i < yearCount; i++) {
                        if (scores[i][appointSubjects] > bestAppointSubjects) {
                            bestAppointSubjects = scores[i][appointSubjects];
                        }
                    }
                    System.out.println("你想要的课" + names[appointSubjects] + "历年最好成绩为" + bestAppointSubjects);
                    break;
                default:
                    cot = false;
                    System.out.println("程序只有4个功能，超出就结束");

            }

        }

    }
}