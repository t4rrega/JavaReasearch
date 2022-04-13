import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class test {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("/Users/t4rrega/Desktop/tes.class"));
        System.out.println(Base64.getEncoder().encodeToString(bytes));
    }
}
