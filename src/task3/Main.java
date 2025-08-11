package task3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Company деген класс тузунуз, полелери (company name, country, year of foundation, founder, groups[]).
    // Group деген класс тузунуз, полелери (group name, start date, mentor), ушул класс Cоmpany класска поле катары массив болуп барат.
    // Person деген класс тузунуз, полелери (first name, last name, date of birth) ушул класс Company жана Group класстарга поле катары барат.
    // Mainден класстардын объектин тузуп полелерине маани бериниз жана консольго чыгарыныз
    public static void main(String[] args) {
        System.out.println("1)Enter first name: ");
        String fn1 = new Scanner(System.in).nextLine();
        System.out.println("1)Enter last name: ");
        String ln1 = new Scanner(System.in).nextLine();
        Person p1 = new Person(fn1, ln1, LocalDate.of(1970, 12, 12));
        Person p2 = new Person();
        System.out.println("2)Enter first name: ");
        p2.firstName = new Scanner(System.in).nextLine();
        System.out.println("2)Enter last name: ");
        p2.lastName = new Scanner(System.in).nextLine();
        p2.dateOfBirth = LocalDate.of(1977, 12, 12);
        System.out.println(p1 + "\n" + p2);
        System.out.println();
        Group group = new Group();
        System.out.println("Enter group name: ");
        group.groupName = new Scanner(System.in).nextLine();
        group.startDate = LocalDate.now();
        group.mentor = p2;
        Group[] gr = {group};
        Group.groups(gr);
        System.out.println();
        Company company = new Company("Q&Q", "N", LocalDate.now(), p1, gr);
        System.out.println(company);
    }
}
