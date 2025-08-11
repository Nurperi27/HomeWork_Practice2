package task1;

import java.time.LocalDate;

public class Reader {
    String fullName;
    String[] library;
    int cardNumber;
    LocalDate dataOfBirth;
    String phoneNumber;
    public Reader(){}
    public Reader(String fullName, String[] library, int cardNumber, LocalDate dataOfBirth, String phoneNumber){
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dataOfBirth = dataOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public void books(){
        //System.out.println(Arrays.toString(library));
        System.out.println("Books: ");
        for(String b : library){
            System.out.println(b);
        }
    }
    public void getInfo(){
        System.out.println("Name: " + fullName + "\nCard №: " + cardNumber
                + "\nData of birth: " + dataOfBirth + "\nPhoneNumber: " + phoneNumber);
        books();
    }
    public void takeBook(){
        System.out.println(fullName + " взял " + library.length + " книги");
    }
    public String returnBook(){
        return fullName + " вернул " + library.length + " книги";
    }
}
