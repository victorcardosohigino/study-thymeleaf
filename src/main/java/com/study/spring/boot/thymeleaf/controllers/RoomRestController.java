package com.study.spring.boot.thymeleaf.controllers;

import com.study.spring.boot.thymeleaf.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("rooms", roomService.findAll());
        return "rooms";
    }
}
