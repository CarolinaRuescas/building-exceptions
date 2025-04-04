package org.ies.building.components;

import lombok.AllArgsConstructor;
import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.ArrayList;
import java.util.Random;

 @AllArgsConstructor
public class RandomApartmentReader implements Reader<Apartment> {


     private final static String[] DOORS = {
             "A", "B", "C", "D", "E"
     };

     private final Random random;

     private final Reader<Owner> ownerReader;


     @Override
     public Apartment read() {
         var owners = new ArrayList<Owner>();
         int numOwners = random.nextInt(3) + 1;
         for (int i = 0; i < numOwners; i++) {
             owners.add(ownerReader.read());
         }
         return new Apartment(
                 random.nextInt(10),
                 DOORS[random.nextInt(DOORS.length)],
                 owners
         );
     }
}
