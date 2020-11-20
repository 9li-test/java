package LogicalOperation;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);//标准语句，申明并开启系统标准处理（键盘输入
        System.out.println("请输入你要的转换的数字");
        int m = e.nextInt();//生成一个键盘输入的int
        System.out.println("m的值为" + m);
        int n = 15;
        String str = n + "对应的中文数字是：";
        switch (m) {
            case 1:
                str = str + "壹";
                break;
            case 2:
                str = str + "贰";
                break;
            case 3:
                str = str + "叁";
                break;
            case 4:
                str = str + "四";
                break;
            case 5:
                str = str + "伍";
                break;
            case 6:
                str = str + "陆";
                break;
            case 7:
                str = str + "柒";
                break;
            //如果这些case下面不加入break的话，匹配到8就会把8，9，10都带出去
            case 8:
                str = str + "捌";
                break;
            case 9:
                str = str + "玖";
                break;
            case 10:
                str += "拾";//这种写法和上面意思一样,用不习惯
                break;
            default://如果都没匹配上就会执行这个
                System.out.println(n + "不在1-10之间");
                break;
        }
        if (m > 10 || m < 0) {//或者关系
            System.out.println("没找到对应" + m + "的中国字");
        } else {
            System.out.println(str);
        }
    }
}
