package Utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunLogger {

    public static void write(String content) {
        try {
            Path currentPath = Paths.get("").toAbsolutePath();
            String filePath = currentPath.resolve("log.txt").toString();

            FileWriter writer = new FileWriter(filePath, true);
            writer.write(content);
            writer.write("\n----------------\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("Logger write failed");
        }
    }
}
