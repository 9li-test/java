package DataManipulation;

public class IntDivision {
    public static void main(String[] args) {
        int a = 10;
        double d = 10.0;
        int b = 3;
        double c=3.0;
        //浮点型，int/int=int，只有int/double或者double/int才是算出要的值
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println(d/b);
        System.out.println(d/c);

    }

}
