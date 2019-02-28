package mapAndSet;

import java.io.*;

public class TransitTest {
    public static void main(String[] args){
        User user = new User();
        user.setAge(10);
        user.setName("zs");
        user.setPasswd("admin");
        try {
            FileOutputStream out = new FileOutputStream("user.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream input = new FileInputStream("user.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(input);
            User user1 = (User)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(user1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
