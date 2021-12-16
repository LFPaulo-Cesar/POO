package exerciciosClassesEObjetos;

import java.util.Scanner;

public class ModeloAviao {
	Scanner input = new Scanner(System.in);
	// atributo
	private String modelo, cor, companhia;
	private int ano;

	// construtores - mesmo nome da classe
	public ModeloAviao(String modelo, String cor, String companhia, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.companhia = companhia;
		this.ano = ano;
	}

	// metodo imprimir
	public void ImprimeInfo() {
		System.out.println("Modelo do avi�o: " + modelo + "\nCor do avi�o: " + cor + "\nCompanhia: " + companhia
				+ "\nAno: " + ano);
	}

	public void LigarAviao() {
		System.out.println("O avi�o est� ligando...");
	}

	public int VelocidadeNaPistaDePouso(int velocidade) {
		for (velocidade = 0; velocidade <= 160; velocidade += 40) {
			if (velocidade == 0) {
				System.out.println("O Avi�o est� parado");
			} else if (velocidade == 40) {
				System.out.println("O Avi�o est� a 40KM/h");
			} else if (velocidade == 80) {
				System.out.println("O Avi�o est� a 80KM/h");
			} else if (velocidade == 120) {
				System.out.println("O Avi�o est� a 120KM/h");
			} else {
				System.out.println("O avi�o est� pronto pra decolar");
			}
		}
		return velocidade;
	}

	public int Altitude(int altitude) {
		for (altitude = 30; altitude <= 6000; altitude += 470) {
			switch (altitude) {
			case 30:
				System.out.println("O avi�o est� a 30 p�s de altura.");
			case 1000:
				System.out.println("O avi�o est� a 1000 p�s de altura.");
			case 2500:
				System.out.println("O avi�o est� a 2500 p�s de altura.");
			case 4000:
				System.out.println("O avi�o est� a 4000 p�s de altura.");
			case 6000:
				System.out.println("O avi�o est� a 6000 p�s de altura.");
			}
		}
		return altitude;
	}

	public int Emergencia(int opcao) {
		System.out.println("\tVoc� ativou o bot�o de Emerg�ncia!");
		System.out.println("Est� em emerg�ncia?");
		System.out.println("1. Sim");
		System.out.println("2. N�o");
		opcao = input.nextInt();
		if (opcao == 1) {
			System.out.println("Segurem os cintos! O piloto sumiu...");
		} else {
			System.out.println("Quer uma barrinha de cereal? A aeromo�a est� a caminho");
		}

		return opcao;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
