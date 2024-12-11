import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        Path sourcefile = Paths.get("files", "source.txt");
        Path targetfile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourcefile,targetfile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
