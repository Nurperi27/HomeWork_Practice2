package task3;

import java.time.LocalDate;
import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    LocalDate yearOfFoundation; //год основания
    Person founder; //основатель
    Group[] groups;
    public Company(){}
    public Company(String companyName, String country, LocalDate yearOfFoundation, Person founder, Group[] groups){
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }
    public Group[] getGroups(){
        return groups;
    }
    public void groups(){
        for(Group g : groups){
            System.out.println(g);
        }
    }
    @Override
    public String toString() {
        return "Company Info: \n" +
                "companyName: " + companyName + "\n" +
                "country: " + country + '\n' +
                "yearOfFoundation: " + yearOfFoundation + "\n" +
                "founder: " + founder + "\n" +
                "groups: " + Arrays.toString(groups);
    }
}
