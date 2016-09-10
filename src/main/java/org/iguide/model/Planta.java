package org.iguide.model;

import java.util.ArrayList;

public class Planta {

	private double x;
	private double y;
	private double azimuth;
	private String name;
	private ArrayList<Poi> pointsOfInterest = new ArrayList<Poi>();
	
	public ArrayList<Poi> getPointsOfInterest() {
		return pointsOfInterest;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getAzimuth() {
		return azimuth;
	}
	public void setAzimuth(double azimuth) {
		this.azimuth = azimuth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPoi(Poi poi){
		this.pointsOfInterest.add(poi);
	}
	
	
}
