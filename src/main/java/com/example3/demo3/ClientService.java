package com.example3.demo3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    /* створюємо змінну типу нашого класу-репозиторію для доступу сервісу до бази та
     запуску команд
    */
    private ClientRepository  clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    /* створюємо @Transactional для кожного Mutation та Query з Schema
        назва методу в класі повинна бути однаковою з назвою Mutation та Query в Schema
     */
    public ClientEntity createClient(String name, int age, String email) {
        ClientEntity client = new ClientEntity();
        client.setName(name);
        client.setAge(age);
        client.setEmail(email);
        return clientRepository.save(client); }
    @Transactional
    public void deleteClient(String id) {
        clientRepository.deleteById(id); }
    @Transactional
    public Optional<ClientEntity> clientById(String id) {
        return clientRepository.findById(id); }
    @Transactional
    public ArrayList<ClientEntity> listOfAllClients() {
        ArrayList<ClientEntity> clients = new ArrayList<>();
        clients.addAll(clientRepository.findAll());
        return clients;
    }}








