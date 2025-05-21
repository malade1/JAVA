package com.moses.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String brand, model, color, registrationNumber;
	private int modelYear, price;
	

	//NoArgsConstructor
	public Car() {	
	}
	
	//ArgsConstructor
	public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.modelYear = modelYear;
		this.price = price;
	}

	public Object getBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
