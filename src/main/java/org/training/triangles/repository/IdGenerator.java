package org.training.triangles.repository;


import java.util.UUID;

public class IdGenerator {
    String id;

    public String generateId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}