package org.ies.building.exceptions;



import lombok.Getter;

@Getter
public class ApartmentNotFoundException extends Exception {
    private final int floor;
    private final String door;

    public ApartmentNotFoundException(String door, int floor) {
        super("no se ha encontrado el apartamento" + floor + door);
        this.door = door;
        this.floor = floor;
    }
}