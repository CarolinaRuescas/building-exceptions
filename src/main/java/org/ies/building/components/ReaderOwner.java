package org.ies.building.components;


import lombok.AllArgsConstructor;
import org.ies.building.model.Owner;

import java.util.Scanner;
 @AllArgsConstructor


public class ReaderOwner implements Reader<Owner>{
    private final Scanner scanner;

     public Owner read(){
         System.out.println("Introduce el nombre del propietario");
         String name = scanner.nextLine();

         System.out.println("Introduce los apellidos");
         String surname = scanner.nextLine();

         return new Owner(
                 name,
                 surname
         );
     }
}
