import java.util.Date;

public class Book<T> implements Comparable<Book>{
    String name;
    Integer pageNumber;
    String author;
    String date;

    public Book(String name, Integer pageNumber, String author, String date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.date = date;
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.name);
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author + "', pages=" + pageNumber + "}";
    }

    public String getName() {
        return name;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}
