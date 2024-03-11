import java.nio.file.*;

public class Assignment03 {
    public static void main(String[] args) {

        String fileName = "news.txt";


        Path filePath = Paths.get(fileName);


        String fullPath = filePath.toAbsolutePath().toString();


        System.out.println("The path of the file is: " + fullPath);
    }
}


