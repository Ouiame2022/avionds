package org.example.avion.dao.repositories;

import org.example.avion.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvionRepository extends JpaRepository<Avion , Long> {
    public List<Avion> findByModel(String model);
    public List<Avion> findByModelAndPrice(String model, double price);
}