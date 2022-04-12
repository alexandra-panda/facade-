package com.company;

public class FacadePatternDemo { //client class
    public static void main(String[] args) {
        Facade facadeObj = new Facade("11/iulie/2022", "30/iulie/2022");
        facadeObj.printJourneyTrip();
    }
}