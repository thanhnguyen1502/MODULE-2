package ss17_binary_file.exrcise2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("ss17_binary_file/exrcise2/date/source.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("ss17_binary_file/exrcise2/date/target.dat");

            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(ois.readObject());

            ois.close();
            oos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
