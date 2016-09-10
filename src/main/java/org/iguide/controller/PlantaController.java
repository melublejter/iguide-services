package org.iguide.controller;

import org.iguide.model.Planta;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PlantaController {

	@RequestMapping("/plant")	
	public Planta getPlantaByBeaconId(){
		Planta planta = new Planta();
		planta.setAzimuth(100.0);
		planta.setY(10);
		planta.setY(20);
		return planta;
	}
}
