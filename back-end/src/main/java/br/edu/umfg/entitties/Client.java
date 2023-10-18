package br.edu.umfg.entitties;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String lastName;
    private String document;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    @JsonCreator
    public Client(String name, String lastName, String document) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.document = document;
    }
}
