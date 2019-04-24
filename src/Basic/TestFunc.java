package Basic;

public class TestFunc {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c1 = Class.forName("Basic.TestAdd");
        Class<?> c2 = c1.asSubclass(TestCreate.class);
        Class<TestCreate> c3 = TestCreate.class;
        TestCreate c4 = c3.cast(c2.newInstance());
        System.out.println(c4);

    }
}
