package com.example.rest;

import com.example.rest.Client;

import java.util.HashMap;
import java.util.Map;

/**
 * Example DataStore class that provides access to user data.
 * Pretend this class accesses a database.
 */
public class DataStore {

    //Map of names to Person instances.
    private Map<String, Client> clientMap = new HashMap<>();

    //this class is a singleton and should not be instantiated directly!
    private static DataStore instance = new DataStore();
    public static DataStore getInstance(){
        return instance;
    }

    Account account1 = new Account(1, 200.34);

    //private constructor so people know to use the getInstance() function instead
    DataStore(){
        //dummy data
        clientMap.put("Ada", new Client("Ada", account1));
        clientMap.put("Kevin", new Client("Kevin",account1));
        clientMap.put("Stanley", new Client("Stanley", new Account(2,454.45)));
    }

    public Client getClient(String name) {
        return clientMap.get(name);
    }

    public void putClient(Client client) {
        clientMap.put(client.getName(), client);
    }
}