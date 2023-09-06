package com.heroku.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClanController {

    @GetMapping("/clans")
    public ResponseEntity<List<String>> getAllClans() {
        try {
            List<String> clans = new ArrayList<>();

            clans.add("Ninja");
            clans.add("Vampire");
            clans.add("Robot");

            if (clans.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(clans, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
