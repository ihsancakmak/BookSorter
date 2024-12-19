import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        Set<Book> booksByPageNumber = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber));


        books.add(new Book("Who am I?", 500, "Ali", "1/1/2024"));
        books.add(new Book("Abc", 4000, "Eylem", "2/2/2024"));
        books.add(new Book("Let's do it!", 600, "Veysi", "3/3/2024"));
        books.add(new Book("Cross", 300, "Talha", "4/4/2024"));
        books.add(new Book("Today", 100, "Umut", "4/4/2024"));

        booksByPageNumber.add(new Book("Who am I?", 500, "Ali", "1/1/2024"));
        booksByPageNumber.add(new Book("Abc", 4000, "Eylem", "2/2/2024"));
        booksByPageNumber.add(new Book("Let's do it!", 600, "Veysi", "3/3/2024"));
        booksByPageNumber.add(new Book("Cross", 300, "Talha", "4/4/2024"));
        booksByPageNumber.add(new Book("Today", 100, "Umut", "4/4/2024"));

        for(Book b : books){
            System.out.println(b);
        }

        System.out.println("--------------");

        for(Book b : booksByPageNumber){
            System.out.println(b);
        }


    }
}