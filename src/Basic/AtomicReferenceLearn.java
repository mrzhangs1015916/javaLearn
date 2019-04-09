package Basic;

import mapAndSet.User;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceLearn {
    public static void main(String[] args){
        User tmp = new User();
        tmp.setAge(10);
        tmp.setName("zs");
        tmp.setPasswd("asd");
        User tmp1 = new User();
        tmp1.setAge(20);
        tmp1.setName("zd");
        tmp1.setPasswd("admin");
        AtomicReference<User> user = new AtomicReference<User>(tmp);
        Boolean b = user.compareAndSet(tmp,tmp1);
        System.out.println(b);
        User tmp2 = user.get();
        System.out.println(tmp2);

        User tmp3 = new User();
        tmp3.setAge(30);
        tmp3.setName("lxq");
        tmp3.setPasswd("admin");

        Boolean c = user.compareAndSet(tmp,tmp3);
        System.out.println(c);
        User tmp4 = user.get();
        System.out.println(tmp4);


    }
}
