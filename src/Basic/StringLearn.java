package Basic;

public class StringLearn {
    public static void main(String[] args){
        String s= String.format("my name is %s,age is %s","zs","30");
        System.out.println(s);
        String d= String.format("my name is %2$7s,age is %2$06d","zs",30);
        System.out.println(d);
        String e= String.format("my name is %1$.3s,age is %2$s","zsddd","30");
        System.out.println(e);
        String pro = "nifi.content.max.default";
        int index = pro.indexOf("nifi.content");
        System.out.println(pro.substring(index+"nifi.content".length()));
        String tmp = "org.nifi.class.show";
        int i = tmp.lastIndexOf(".");
        System.out.println(tmp.substring(i+1));
    }
}
