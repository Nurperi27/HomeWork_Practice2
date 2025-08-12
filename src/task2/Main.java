package task2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Book деген класс тузунуз, полялары (id, bookName, price, genre, createDate).
    // Library деген класс тузунуз, полялары (id, name, address, Book[] books).
    // Mainден 3 Library, 5 book тузунуз. 1-id деги library нин ичиндеги бардык китептерди алып чыккан метод тузунуз.
    public static void main(String[] args) {
        Book book1 = new Book(1, "A", 120, "a", LocalDate.now());
        Book book2 = new Book();
        book2.id = 2;
        book2.bookName = "B";
        book2.price = 150;
        book2.createDate = LocalDate.now();
        final int idBook3 = 3;
        System.out.println("Enter name of 3rd book: ");
        String nameBook3 = new Scanner(System.in).nextLine();
        System.out.println("Enter price of 3rd book: ");
        int priceBook3 = new Scanner(System.in).nextInt();
        System.out.println("Enter genre of 3rd book: ");
        String genreBook3 = new Scanner(System.in).nextLine();
        Book book3 = new Book(idBook3, nameBook3, priceBook3, genreBook3, LocalDate.of(2024, 12, 12));
        Book book4 = new Book();
        final int idBook4 = book4.id = 4;
        System.out.println("Enter name of 4th book: ");
        book4.bookName = new Scanner(System.in).nextLine();
        System.out.println("Enter price of 4th book: ");
        book4.price = new Scanner(System.in).nextInt();
        System.out.println("Enter genre of 4th book: ");
        book4.genre = new Scanner(System.in).nextLine();
        book4.createDate = LocalDate.of(2023, 12, 12);
        final int idBook5 = 5;
        Book book5 = new Book(idBook5, "D", 300, "d", LocalDate.of(2022, 12, 12));
        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
        book4.getInfo();
        book5.getInfo();
        System.out.println();
        Library library1 = new Library(1, "AA", "a/1", new Book[]{book1, book4});
        Library library2 = new Library();
        final int idLib2 = library2.id = 2;
        library2.name = "BB";
        library2.address = "b/2";
        library2.books = new Book[]{book2, book5};
        Library library3 = new Library(3, "CC", "c/3", new Book[]{book3, book4, book5});
        Library[] libraries = {library1, library2, library3};
        System.out.println("Enter id: ");
        int idLib = new Scanner(System.in).nextInt();
        Library.books(libraries, idLib);
    }
}
