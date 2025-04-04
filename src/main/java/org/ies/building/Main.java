package org.ies.building;


import lombok.extern.log4j.Log4j;
import org.ies.building.components.BuildingApp;
import org.ies.building.components.RandomApartmentReader;
import org.ies.building.components.RandomBuildingReader;
import org.ies.building.components.RandomOwnerReader;

import java.util.Random;
import java.util.Scanner;

@Log4j
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var scanner = new Scanner(System.in);
        var ownerReader = new RandomOwnerReader(random);
        var apartmentReader = new RandomApartmentReader(random, ownerReader);
        var buildReader = new RandomBuildingReader(random, apartmentReader);

        var buildingApp = new BuildingApp(scanner,buildReader);
        buildingApp.run();;

    }
}