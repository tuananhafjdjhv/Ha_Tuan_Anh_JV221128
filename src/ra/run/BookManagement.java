package ra.run;

import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> listBooks = new ArrayList<Book>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sách và nhập thông tin sách [15 điểm]\n" +
                    "2. Hiển thị thông tin các sách [15 điểm]\n" +
                    "3. Sắp xếp sách theo lợi nhuận giảm dần [15 điểm]\n" +
                    "4. Xóa sách theo mã sách [10 điểm]\n" +
                    "5. Tìm kiếm sách theo tên sách [10 điểm]\n" +
                    "6. Thay đổi trạng thái của sách theo mã sách [10 điểm]\n" +
                    "7. Thoát");
            System.out.println("Hãy nhập lựa chọn ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số sách cần thêm mới");
                    int number = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < number; i++) {
                        System.out.println("Nhập thông tin sách thứ " + (i + 1));
                        Book newBook = new Book();
                        newBook.inputData(listBooks);
                        if (listBooks.size() == 0) {
                            newBook.setBookId(1);
                        } else {
                            newBook.setBookId(listBooks.get(listBooks.size() - 1).getBookId() + 1);
                        }
                        listBooks.add(newBook);
                    }
                    for (Book book : listBooks) {
                        book.displayData();
                    }
                    break;
                case 2:
                    for (Book book : listBooks) {
                        book.displayData();
                    }
                    break;
                case 3:
                    List<Book> newList = new ArrayList<>(listBooks);
                    Collections.sort(newList);
                    for (int i = 0; i < listBooks.size(); i++) {
                        newList.add(listBooks.get(i));
                    }
                    for (Book book : listBooks) {
                        book.displayData();
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã sách cần xóa");
                    int deleteId = Integer.parseInt(input.nextLine());
                    listBooks.remove(deleteId - 1);
                    System.out.println("Đã xóa");
                    for (Book book:listBooks) {
                        book.displayData();
                    };
                    break;
                case 5:
                    List<Book> listSerch = new ArrayList<>();
                    System.out.println("Nhập tên sách cần tìm kiếm");
                    String searchName = input.nextLine();
                    for (Book book : listBooks) {
                        if (book.getBookName().contains(searchName)) {
                            listSerch.add(book);
                        }
                    }
                    for (Book book : listSerch) {
                        book.displayData();
                    }
                case 6:
                    System.out.println("Nhập mã sách cần thay đổi trạng thái");
                    int idChange = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập trạng thái thay đổi");
                    boolean newStatus = Boolean.parseBoolean(input.nextLine());
                    listBooks.get(idChange - 1).setBookStatus(newStatus);
                    for (Book book:listBooks) {
                        book.displayData();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }

    }
}
