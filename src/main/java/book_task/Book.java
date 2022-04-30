package book_task;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String author;
    private String tittle;
    private Category category;
    private double price;

    public static List<Book> bookExtension = new ArrayList<>();

    public Book(){}

    public Book(String author, String tittle, Category category, double price) {
        this.author = author;
        this.tittle = tittle;
        this.category = category;
        this.price = price;
        bookExtension.add(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", tittle='" + tittle + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
