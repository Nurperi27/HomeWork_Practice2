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
        /*boolean foundAny = false;
        for (Library l : libraries) {
            if (l.id == i) { // ищем только ту библиотеку, которую ввёл пользователь
                boolean foundMatch = false;
                for (Book b : l.books) {
                    if (b.id == l.id) {
                        System.out.println("Найдено совпадение:");
                        System.out.println("Библиотека ID: " + l.id + ", Название: " + l.name);
                        System.out.println("Книга ID: " + b.id + ", Название: " + b.bookName + "\n");
                        foundMatch = true;
                        foundAny = true;
                    }
                }
                if (!foundMatch) {
                    System.out.println("В библиотеке с ID " + i + " совпадений не найдено.");
                }
                return; // библиотека найдена, можно выйти
            }
        }
        if (!foundAny) {
            System.out.println("Библиотека с ID " + i + " не найдена.");
        }*/
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
