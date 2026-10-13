package assessmentCarProject;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarTester {

	private static ArrayList<Car> cars = new ArrayList<Car>();

	public static void main(String[] args) {
		

	}

	public static ArrayList<Car> loadCars(String fileName) {
		ArrayList<Car> cars = new ArrayList<Car>();

		try {
			Scanner fileScanner = new Scanner(new File(fileName));

			if (fileScanner.hasNextLine()) {
				fileScanner.nextLine();
			}

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				try {
					String[] fields = line.split(";");

					if (fields.length != 7) {
						throw new IllegalArgumentException("Expected 7 fields, found " + fields.length);
					}

					String carID = fields[0].trim();
					String brand = fields[1].trim();
					String model = fields[2].trim();
					int year = Integer.parseInt(fields[3].trim());
					String fuelType = fields[4].trim();
					String color = fields[5].trim();
					int mileage = Integer.parseInt(fields[6].trim());

					Car car = new Car(carID, brand, model, year, fuelType, color, mileage);
					cars.add(car);

				} catch (Exception e) {
					System.out.println("Skipping malformed row: " + line);
				}
			}

			fileScanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}

		System.out.println("Total cars loaded: " + cars.size());
		return cars;

	}
}
