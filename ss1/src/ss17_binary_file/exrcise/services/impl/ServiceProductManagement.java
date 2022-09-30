package ss17_binary_file.exrcise.services.impl;


import ss17_binary_file.exrcise.model.Product;
import ss17_binary_file.exrcise.services.IServiceProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceProductManagement implements IServiceProductManagement {
private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        List<Product> listProduct = read();
        System.out.println("nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        listProduct.add(new Product(code, name, manufacturer, price));
        write(listProduct);
    }

    @Override
    public void display() {
        List<Product> listRead = read();
        if (listRead.isEmpty()) System.err.println("Chưa có sản phẩm nào");
        for (Product p : listRead) {
            System.out.println(p);
        }
    }

    @Override
    public void find() {
        List<Product> listRead = read();
        System.out.println("nhập tên sản phẩm cần tìm");
        String nameFind = scanner.nextLine();
        boolean check = true;
        for (Product p : listRead) {
            if (p.getName().contains(nameFind)) {
                System.out.println(p);
                check = false;
            }
        }if (check) System.err.println("không tìm thấy sản phẩm");

    }

    public static void write(List<Product> products) {
        File file = new File("ss1/src/ss17_binary_file/exrcise/data/management.csv");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> read() {
        File file = new File("ss1/src/ss17_binary_file/exrcise/data/management.csv");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> productList1 = new ArrayList<>();
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    productList1 = (List<Product>) objectInputStream.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file.length() > 0) {
                    fileInputStream.close();
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList1;
    }
}
