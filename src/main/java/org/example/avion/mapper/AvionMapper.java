package org.example.avion.mapper;

import org.example.avion.dao.entities.Avion;
import org.example.avion.dto.AvionDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class AvionMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Avion fromAvionDtoToAvion(AvionDTO avionDto){
        return mapper.map(avionDto, Avion.class);
    }
    public AvionDTO fromAvionToAvionDto(Avion avion){
        return mapper.map(avion, AvionDTO.class);
    }
}