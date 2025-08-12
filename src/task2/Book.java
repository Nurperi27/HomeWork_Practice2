package task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Book {
    int id;
    String bookName;
    int price;
    String genre;
    LocalDate createDate;
    public Book(){}
    public Book(int id, String bookName, int price, String genre, LocalDate createDate){
        if(id > 0){
            this.id = id;
        }
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;
    }

    public void getInfo(){
        System.out.println("ID of Book: " + id + "\nBook name: " + bookName + "\nPrice: " + price
                + "\nGenre: " + genre + "\nDate: " + createDate + "\n");
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
