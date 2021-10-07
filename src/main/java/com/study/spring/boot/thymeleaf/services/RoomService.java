package com.study.spring.boot.thymeleaf.services;

import com.study.spring.boot.thymeleaf.models.Room;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private static final List<Room> rooms = new ArrayList<>();
    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "R" + i, "Room " + i, "Q"));
        }
    }

    public List<Room> findAll(){
        return rooms;
    }

}
