package Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearn {
    public static void main(String[] args){
        String s= "cn=admin,ou=nifi";
        Pattern pattern = Pattern.compile("^cn=(.*?),ou=(.*?)$");
        Matcher matcher = pattern.matcher(s);
        System.out.println("groupcount:"+matcher.groupCount());
        if (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.start(2));
            System.out.println(matcher.end(1));
        }

    }
}
