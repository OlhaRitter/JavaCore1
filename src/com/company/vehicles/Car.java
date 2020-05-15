package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/*Создать класс Car в пакете com.company.vehicles,
 * Engine в пакете com.company.details и Driver в пакете com.company.professions.Класс Driver содержит поля-ФИО,стаж вождения.
 * Класс Engine содержит поля-мощность,производитель.
 * Класс Car содержит поля-марка автомобиля,класс автомобиля,вес,водитель типа Driver,мотор типа Engine.Методы start(),
 * stop(),turnRight(),turnLeft(),которые выводят на печать:"Поехали","Останавливаемся","Поворот направо"или"Поворот налево".
 * А также метод printInfo(),который выводит полную информацию об автомобиле,ее водителе и моторе.
 * Создать производный от Car класс-Lorry(грузовик),характеризуемый также грузоподъемностью кузова.
 * Создать производный от Car класс-SportCar,характеризуемый также предельной скоростью.Пусть класс Driver расширяет класс Person.*/

public class Car {
    public String carModel;
    public String classCar;
    public int weightCar;
    public Driver driver;
    public Engine engine;

    public Car(String carModel, String classCar, int weightCar /*Driver driver, Engine engine*/) {
        this.carModel = carModel;
        this.classCar = classCar;
        this.weightCar = weightCar;
        //this.driver = driver;
        // this.engine = engine;
    }

    public Car() {
    }
/* public void massage(String smss) {
        System.out.println(smss);
    }*/

    public void start(String massage) {
        System.out.println(massage);
    }

    public void stop(String massage) {
        System.out.println(massage);
    }

    public void turnRight(String massage) {
        System.out.println(massage);
    }

    public void turnLeft(String massage) {
        System.out.println(massage);
    }

    public void printInfo(String carModel, String classCar, int weightCar, Driver driver, Engine engine) {
        System.out.println(carModel);
        System.out.println(classCar);
        System.out.println(weightCar);
        System.out.println(driver);
        System.out.println(engine);

    }

}
