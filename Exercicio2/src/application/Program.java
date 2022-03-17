package application;

import java.util.Scanner;

import entities.EmpregadoDaFaculdade;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	 
		
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		
		System.out.println("Digite seu nome: ");
		empregado.setNome(sc.next());
		
		System.out.println("Digite seu salario");
		empregado.setSalario(sc.nextDouble());
				
		System.out.println("Digite suas horas aulas");
		empregado.setHorasAula(sc.nextInt());

		System.out.printf("Teu salario com o bonus é: %.2f", empregado.getGastos());
		System.out.println();
		System.out.println(empregado.getInfo());
		
		sc.close();
	}

}
