package com.example3.demo3;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class ClientImportanceEntity {
    @Id // https://thoughts-on-java.org/jpa-generate-primary-keys/
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Enumerated(EnumType.STRING)
    private ClientImportanceEntity importance;

    public ClientImportanceEntity(String id, ClientImportanceEntity importance) {
        this.id = id;
        this.importance = importance;
    }

    public ClientImportanceEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientImportanceEntity getImportance() {
        return importance;
    }

    public void setImportance(ClientImportanceEntity importance) {
        this.importance = importance;
    }
}
