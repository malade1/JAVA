package com.moses.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moses.cardatabase.domain.Car;
import com.moses.cardatabase.domain.CarRepository;

@SpringBootApplication
public class CarDatabaseApplication implements CommandLineRunner{
	
	private static Logger logger = LoggerFactory.getLogger(CarDatabaseApplication.class);
	
	@SuppressWarnings("unused")
	private CarRepository carRepository;
	
	public CarDatabaseApplication(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	public static void main(String[] args) {
		
	    // After adding this comment the application is restarted
		SpringApplication.run(CarDatabaseApplication.class, args);
		
		logger.info("CarDatabaseApplication application has started");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2023, 59000));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2022, 39000));
		
		for(Car car : carRepository.findAll()) {
			logger.info("Brand: {}, Model: {}",
					car.getBrand(), car.getModel());
		}
		
	}

}
