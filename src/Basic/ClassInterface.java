package Basic;

import mapAndSet.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClassInterface {
    private List<User> users = new ArrayList<User>();

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public  interface Filter<User>{
        Boolean select(User user);
    }
    public List<User> getData(Filter<User> filter){
        List<User> tmp = new ArrayList<User>();
        for(User user : users){
            if (filter.select(user)){
                tmp.add(user);
            }
        }
        return tmp;
    }
    public void addUser(User user){
        users.add(user);
    }
    public List<User> getData2(Predicate<User> userPredicate){
        List<User> tmp = new ArrayList<User>();
        for(User user : users){
            if (userPredicate.test(user)){
                tmp.add(user);
            }
        }
        return tmp;
    }
}
