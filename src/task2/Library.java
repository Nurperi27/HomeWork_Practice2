package task2;

import java.util.Arrays;

public class Library {
    int id;
    String name;
    String address;
    Book[] books;
    public Library(){}
    public Library(int id, String name, String address, Book[] books){
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }
    public void listBook(){
//        for(Book b : books){
//            System.out.println(b);
//        }
        System.out.println(Arrays.toString(books));
    }
    public static void books(Library[] libraries, int i){
        for(Library l : libraries){
            if(l.id == i){
                System.out.println(l);; //выводит книги у которого id library == 1
            }
        }
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books);
    }
}
