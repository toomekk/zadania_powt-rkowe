package org.example.dom;

import java.util.Arrays;
import java.util.Random;

public class Room {
    private RoomName name;
    private Bed bed;
    private Window[] windows;

    public Room(RoomName name, Bed bed, Window[] windows) {
        this.name = name;
        this.bed = bed;
        this.windows = windows;
    }

    public Room() {
        this.name = RoomName.BEDROOM;
        this.bed = new Bed(5);
        this.windows = new Window[]{new Window(false), new Window(false)};
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public RoomName getName() {
        return name;
    }

    public void setName(RoomName name) {
        this.name = name;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "\nPokój " + getName()+ " "+ bed + Arrays.toString(windows);
    }

    public void cleanRoom() {
        if (getBed().getCountDays() != 0) {
            getBed().setCountDays(0);
        }
        for (Window w :
                windows) {
            w.setOpen(true);
        }
    }
}
