package Basic;

import java.io.File;

public class LearnFile {
    public static void main(String[] args){
        File file = new File("./zs/tmp/");
        if(!file.exists()){
            file.mkdirs();
        }
    }
}
