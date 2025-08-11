package task1;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Создайте класс task1.Reader с полями (fullName, library, cardNumber, dateOfBirth, phoneNumber). Методы takeBook(), returnBook().
    // Метод takeBook - будет принимать в качестве параметра кол-во взятых книг. Выводит на консоль сообщение "Петров В.В. взял 3 книги".
    // Метод returnBook - выводит на консоль сообшение "Петров В.В. вернул 3 книги".
    public static void main(String[] args) {
        System.out.println("Enter full name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter a size of array: ");
        int n = new Scanner(System.in).nextInt();
        String[] library = new String[n];
        System.out.println("Enter books: ");
        for(int i=0; i< library.length; i++){
            library[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("Enter number of card: ");
        int cardNumber = new Scanner(System.in).nextInt();
        System.out.println("Enter phone number: ");
        String phone = new Scanner(System.in).nextLine();
        Reader reader = new Reader(name, library, cardNumber, LocalDate.of(2000, 9, 9), phone);
        reader.getInfo();
        reader.takeBook();
        System.out.println(reader.returnBook());
    }
}