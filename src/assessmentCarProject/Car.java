//Jameela Ahmed
//10.13.2026

package assessmentCarProject;

import java.util.Objects;

public class Car {
	private String carID;
	private String brand;
	private String model;
	private int year;
	private String fuelType;
	private String color;
	private double mileage;

	public Car(String carID, String brand, String model, int year, String fuelType, String color, double mileage) {
		super();
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.color = color;
		this.mileage = mileage;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
		this.carID = carID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", brand=" + brand + ", model=" + model + ", year=" + year + ", fuelType="
				+ fuelType + ", color=" + color + ", mileage=" + mileage + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(carID, other.carID)
				&& Objects.equals(color, other.color) && Objects.equals(fuelType, other.fuelType)
				&& mileage == other.mileage && Objects.equals(model, other.model) && year == other.year;
	}

}
