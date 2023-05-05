package org.example.dom;

public class HouseMain {
    public static void main(String[] args) {
        Room room1 = new Room();
        Room room2 = new Room(RoomName.BEDROOM, new Bed(2),new Window[]{new Window(true),new Window(false),new Window(false),new Window(true)});
        Room room3 = new Room(RoomName.BATHROOM, new Bed(0),new Window[]{new Window(false),new Window(false),new Window(false),new Window(false)});
        Room room4 = new Room(RoomName.KITCHEN, new Bed(9),new Window[]{new Window(true),new Window(true),new Window(true),new Window(true)});
        Room[] rooms = new Room[]{room1,room2,room3,room4};
//        System.out.println(room2);
//        room2.cleanRoom();
//        System.out.println(room2);

        House house = new House(rooms);
        System.out.println(house);
        house.enterAndCleanTheRoom(3);
        System.out.println(house);
    }
}
