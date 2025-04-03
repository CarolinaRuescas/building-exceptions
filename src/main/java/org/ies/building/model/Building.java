package org.ies.building.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Building {
    private String address;
    private String municipality;
    private int zipCode;
    private List<Apartment> apartments;

    // Metodo que devuelve el apartamento en ese planta y esa puerta
    public Apartment getApartment(int floor, String door) {
        for (Apartment apartment : apartments) {
            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                return apartment;  // Si lo encuentra, lo devuelve
            }
        }
        // Si no lo encuentra, devuelve null
        return null;
    }

    // Metodo para obtener los propietarios de un apartamento por planta y puerta
    public List<Owner> getOwners(int floor, String door) {
        for (Apartment apartment : apartments) {
            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                // Devuelve la lista de propietarios
                return apartment.getOwners();
            }
        }
        // Si no se encuentra el apartamento, devuelve null
        return null;
    }

}
