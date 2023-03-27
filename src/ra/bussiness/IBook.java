package ra.bussiness;

import ra.bussinessImp.Book;

import java.util.List;

public interface IBook {
    void inputData(List<Book> list);
    void displayData();

    int compareTo(Book o);
}
