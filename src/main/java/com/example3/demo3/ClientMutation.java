package com.example3.demo3;


import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientMutation implements GraphQLMutationResolver {

    @Autowired
    private ClientService clientService;

    public ClientEntity createClient(String name, int age, String email) {
        return clientService.createClient(name, age, email);
    } }

