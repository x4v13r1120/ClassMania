package edu.example.pizza;


public class Employee {
    String username = "";
    String email;
    String password;
    String secretQuestion;
    int birthDay;
    int birthMonth;
    int birthYear;
    long salary;
    String dob(){
        return String.format("%d/%d/%d", birthMonth,birthDay,birthYear);
    }


}
