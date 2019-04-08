package Basic;

public class StringLearn {
    public static void main(String[] args){
        String s= String.format("my name is %s,age is %s","zs","30");
        System.out.println(s);
        String d= String.format("my name is %2$7s,age is %2$06d","zs",30);
        System.out.println(d);
        String e= String.format("my name is %1$.3s,age is %2$s","zsddd","30");
        System.out.println(e);
    }
}
