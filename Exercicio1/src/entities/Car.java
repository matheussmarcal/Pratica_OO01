package entities;

public class Car {
	
	private String brand;
	private String model;
	private Integer year;
	private String color;
	private Double mileage;
	
	public Car(String brand, String model, Integer year, String color, Double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	
	
	
	
}
