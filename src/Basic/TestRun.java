package Basic;

public class TestRun implements Runnable{
    private UserSync userSync;
    public TestRun(UserSync userSync){
        this.userSync = userSync;
    }
    @Override
    public void run() {
        userSync.addAge1();
    }
}
