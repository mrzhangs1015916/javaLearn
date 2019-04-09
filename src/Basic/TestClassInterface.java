package Basic;

import mapAndSet.User;

import java.util.List;


public class TestClassInterface {
    public static void main(String[] args){
        User user1 = new User();
        user1.setName("zs");
        user1.setAge(10);
        user1.setPasswd("123456");
        User user2 = new User();
        user2.setName("xx");
        user2.setAge(20);
        user2.setPasswd("admin");
        User user3 = new User();
        user3.setName("pp");
        user3.setAge(30);
        user3.setPasswd("test");
        ClassInterface classInterface = new ClassInterface();
        classInterface.addUser(user1);
        classInterface.addUser(user2);
        classInterface.addUser(user3);
        ClassInterface.Filter<User> filter = new ClassInterface.Filter<User>() {
            @Override
            public Boolean select(User user) {
                if(user.getAge() > 15){
                    return true;
                }else{
                    return false;
                }
            }
        };
        List<User> users = classInterface.getData(filter);
        System.out.println(users);
        List<User> users2 = classInterface.getData2(user -> user.getAge() > 20);
        System.out.println(users2);

    }
}
