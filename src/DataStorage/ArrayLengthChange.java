package DataStorage;

public class ArrayLengthChange {
    public static void main(String[] args) {
        //定义一个数组a
        int[] a;
        //定义数组a长度为3
        a = new int[3];
        //给与数据
        a[0] = 1;
        System.out.println("数组a的长度为" + a.length + "，a[0]的值为" + a[0]);
        //这里还是用数组a这个名字和int类型，但是改掉了长度，覆盖了之前的和之前数组的值
        a = new int[20];
        System.out.println("数组a的长度为" + a.length + "，a[0]的值为" + a[0]);


    }
}
