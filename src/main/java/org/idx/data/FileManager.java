package org.idx.data;

public class FileManager {

    public static void writeToFile(String filePath, String content) {
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(filePath)) {
            fileWriter.write(content);
        } catch (java.io.IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (java.io.IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    public static boolean fileExists(String filePath) {
        java.io.File file = new java.io.File(filePath);
        return file.exists();
    }

}
