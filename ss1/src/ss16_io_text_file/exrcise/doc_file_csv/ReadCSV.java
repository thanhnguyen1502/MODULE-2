package ss16_io_text_file.exrcise.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public List<Country> read(String filePath) {
        List<Country> countryList = new ArrayList<>(); // tạo 1 List để chứa đối tượng Contry
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                // cứ mỗi line đọc được, chuyển line đó thành mảng arr với mỗi phần tử đc cắt bỡi dấu phẩy
                String[] arr = line.split(",");

                // khởi tạo đối tượng contry với các tham số lần lượt là các phần tử trong mảng arr
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countryList.add(country); // add đối tượng contry mới đc tạo vào List

            }
        } catch (IOException e) {
            System.out.println("không tìm thấy file");
        }

        return countryList;
    }

    public static void main(String[] args) {
        ReadCSV readCSV = new ReadCSV();
        List<Country> countryList = readCSV.read("ss1/src/ss16_io_text_file/exrcise/doc_file_csv/csv.txt");
        for (Country c : countryList) {
            System.out.println(c);
        }
    }
}
