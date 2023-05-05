package org.example.dom;

import java.util.Arrays;

public class House {
    private Room[] rooms;

    public House(Room[] rooms) {
        this.rooms = rooms;
    }
    public void enterAndCleanTheRoom(int roomNumber){
        rooms[roomNumber].cleanRoom();
    }


    @Override
    public String toString() {
        return  Arrays.toString(rooms);
    }
}
