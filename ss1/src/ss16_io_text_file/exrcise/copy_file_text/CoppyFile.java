package ss16_io_text_file.exrcise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public void coppy(String sourcFile, String targetFile){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourcFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile,true));
            while (true) {
                String line = bufferedReader.readLine(); // đọc file gốc
                if (line == null) {
                    break;
                }
                bufferedWriter.write(line); // ghi file gốc vào file mới
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file gốc");
        } catch (IOException e) {
            System.out.println("file đến đã tồn tại");
        }
    }
    public static void main(String[] args) {
        CoppyFile coppyFile = new CoppyFile();

        String sourceFile = "ss1/src/ss16_io_text_file/exrcise/copy_file_text/source file.txt";
        String targetFile = "ss1/src/ss16_io_text_file/exrcise/copy_file_text/target.txt";

        coppyFile.coppy(sourceFile,targetFile);
    }
}

