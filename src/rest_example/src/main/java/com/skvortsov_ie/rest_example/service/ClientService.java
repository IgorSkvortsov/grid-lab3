package com.skvortsov_ie.rest_example.service;

import java.util.List;

import com.skvortsov_ie.rest_example.model.Client;

public interface ClientService {
   void create(Client client);
   
   List<Client> readAll();
   Client read(int id);

   boolean update(Client client, int id);
   boolean delete(int id);
}
