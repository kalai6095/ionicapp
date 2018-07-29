package com.server.ionicapp;

import com.server.ionicapp.beer.BeerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/save/beer")
    public ResponseEntity<String> save() {
        beerService.save(new BeerEntity(1L, "kalaiselvan"));
        beerService.save(new BeerEntity(2L, "selvan"));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list/bears")
    @CrossOrigin
    public ResponseEntity<List<BeerEntity>> getBearDetils() {
        List<BeerEntity> beerlist = new ArrayList<>();
        beerlist = beerService.getbeerlist();
        return new ResponseEntity<List<BeerEntity>>(beerlist, HttpStatus.OK);
    }
}
