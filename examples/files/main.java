import java.io.*;

public class main{
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
        writeToFile(file, "Hello, this is a sample text.");
        System.out.println("Contents of the file:");
        String content = readFromFile(file);
        System.out.println(content);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    private static void writeToFile(File file, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        }
    }

    private static String readFromFile(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
