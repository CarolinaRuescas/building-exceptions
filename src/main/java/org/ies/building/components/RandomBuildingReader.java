package org.ies.building.components;

import lombok.AllArgsConstructor;
import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.ArrayList;
import java.util.Random;

@AllArgsConstructor
public class RandomBuildingReader implements Reader<Building> {
    private final static String[] ADDRESSES = {
            "Calle A", "Calle B", "Calle C", "Calle D", "Calle E"
    };

    private final static String[] CITIES = {
            "Madrid", "Barcelona", "Zaragoza", "Bilbao"
    };

    private final Random random;

    private final Reader<Apartment> apartmentReader;


    @Override
    public Building read() {
        var apartments = new ArrayList<Apartment>();
        int numApartments = random.nextInt(3) + 1;
        for (int i = 0; i < numApartments; i++) {
            apartments.add(apartmentReader.read());
        }
        return new Building(
                ADDRESSES[random.nextInt(ADDRESSES.length)],
                CITIES [random.nextInt(CITIES.length)],
                random.nextInt(10000,100000),
                apartments
        );
    }
}
