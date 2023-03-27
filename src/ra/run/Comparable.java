package ra.run;

import ra.bussinessImp.Book;

import java.util.Comparator;


public class Comparable implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getInterest() > o2.getInterest()){
            return 1;
        } else if (o1.getInterest() < o2.getInterest()){
            return -1;
        } else return 0;
    }
}
