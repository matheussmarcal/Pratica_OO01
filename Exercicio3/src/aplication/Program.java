package aplication;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite seu matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Digite seu curso: ");
		String curso = sc.next();
		System.out.println("Digite seu periodo: ");
		int periodo = sc.nextInt();
		
		Aluno aluno = new Aluno(nome,matricula,curso,periodo);
		
		//Criar no Void main() um objeto com dados solicitados e testes dos métodos
		//implementados na classe
		
		System.out.println("Digite a nota da AV1: ");
		aluno.alterarNotaAV1(sc.nextDouble());
		System.out.println("Digite a nota da AV2: ");
		aluno.alterarNotaAV2(sc.nextDouble());
		
		String resultado = aluno.avaliarAluno(aluno.lerNotaAV1(),aluno.lerNotaAV2());
		System.out.println("Você foi "+resultado);
		
		if (resultado.equals("Recuperacao")) {
			System.out.println("Digite a nota da AE: ");
			aluno.alterarNotaAE(sc.nextDouble());
			resultado = aluno.avaliarRecuperacao(aluno.lerNotaAV1(), aluno.lerNotaAV2(), aluno.lerNotaAE());
			System.out.println("Você foi "+resultado);
		}
		
		sc.close();
	}

}
