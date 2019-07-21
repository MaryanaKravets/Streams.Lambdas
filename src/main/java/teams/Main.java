package main.java.teams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("anyakt@gmail.com", LocalDate.parse("2019-07-11"), "Team1");
        User user2 = new User("oleg12t@ukr.net", LocalDate.parse("2019-07-10"), "Team2");
        User user3 = new User("mukola87@gmail.com", LocalDate.parse("2019-07-16"), "Team3");
        User user4 = new User("m_log@gmail.com", LocalDate.parse("2019-07-19"), "Team1");
        User user5 = new User("tarasGl89@gmail.com", LocalDate.parse("2019-07-09"), "Team2");
        User user6 = new User("maksumGTyy@gmail.com", LocalDate.parse("2019-07-17"), "Team3");
        List<User> userList = Arrays.asList(user1, user2, user3, user4, user5, user6);
        Map<String, List<String>> stringListMap = User.filterUserByLoginDate(userList);
        System.out.println("List of teams with email users, who logged in not later than a week ago:\n" + stringListMap);
    }
}

