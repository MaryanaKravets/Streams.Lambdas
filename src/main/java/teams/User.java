package main.java.teams;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    private String email;
    private LocalDate loginDate;
    private String teams;

    User(String email, LocalDate loginDate, String teams) {
        this.email = email;
        this.loginDate = loginDate;
        this.teams = teams;
    }

    private String getEmail() {
        return this.email;
    }

    private LocalDate getLoginDate() {
        return this.loginDate;
    }

    private String getTeams() {
        return this.teams;
    }

    public String toString() {
        return "User{email='" + this.email + "', loginDate=" + this.loginDate + ", teams='" + this.teams + "'}";
    }

    static Map<String, List<String>> filterUserByLoginDate(List<User> list) {
        return list.stream().filter(user -> (
                Period.between(user.getLoginDate(), LocalDate.now()).getDays() <= 7))
                .collect(Collectors.groupingBy(User::getTeams, Collectors.mapping(User::getEmail, Collectors.toList())));
    }
}

