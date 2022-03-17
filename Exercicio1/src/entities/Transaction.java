package entities;

public class Transaction {
	
	private Client client;
	private Double value;
	private String formOfPayment;
	private Car car;
	
	public Transaction(Client client,Double value, String formOfPayment, Car car) {
		this.client = client;
		this.value = value;
		this.formOfPayment = formOfPayment;
		this.car = car;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public String getFormOfPayment() {
		return formOfPayment;
	}

	public void setFormOfPayment(String formOfPayment) {
		this.formOfPayment = formOfPayment;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CLient name: "+client.getName()+"\n");
		sb.append("CLient phone: "+client.getPhoneNumber()+"\n");
		sb.append("CLient CPF: "+client.getCpf()+"\n");
		sb.append("\n");
		sb.append("Form of payment: "+ formOfPayment +"\n");
		sb.append("Value: "+ value +"\n");
		sb.append("\n");
		sb.append("Car brand: "+ car.getBrand() +"\n");
		sb.append("Car model: "+ car.getModel() +"\n");
		sb.append("Car year: "+ car.getYear()+"\n");
		sb.append("Car color: "+ car.getColor() +"\n");
		sb.append("Car mileage: "+ car.getMileage() +"\n");
		return sb.toString();
	}
	
}
