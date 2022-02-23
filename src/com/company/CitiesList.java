package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitiesList {
    Scanner input = new Scanner(System.in);
    private ArrayList<City> citiesList = new ArrayList<>();

    public CitiesList() {

    }

    public void loadCities() throws FileNotFoundException {
        File file = new File("data/danske-postnumre-byer-ny.csv");
        Scanner sc = new Scanner(file);
        int postNummer;
        String by;
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(";");
            postNummer = Integer.parseInt(lineArray[0]);
            by = lineArray[1];
            City city = new City(postNummer, by);
            addCityToList(city);
        }
    }

    public void addCityToList(City city) {
        citiesList.add(city);
    }

    public City findCity(int nummer) {
        for (City city : citiesList) {
            if (city.getPostNummer() == nummer) {
                return city;
            }
        }
        return null;
    }

    public City citySearcher() {
        System.out.println("Oplys postnummeret på den by du ønsker at finde.");
        String choice = input.nextLine();
        try {
            int choiceAsInt = Integer.parseInt(choice);
            City thisCity = findCity(choiceAsInt);
            return thisCity;
        } catch (NumberFormatException e) {
            System.out.println("Oplys venligst et korrekt postnummer");
        }
        return null;
    }



    public String getCitiesToString(){
       String product = "";
        for (City city:citiesList) {
            product += city.cityToString()+"\n";

        }

        return product;
    }
}
