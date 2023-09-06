package com.pampacards.back.backend.controller;

import com.pampacards.back.backend.models.entities.Clan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClanController {

    @GetMapping("/clans")
    public ResponseEntity<List<Clan>> getAllClans() {
        try {
            List<Clan> clans = new ArrayList<>();

            clans.add(new Clan(1L, "Robots"));
            clans.add(new Clan(2L, "Chevaliers"));
            clans.add(new Clan(3L, "Jouets"));
            clans.add(new Clan(4L, "Pirates"));

            return new ResponseEntity<>(clans, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
