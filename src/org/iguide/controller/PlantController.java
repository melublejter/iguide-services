package org.iguide.controller;

import org.iguide.model.Planta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PlantController {

	@RequestMapping("/")
	public String getPlantaByBeaconId(){
		Planta planta = new Planta();
		planta.setAzimuth(100.0);
		planta.setY(10);
		planta.setY(20);
		return "lalala";
}
}
