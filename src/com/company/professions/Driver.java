package com.company.professions;


public class Driver extends Person {
    //public String fullNameOfDriver;
    public int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        //this.fullNameOfDriver = fullNameOfDriver;
        this.drivingExperience = drivingExperience;
    }

    //public Driver(String call, String fullNameOfDriver, int drivingExperience) {
    //  super(call);
    //this.fullNameOfDriver = fullNameOfDriver;
    // this.drivingExperience = drivingExperience;
}
