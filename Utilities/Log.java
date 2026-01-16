package Utilities;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Log {

    private static ByteArrayOutputStream buffer;
    private static PrintStream originalOut;

    // Start capturing output (console + buffer)
    public static void startCapture() {
        originalOut = System.out;
        buffer = new ByteArrayOutputStream();

        OutputStream teeStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                originalOut.write(b);
                buffer.write(b);
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                originalOut.write(b, off, len);
                buffer.write(b, off, len);
            }

            @Override
            public void flush() throws IOException {
                originalOut.flush();
                buffer.flush();
            }
        };

        System.setOut(new PrintStream(teeStream, true));
    }

    // Stop capture and write log file
    public static void write(String inputBlock) {
        System.setOut(originalOut);

        try {
            Path path = Paths.get("").toAbsolutePath();
            FileWriter writer = new FileWriter(
                path.resolve("log.txt").toString() // overwrite
            );

            writer.write(inputBlock);
            writer.write("\n\nOutput:\n");
            writer.write(buffer.toString());

            writer.close();

        } catch (IOException e) {
            System.out.println("Log write failed");
        }
    }
}
