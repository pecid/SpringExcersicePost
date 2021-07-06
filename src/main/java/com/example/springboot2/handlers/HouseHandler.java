package com.example.springboot2.handlers;

import com.example.springboot2.dtos.request.RoomRequestDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseHandler {
    public static long squareMeters( List<RoomRequestDto> rooms) {
        long squareMetersHouse = 0;

        for (RoomRequestDto room : rooms) {
            squareMetersHouse += (room.getLength() * room.getWidth());
            System.out.println("Room: " + room.toString());
        }

        return squareMetersHouse;
    }

    public static String validateHouse() {

        return "it's ok";
    }

    public static String houseCost(List<RoomRequestDto> rooms) {
        int squareMetersHouse = 0;

        for (RoomRequestDto room : rooms) {
            squareMetersHouse += (room.getLength() * room.getWidth());
            System.out.println("Room: " + room.toString());
        }

        int cost = (squareMetersHouse * 800);
        return String.valueOf(cost)+" USD";
    }

    public static RoomRequestDto bigRoom(List<RoomRequestDto> rooms) {
        int max = 0;
        int indexRoom = 0;
        for(int i=0; i<rooms.size(); i++) {
            int squareMetersRoom = (int) (rooms.get(i).getLength() * rooms.get(i).getWidth());
            if(squareMetersRoom > max){
                max = squareMetersRoom;
                indexRoom = i;
            }
        }

        return rooms.get(indexRoom);
    }

    public static Map<String,Integer> squareMetersRooms(List<RoomRequestDto> rooms) {
        Map<String,Integer> squareMetersRooms = new HashMap<>();

        for(int i=0; i<rooms.size(); i++) {
            int squareMetersRoom = (int) (rooms.get(i).getLength() * rooms.get(i).getWidth());
            squareMetersRooms.put( rooms.get(i).getName() ,squareMetersRoom);
        }
        return squareMetersRooms;
    }
}
