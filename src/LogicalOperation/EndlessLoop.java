package LogicalOperation;

public class EndlessLoop {
    public static void main(String[] args) {
        int n = 10;
        int divided = 100;//单词含义 被除数
        //这边int的最大边界为-2147483648——2147483647，所以能整除2000000000只有2000000000一个，-2000000000是溢出后的结果，不需要的
        int divisor = 1000000000;//单词含义 除数    挑战溢出值
        int found = 0;//单词含义 寻找
        String start="从"+divided+"开始";//单词含义 开始
        while (found < n) {
            if (divided<0){
                System.out.println("被除数溢出，计算结束");
                break;
            }
            if (divided % divisor == 0) {
                found++;//如果进入这个if语句中，说明已经找到了一个。+1
                System.out.println(divided + "可以被" + divisor + "整除" + ",商为" + (divided / divisor));
            }
            divided++;//while每循环一次被除数+1，不然就是死循环
        }
        System.out.println(start+"只找到"+found+"个可以整除"+divisor+"的数");
        if(divided<0) {//不是负数就没溢出
            System.out.println("溢出的值为" + divided);
        }
        else {
            System.out.println("没有溢出值");
        }
    }
}
