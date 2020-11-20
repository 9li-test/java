package LogicalOperation;

public class While {
    public static void main(String[] args) {
        int n = 10;
        int divided = 100;//单词含义 被除数
        int divisor = 99;//单词含义 除数
        int found = 0;//单词含义 寻找
        while (found < n) {//只找10次，0，1，2，3，4，5，6，7，8，9
            if (divided % divisor == 0) {
                found++;//如果进入这个if语句中，说明已经找到了一个。+1
                System.out.println(divided + "可以被" + divisor + "整除" + ",商为" + (divided / divisor));
            }
            divided++;//while每循环一次被除数+1，不然就是死循环
        }
        do {
            System.out.println("无论什么情况，这句话都会执行一遍");
        } while (1>4);//这里语法就是加;不是{},这里面就是装要循环满足的条件

        for (int i = 0; i > 99; i++){
            System.out.println("这个for循环就是一次都执行不了，条件不满足");
        }

    }

}
