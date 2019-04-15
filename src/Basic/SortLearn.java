package Basic;

import mapAndSet.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortLearn {
    public static void main(String[] args){
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person(10,"zs");
        Person p2 = new Person(15,"ab");
        Person p3 = new Person(5,"xd");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        people.sort(((o1, o2) -> o2.getAge()-o1.getAge()));
        System.out.println(people);
    }
}
