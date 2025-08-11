package task3;

import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate startDate;
    Person mentor; //руководитель
    public Group(){}
    public Group(String groupName, LocalDate startDate, Person mentor) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
    }
    public static void groups(Group[] groups){
        for(Group g : groups){
            g.toString();
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName: " + groupName + '\'' +
                ", startDate: " + startDate +
                ", mentor: " + mentor +
                '}';
    }
}
