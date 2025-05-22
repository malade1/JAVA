package com.moses.CarDatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moses.CarDatabase.domain.Car;
import com.moses.CarDatabase.domain.CarRepository;

@SpringBootApplication
public class CarDatabaseApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CarDatabaseApplication.class);
	private CarRepository carRepository;

	public CarDatabaseApplication(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CarDatabaseApplication.class, args);

		logger.info("Car Database Application has started!");
	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("Toyota", "Tundra", "Silver", "TY-2024-10", 2024, 65000));
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2023, 59000));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2022, 39000));

		for (Car car : carRepository.findAll()) {
			logger.info("Brand: {}, Model: {}, Color: {}, Registration: {}, ModelYear: {}, Price: {}", car.getBrand(),
					car.getModel(), car.getColor(), car.getRegistrationNumber(), car.getModelYear(), car.getPrice());
		}

	}

}
