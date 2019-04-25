package Basic2;

import mapAndSet.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearn {
    public static void main(String[] args){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(10,"zs"));
        list.add(new Person(20,"ab"));
        list.add(new Person(30,"xc"));
        list.add(new Person(5,"qd"));
        List<Person> newPerson = list.stream().map(person -> {
            int i = person.getAge();
            person.setAge(i+5);
            return person;
        }
        ).collect(Collectors.toList());
        System.out.println("new:"+newPerson.toString());
        System.out.println("old:"+list.toString()); //map 会改变原数据
        List<Person> newPerson2 = list.stream().filter(person -> person.getAge()>20).collect(Collectors.toList());
        System.out.println("newPerson2:"+newPerson2.toString());
        System.out.println("old:"+list.toString()); //filter 不会改变原数据
        Boolean isExist = list.stream().anyMatch(person -> person.getAge()>30);
        Boolean isExist2 = list.stream().allMatch(person -> person.getAge()>30);
        System.out.println("isExist:"+isExist);
        System.out.println("isExist2:"+isExist2);
        Person p1 = list.stream().findFirst().orElse(new Person());
        System.out.println("p1:"+p1.toString());
        Person p2 = list.stream().findAny().orElse(new Person());
        System.out.println("p2:"+p2.toString());
        list.stream().forEach(person -> System.out.println(person.getAge()));
        System.out.println(list.stream().limit(2).collect(Collectors.toList()).toString());
    }
}
