package LogicalOperation;

public class ForGrammar {
    public static void main(String[] args) {
        char ch = 'A';
        int zm = ch;
        int divided = 1;
        int divisor = 3;
        int found = 0;
        int ToBefound = 10;
//        for (int i =0; i<4;i++){
//            System.out.println("i为"+i);}
//如何体现++i和i++的区别
//        for (int i = 0; i < 26; i++) {
//            System.out.println((zm + i) + "\t" + (char) (zm + i));//\t为空格}

//        for(int i =0; i<100 && found<10;i++){
//            if (divided % divisor==0){//%是取余
//                System.out.println(divided+"可以整除"+divisor+"商为"+(divided/divisor));
//                found++;
//            }
//            divided++;
//        }
        for (int i = 0; i < 100; i++) {//和上面的语句块就是使用break 跳出
            if (divided < divisor) {
                System.out.println(divided + "小于" + divisor + "循环不执行");
                divided++;//所以在这里让分子一直加一，大于分母的这一款就可以走出这个if了
                continue;//这里是来判断分子是不是小于分母，小于的话就永远不可以被整除
            }
            if (divided % divisor == 0) {//%是取余
                System.out.println(divided + "可以整除" + divisor + "商为" + (divided / divisor));
                found++;
            }
            if (found >= ToBefound) {
                System.out.println("已经找到" + ToBefound + "个数，循环退出");
                break;
            }
            divided++;
        }
    }
}


