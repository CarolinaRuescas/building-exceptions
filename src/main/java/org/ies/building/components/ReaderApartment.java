package org.ies.building.components;

import lombok.AllArgsConstructor;
import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.Scanner;
 @AllArgsConstructor


public class ReaderApartment implements Reader<Apartment> {
    private final Scanner scanner;
    private final ReaderOwner readerOwner;


    public Apartment read(){
        System.out.println("Intorduce el número de planta ");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce la puerta del apartamento ");
        String door = scanner.nextLine();

        System.out.println("¿Cuántos propietarios quieres buscar?");

        return new Apartment(
          floor,
          door





        );

    }
}
