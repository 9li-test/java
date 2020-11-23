package DataStorage;

public class ArraySaveGrade {
    public static void main(String[] args) {
        // 创建六门科目的成绩的索引值
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        //科目数量
        int subjectsAmount = 6;

        // 创建存储科目名字的数组
        //java的数组和python的列表不一样，不可以输出整个数组，只能定义和拿去使用
        String[] names = new String[subjectsAmount];//6个科目数量，控制数组长度
        //索引值 和 对应的值
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";


        // 创建储存每门课的成绩的数组
        int[] scores = new int[subjectsAmount];
//        传统给数据大法
//        scores[0] = 67;
//        scores[1] = 85;
//        scores[2] = 87;
//        scores[3] = 89;
//        scores[4] = 90;
//        scores[5] = 90;

        // 用随机数给成绩赋值
        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + (int) (Math.random() * 20);
        }

        // 计算最高成绩和最高成绩对应的科目的索引
        //这个是先给个最大值变量
        int maxScore = 0;
        //这个是定义个等下记录最大值的索引值的变量
        int maxScoreIndex ;
        //本来不想给值，但是下面的有引用到这个变量，不给会报错
        maxScoreIndex=0;
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i] + "的成绩为" + scores[i]);
            if (maxScore < scores[i]) {//比最大值，大的就取代最大值
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        // 输出最高成绩科目和成绩
        System.out.println("最高分的科目为" + names[maxScoreIndex] + "，成绩为：" + maxScore);


    }
}
