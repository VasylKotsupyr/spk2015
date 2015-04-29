package tsp;

import java.util.Date;


public class TSP_GA {

    public static void main(String[] args) {

        // Create and add our cities
        City city = new City(7, 20);
        TourManager.addCity(city);
        City city2 = new City(13, 8);
        TourManager.addCity(city2);
        City city3 = new City(4, 13);
        TourManager.addCity(city3);
        City city4 = new City(5, 18);
        TourManager.addCity(city4);
        City city5 = new City(12, 15);
        TourManager.addCity(city5);
        City city6 = new City(8, 15);
        TourManager.addCity(city6);
        City city7 = new City(6, 7);
        TourManager.addCity(city7);
        City city8 = new City(13, 17);
        TourManager.addCity(city8);
        City city9 = new City(1, 13);
        TourManager.addCity(city9);
        City city10 = new City(11, 6);
        TourManager.addCity(city10);
        City city11 = new City(16, 3);
        TourManager.addCity(city11);
        City city12 = new City(20, 12);
        TourManager.addCity(city12);
        City city13 = new City(16, 12);
        TourManager.addCity(city13);
        City city14 = new City(6, 19);
        TourManager.addCity(city14);
        City city15 = new City(13, 5);
        TourManager.addCity(city15);
        City city16 = new City(11, 10);
        TourManager.addCity(city16);
        City city17 = new City(13, 12);
        TourManager.addCity(city17);
        City city18 = new City(7, 3);
        TourManager.addCity(city18);
        City city19 = new City(16, 3);
        TourManager.addCity(city19);
        City city20 = new City(19, 2);
        TourManager.addCity(city20);

        // Initialize population
        Population pop = new Population(200, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());
        Date currentTimeBefore = new Date();
        long timeBefore = currentTimeBefore.getTime();
        //System.out.println("Time: " + timeBefore);
        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100000; i++) {
            pop = GA.evolvePopulation(pop);
        }
        Date currentTimeAfter = new Date();
        long timeAfter= currentTimeAfter.getTime();;
        //System.out.println("Time: " + timeAfter);
        long time = timeAfter-timeBefore;
        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Time: " + time + "мс");
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
        
    }
}