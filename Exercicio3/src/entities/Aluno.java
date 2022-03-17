package entities;

public class Aluno {
	
	private String nome;
	private Integer matricula;
	private Double notaAV1;
	private Double notaAV2;
	private Double notaAE;
	private String curso;
	private Integer periodo;

	public Aluno(String nome, Integer matricula, String curso, Integer periodo) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public void alterarNotaAV1(Double notaAV1){
		this.notaAV1 = notaAV1;
	}
	
	public void alterarNotaAV2(Double notaAV2) {
		this.notaAV2 = notaAV2;
	}
	
	public void alterarNotaAE(Double notaAE) {
		this.notaAE = notaAE;
	}
	
	public Double lerNotaAV1() {
		return notaAV1;
	}
	
	public Double lerNotaAV2() {
		return notaAV2;
	}
	
	public Double lerNotaAE() {
		return notaAE;
	}
	
	//Criar um método para avaliarAluno que deverá receber como parâmetros os valores de notaAV1, notaAV2, e mostrar a seguinte mensagem:
	
	public String avaliarAluno(Double notaAV1, Double notaAV2) {
		Double soma = notaAV1 + notaAV2;
		if (soma >= 60) {
			return "Aprovado";
		}else {
			return "Recuperacao";
		}
	}
	//Criar um método para avaliarRecuperação que deverá receber como parâmetro os
	//valores de notaAV1, notaAV2 e notaAE. Deverá ser calculado a nota média. Se o valor
	//total for superior ou igual a 60 pontos, o aluno é Aprovado, caso contrário Reprov
	
	public String avaliarRecuperacao(Double notaAV1, Double notaAV2, Double notaAE) {
		Double media = (notaAV1+notaAV2+notaAE)/3;
		if (media >= 60) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
		
	}
	
	
}
