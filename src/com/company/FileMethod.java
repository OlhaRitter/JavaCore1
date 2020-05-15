package com.company;
public class FileMethod {
    public static void main(String[] args) {
        salary(210, 10);
        salary(100, 24);
        salary(500, 75);
    }
    private static void salary(double salary, double hours) {
        if (hours > 60) {
            hours = 60;
        }
        if (hours > 40) {
            hours = 40 + (hours - 40) * 1.5;
        }
        if (salary < 200) {
            salary = 200;
        }
       System.out.println("при " + hours + " часов и ставке " + salary + " гривен, работник заработает : " + (salary * hours) + " гривен");
    }
}
