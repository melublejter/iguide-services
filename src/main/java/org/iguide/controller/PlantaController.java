package org.iguide.controller;

import org.iguide.model.Planta;
import org.iguide.model.Poi;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PlantaController {

	@RequestMapping("/plant")
	public Planta getPlantaByBeaconId(@RequestParam("beacon_id") long id){
		
		Planta planta = new Planta();
		planta.setName("Bulnes");
		planta.setAzimuth(100.0);
		planta.setX(30);
		planta.setY(50);
		
		Poi elevator = new Poi();
		elevator.setX(5);
		elevator.setY(10);
		elevator.setDescription("ascensor");
		
		Poi molinetes = new Poi();
		molinetes.setX(15);
		molinetes.setY(7);
		molinetes.setDescription("molinetes");
		
		Poi bathroom = new Poi();
		bathroom.setX(8);
		bathroom.setY(12);
		bathroom.setDescription("bathroom");
		
		planta.addPoi(bathroom);
		planta.addPoi(molinetes);
		planta.addPoi(elevator);
		
		return planta;
	}
	
	@RequestMapping("/plantStep")
	public Planta getPlantaForStepLength(@RequestParam("step_length") int stepLength){
		return this.getPlantaByBeaconId(123);
	}
}
