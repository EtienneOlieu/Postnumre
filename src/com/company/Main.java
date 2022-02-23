package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    CitiesList citiesList = new CitiesList();
    citiesList.loadCities();
        System.out.println(citiesList.citySearcher().cityToString());

    }



}
