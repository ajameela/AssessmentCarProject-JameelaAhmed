package assessmentCarProject;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarTester {

	public static ArrayList<Car> cars = new ArrayList<Car>();

	public static void main(String[] args) {

		loadCars("Car_Data.csv");
		
		insertionSort(cars);

		for (int i = 0; i < 10 ; i++) {
			System.out.println(cars.get(i));
		}
		
		int index = binarySearch(cars, "Kia");
		System.out.println(cars.get(index));
		System.out.println(index);

		for (int i = index; cars.get(i).equals("Kia") && i >= 0; i--) {
			index--;
		}
		System.out.println(index);
		for (int i = index; cars.get(i).equals("Kia") && i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		

	}
	
	static int binarySearch(ArrayList<Car> cars, String key) {
	      int low = 0;
	      int high = cars.size() - 1;
	   
	      while (high >= low) {
	         int mid = (high + low) / 2;
	        // if (cars.get(mid).getMileage()< key) {
	         if (cars.get(mid).getBrand().compareTo(key) < 0) {
	            low = mid + 1;
	         }
	         else if (cars.get(mid).getBrand().compareTo(key) > 0) {
	            high = mid - 1;
	         }
	         else {
	            return mid;
	         }
	      }
	   
	      return -1; // not found
	   }
	
	

	public static void bubbleSort(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size() - 1; i++) {
			for (int j = 0; j < cars.size() - i - 1; j++) {
				if (cars.get(j).getBrand().compareTo(cars.get(j + 1).getBrand()) > 0) {
					// int temp = numbers[j];
					Car temp = cars.get(j);
					// numbers[j] = numbers[j + 1];
					cars.set(j, cars.get(j + 1));
					// numbers[j + 1] = temp;
					cars.set(j + 1, temp);
				}
			}
		}
	}
	
	private static void insertionSort(ArrayList<Car> cars) {
	      for (int i = 1; i < cars.size(); i++) {
	         int j = i;
//	         while (j > 0 && numbers[j] < numbers[j - 1]) {
	         while (j > 0 && cars.get(j).getBrand().compareTo(cars.get(j - 1).getBrand()) < 0) {
	            // Swap numbers[j] and numbers [j - 1]
        	 	Car temp = cars.get(j);
				// numbers[j] = numbers[j + 1];
				cars.set(j, cars.get(j - 1));
				// numbers[j + 1] = temp;
				cars.set(j - 1, temp);
	            j--;
	         }
	      }
	   }

	public static void loadCars(String fileName) {

		try {
			Scanner fileScanner = new Scanner(new File(fileName));

			fileScanner.nextLine();
			
			int counter = 0;

			while (fileScanner.hasNextLine() && counter < 5000) {
				counter++;
				
				String line = fileScanner.nextLine();
				try {
					String[] fields = line.split(",");

					if (fields.length != 7) {
						throw new IllegalArgumentException("Expected 7 fields, found " + fields.length);
					}

					String carID = fields[0].trim();
					String brand = fields[1].trim();
					String model = fields[2].trim();
					int year = Integer.parseInt(fields[3].trim());
					String fuelType = fields[4].trim();
					String color = fields[5].trim();
					double mileage = Double.parseDouble(fields[6].trim());

					Car car = new Car(carID, brand, model, year, fuelType, color, mileage);
					cars.add(car);

				}

				catch (Exception e) {
					System.out.println("Skipping malformed row: " + line);
				}
			}

			fileScanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}

		System.out.println("Total cars loaded: " + cars.size());

	}
}
