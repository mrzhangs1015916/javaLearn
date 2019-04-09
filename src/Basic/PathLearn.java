package Basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathLearn {
     public static void main(String[] args) throws IOException {
         Path path = Paths.get("./test");
         System.out.println(path.isAbsolute());
         System.out.println(path.getFileName().toString());
         Files.createDirectories(path);
         System.out.println(Files.exists(path));
         System.out.println(Files.isDirectory(path));
         Path regis = path.toRealPath();
         System.out.println(regis.toString());
         Path child = path.resolve("1");
         System.out.println(child.toString());
         Path child2 = path.resolve("D:/test");
         System.out.println(child2.toString());
         System.out.println(path.getNameCount());
         Path path1 = Paths.get("./Basic/Caluser.java");
         Path path2 = path.relativize(path1);
         Path path3 = Paths.get("./test/1.txt");
         System.out.println(path2.toString());
         System.out.println(path3.relativize(path1).toString());
         Path path4 = path2.subpath(1,2);
         System.out.println(path4.toString());



     }
}
