package mapAndSet;

public class Person implements Comparable<Person> {
    private Integer age;
    private String name;
    public Person(){
        this.age=100;
        this.name="admin";
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int count = this.age - o.age;
        if (count == 0){
            return this.name.compareTo(o.name);
        }else {
            return count > 0 ? 1:-1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
