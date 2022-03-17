package application;

import java.util.Scanner;

import entities.Car;
import entities.Client;
import entities.Transaction;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Registering car-------");
		System.out.print("Type the brand: ");
		String brand = sc.nextLine();
		System.out.print("Type the model: ");
		String model = sc.nextLine();
		System.out.print("Type the year of manufacture: ");
		int year = sc.nextInt();
		System.out.print("Type the color: ");
		String color = sc.next();
		System.out.print("Type the mileage: ");
		Double mileage= sc.nextDouble();
		
		Car car = new Car(brand,model,year,color,mileage);
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-------Registering Client-------");
		System.out.print("Type the name: ");
		String name= sc.next();
		System.out.print("Type the Phone Number: ");
		String phoneNumber = sc.next();
		sc.nextLine();
		System.out.print("Type the CPF: ");
		String cpf = sc.next();
		
		Client client = new Client(name,phoneNumber,cpf);
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-------Registering Transaction-------");
		System.out.print("Type the value: ");
		Double value = sc.nextDouble();
		System.out.print("Type the Form of Payment: ");
		String formOfPayment = sc.next();
		
		Transaction transaction = new Transaction(client,value,formOfPayment,car);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println(transaction);
		
		sc.close();
		
	}

}