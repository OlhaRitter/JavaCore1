package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class CarrEngineDriver {
    public static void main(String[] args) {
        Car car1 = new Car("BMV","Luxe",2000);
        Driver driver1=new Driver("Petrov V.V",75,15);
        Engine engine1 = new Engine(175, "LGW");

        car1.start("Поехали");
        car1.stop("Останавливаемся");
        car1.turnRight("Поворот направо");
        car1.turnLeft("Поворот налево");

        System.out.println();
        Sout(car1, driver1, engine1);
    }

    private static void Sout(Car car1, Driver driver1, Engine engine1) {
        System.out.println("Информация о машине:");
        System.out.println("Модель машины: "+car1.carModel);
        System.out.println("Класс машины: "+car1.classCar);
        System.out.println("Вес машины: "+car1.weightCar);
        System.out.println();
        System.out.println("Информация о водителе:");
        System.out.println("ФИО водителя: "+driver1.fullName);
        System.out.println("Возраст водителя"+driver1.age);
        System.out.println("Опыт вождения: "+driver1.drivingExperience);
        System.out.println();
        System.out.println("Информация о двигателе:");
        System.out.println("Мощность машины: "+engine1.machinePower);
        System.out.println("Страна производитель : "+engine1.manufacturer);
    }
}
