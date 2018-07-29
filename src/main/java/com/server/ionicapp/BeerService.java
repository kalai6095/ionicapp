package com.server.ionicapp;

import com.server.ionicapp.beer.BeerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;


    public List<BeerEntity> getbeerlist() {
        return beerRepository.findAll();

    }

    public void save(BeerEntity entity) {
        beerRepository.save(entity);
    }
}
