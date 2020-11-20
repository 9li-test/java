package LogicalOperation;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //控制游戏轮次
        int controlRound = 5;
        //游戏轮次
        int round = 0;
        //统计数据
        int guessRight = 0;
        int guessWrong = 0;
        //创建Scanner来读取用户输入数字
        Scanner in = new Scanner(System.in);
        while (round < controlRound) {
            //记录第几轮次数
            round++;//这下面的轮次就是从1开始了
            //猜数字范围设置（在随机数设计有点缺陷，所以范围就不改了，改了要去改随机数的*10）
            int rangeStart = 30;//start:开始
            int rangeEnd = 50;//范围,end:结束

            int averageValue = (rangeEnd + rangeStart) / 2;//average:平均 value:值
            //可玩次数
            int opportunityNumber = 5;//opportunity:机会
            //已玩次数
            int playNumber = 0;
            System.out.println("￥==================猜数字游戏开始" + "第" + round + "轮" + "==================￥");
            while (1 == 1) {
                if (rangeEnd < 0 || rangeStart < 0) {
                    System.out.println("起点和终点小于0，游戏不能开始");
                } else if (rangeEnd - rangeStart < 10) {
                    System.out.println("起码地搞几个随机数，少了不好");
                } else {
                    int bigRandNum = (int) (Math.random() * 10) + averageValue;
                    if (bigRandNum > rangeStart && bigRandNum < rangeEnd) {
                        System.out.println("请输入你猜的数字,数字范围在" + rangeStart + "-" + rangeEnd);
                        //用户输入数字
                        int it = in.nextInt();

                        if (it == -1) {
                            System.out.println("你输入了" + it + ",游戏停止");
                            break;
                        }
                        if (it == bigRandNum) {
                            System.out.println("猜对了游戏结束");
                            guessRight++;
                            break;
                        } else {
                            playNumber++;
                            System.out.println("猜错了，你还有" + (opportunityNumber - playNumber) + "次机会");
                            guessWrong++;
                            if (it > bigRandNum) {
                                System.out.println("你猜的数字" + it + "大于电脑给出的随机数" + bigRandNum);
                            } else {
                                System.out.println("你猜的数字" + it + "小于电脑给出的随机数" + bigRandNum);
                            }
                            //失败大于可玩次数结束
                            if (playNumber >= opportunityNumber) {
                                System.out.println("失败超过可玩次数" + opportunityNumber + ",游戏结束");
                                System.out.println("到现在为止猜对"+guessRight+"次"+",猜错"+guessWrong+"次");
                                break;
                            }
                        }
                    } else {
                        System.out.println("不满足游戏条件的数" + bigRandNum);
                    }
                }
            }
        }
    }
}


