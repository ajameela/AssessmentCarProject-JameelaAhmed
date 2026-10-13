//this is the start of your Car class 

package assessmentCarProject;

import java.util.Objects;

public class Car {
	private String carID;
	private String brand;
	private String model;
	private String year;
	private String fuelType;
	private String color;
	private String mileage;
	
	public Car(String carID, String brand, String model, String year, String fuelType, String color, String mileage) {
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
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
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
	
	public String getMileage() {
		return mileage;
	}
	
	public void setMileage(String mileage) {
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
				&& Objects.equals(mileage, other.mileage) && Objects.equals(model, other.model)
				&& Objects.equals(year, other.year);
	}
		
}
