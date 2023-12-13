import java.util.*;

public class Main {
    public static void main(String[] args) {
        City city1 = new City(7, "Talas");
        City city2 = new City(1, "Bishkek");
        City city3 = new City(6, "Osh");
        City city4 = new City(3, "Batken");
        City city5 = new City(5, "Naryn");
        Set<City> cities = new TreeSet<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        System.out.println(cities);



    }
}