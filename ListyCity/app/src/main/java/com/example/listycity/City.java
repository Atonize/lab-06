package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Getter for city name
     * @return
     * This City's name attribute
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Getter for province name
     * @return
     * This City's province attribute
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Allows for the comparison of two cities through their names
     * @param o
     * City to compare to
     * @return
     * Returns 0 if cities are equal; value less than zero if this city is less than the argument
     * city; value greater than zero if this city is more than the argument city
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}