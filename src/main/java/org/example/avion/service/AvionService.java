package org.example.avion.service;

import org.example.avion.dto.AvionDTO;

import java.util.List;

public interface AvionService {

    public AvionDTO saveAvion(AvionDTO avionDto);

    public boolean deleteAvion(Long id);

    public List<AvionDTO> getAvionByModel(String model);

    public List<AvionDTO> getAvionByModelAndPrice(String model, double price);

    public List<AvionDTO> saveAvions(List<AvionDTO> avionDtos);

}