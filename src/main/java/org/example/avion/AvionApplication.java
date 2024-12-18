package org.example.avion;

import org.example.avion.dto.AvionDTO;
import org.example.avion.service.AvionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AvionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvionApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AvionService avionService){
        return  args -> {
            avionService.saveAvions(
                    List.of(
                            AvionDTO.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build(),
                            AvionDTO.builder().model("model2").matricul("ef6e+6").color("green").price(65489).build(),
                            AvionDTO.builder().model("model3").matricul("ef64we8").color("yellow").price(89789).build(),
                            AvionDTO.builder().model("model4").matricul("wrdqwqw").color("black").price(67489).build()
                    )
            );
        };
    }
}
