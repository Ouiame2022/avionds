package org.example.avion.web;

import lombok.AllArgsConstructor;
import org.example.avion.dto.AvionDTO;
import org.example.avion.service.AvionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class AvionGraphQLController {
    private AvionService avionService ;

    @MutationMapping
    public AvionDTO saveAvion(@Argument AvionDTO avion){
        return avionService.saveAvion(avion);
    }

    @MutationMapping
    public Boolean deleteAvion(@Argument Long id){
        return avionService.deleteAvion(id);
    }


    @QueryMapping
    public List<AvionDTO> getAvionByModel(@Argument String model){
        return avionService.getAvionByModel(model);
    }

    @QueryMapping
    public List<AvionDTO> getAvionByModelAndPrice(@Argument String model, @Argument double price){
        return avionService.getAvionByModelAndPrice(model, price);
    }
}
