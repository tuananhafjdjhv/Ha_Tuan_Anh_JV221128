package ra.bussinessImp;

import ra.bussiness.IBook;

import java.util.List;
import java.util.Scanner;

public class Book implements IBook {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData(List<Book> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập số trang sách: ");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        // Nhâ tác giả
        System.out.println("Giá nhập: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Giá bán: ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        this.bookStatus = true;
        // thực hiện tính exportPrice
    }

    @Override
    public void displayData() {
        System.out.printf("\nMã sách: %-10d - Tên sách: %-30s " +
                        " \"Giá bán : %.1f  " + "   trạng thái : %-10s \n",
                this.bookId, this.bookName , this.exportPrice,
                this.isBookStatus() ? "Còn hàng" : "Hết hàng");
    }
    @Override
    public int compareTo(Book o){
        return (int) (o.getInterest()-this.interest);
    }
}
