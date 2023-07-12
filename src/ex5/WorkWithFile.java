package ex5;

import java.io.*;

/**
 * Створіть файл, запишіть у нього довільні дані та закрийте файл.
 * Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
 */

public class WorkWithFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("testfile.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("testfile.txt"));
            bufferedWriter.write("Hello world\n");
            bufferedWriter.write("Random text\n");
            bufferedWriter.close();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
