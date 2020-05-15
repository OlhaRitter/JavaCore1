package com.company.professions;

/*Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
в) Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).*/
//class PersonDemo

import com.company.professions.Driver;

public class Person {
    public String fullName;
   public int age;
    String call;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person(String call) {
        this.call = call;
    }

    void move(String fullName) {
        System.out.print("Человек по имени " + fullName);
    }

    void talk(String call) {
        System.out.println(" говорит, что " + call);
    }

}
