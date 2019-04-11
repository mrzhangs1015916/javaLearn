package Basic;

public class CalData {
    private int x;
    private int y;
    public CalData(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getData(MyLambda myLambda){
        return myLambda.GetData(x,y);
    }
}
