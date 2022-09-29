package ss16_io_text_file.exrcise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String filePath) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            list.add(line);
        }
        bufferedReader.close();
    return list;
    }

    public static void writeFile(String tagetFile,List<String> list) throws IOException {
        File file = new File(tagetFile);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size() ; i++) {
            bufferedWriter.write(list.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
    public static void copyFile(String sourceFile, String targetFile) throws IOException {
        List<String> list = null;
        list = readFile(sourceFile);
        writeFile(targetFile,list);
    }

    public static void main(String[] args) throws IOException {
        try {
            List<String> list = readFile("ss1/src/ss16_io_text_file/exrcise/copy_file_text/source_file.txt");
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                count+=list.get(i).length();
            }
            System.out.println("số ký tự trong file là " + (count + list.size()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}

