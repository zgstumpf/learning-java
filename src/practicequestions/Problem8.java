package practicequestions;

import java.util.*;

public class Problem8 {
    // Q: Write a program that uses an ArrayList to store a list of 5 city names. Add two more cities to the list and
    // then print out all the city names in the list.
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Richmond", "Hampton", "Norfolk", "Newport News", "Portsmouth"));
        cities.add("Mechanicsville");
        cities.add("Charlottesville");
        for (String city : cities) {
            System.out.println(city);
        }
    }

}
