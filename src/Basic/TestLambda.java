package Basic;

public class TestLambda {
    public static void main(String[] args){
        CalData s1 = new CalData(1,2);
        System.out.println(s1.getData((a,b)->a+b));
        System.out.println(s1.getData((a,b)->a+2*b));
    }
}
