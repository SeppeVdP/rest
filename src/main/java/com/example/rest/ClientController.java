package com.example.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {


    DataStore dataStore = new DataStore();
    @GetMapping("/Client/balance")
    public double getBalance(
            @RequestParam String name) {
        return dataStore().getClient(name).getAccount().getBalance();
    }

    @PutMapping("/Client/addmoney")
    public void addmoney(
            @RequestParam String name,
            @RequestParam double balance) {
         dataStore().getClient(name).getAccount().addMoney(balance);
    }

    @PutMapping("/Client/deductmoney")
    public void deductmoney(
            @RequestParam String name,
            @RequestParam double balance) {
        dataStore().getClient(name).getAccount().addMoney(balance);
    }
    /*
    private Client client(@RequestParam(value = "name", defaultValue = "Stanley")String name) {
        return dataStore().getClient(name);
    }
    */
    private DataStore dataStore() {
        return dataStore;
    }



}