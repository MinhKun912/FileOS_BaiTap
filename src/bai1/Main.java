package bai1;

import java.io.*;

public class Main {
    static final String SOURCE = "C:\\Users\\MinhKun\\Desktop\\MD3\\fileISObaiTap\\src\\source";
    static final String TARGET = "C:\\Users\\MinhKun\\Desktop\\MD3\\fileISObaiTap\\src\\target";

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(TARGET);
            FileReader fileReader = new FileReader(SOURCE);
            BufferedReader bufRead = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line;
            while ((line = bufRead.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
            bufRead.close();
            bufferedWriter.close();
            writer.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}