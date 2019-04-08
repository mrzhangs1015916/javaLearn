package Basic;

public class UserSync {
    private int age;
    private static int id=0;
    private  Integer status=0;
    public UserSync(int age){
        this.age = age;
    }
    public void addAge1(){
        synchronized (this) {
            this.age += 1;
        }
    }
    public void addAge2(){
        synchronized (UserSync.class){
            this.age+=1;
        }
    }
    public void addAge3(){
        synchronized (status){
            this.age+=1;
        }
    }
    public void addAge4(){
        Integer tmp = 1;
        synchronized (tmp){
            this.age+=1;
        }
    }
    public synchronized static void addAge5(){
        id+=1;
    }

    public int getAge() {
        return age;
    }
}
