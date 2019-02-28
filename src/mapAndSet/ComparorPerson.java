package mapAndSet;

import java.util.Comparator;

public class ComparorPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()==o2.getAge()){
            return o1.getName().compareTo(o2.getName());
        }else{
            return (o1.getAge()-o2.getAge())>0?1:-1;
        }
    }
}
