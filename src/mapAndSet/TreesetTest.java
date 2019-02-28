package mapAndSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {
    public static void main(String [] args){
        Person p1 = new Person(20,"zs");
        Person p2 = new Person(25,"df");
        Person p3 = new Person(18,"gh");
        Person p4 = new Person(20,"as");
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        Iterator<Person> iterator = people.iterator();
        Iterator<Person> iterator2 = people.descendingIterator();
        people.floor(p1);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(people.contains(p1));
        ComparorPerson comparorPerson = new ComparorPerson();
        TreeSet<Person> people2 = new TreeSet<Person>(comparorPerson);
        people2.add(p1);
        people2.add(p2);
        people2.add(p3);
        people2.add(p4);
        Iterator<Person> iterator3 = people2.descendingIterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

    }
}
