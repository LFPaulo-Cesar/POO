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
		System.out.println("Modelo do avião: " + modelo + "\nCor do avião: " + cor + "\nCompanhia: " + companhia
				+ "\nAno: " + ano);
	}

	public void LigarAviao() {
		System.out.println("O avião está ligando...");
	}

	public int VelocidadeNaPistaDePouso(int velocidade) {
		for (velocidade = 0; velocidade <= 160; velocidade += 40) {
			if (velocidade == 0) {
				System.out.println("O Avião está parado");
			} else if (velocidade == 40) {
				System.out.println("O Avião está a 40KM/h");
			} else if (velocidade == 80) {
				System.out.println("O Avião está a 80KM/h");
			} else if (velocidade == 120) {
				System.out.println("O Avião está a 120KM/h");
			} else {
				System.out.println("O avião está pronto pra decolar");
			}
		}
		return velocidade;
	}

	public int Altitude(int altitude) {
		for (altitude = 30; altitude <= 6000; altitude += 470) {
			switch (altitude) {
			case 30:
				System.out.println("O avião está a 30 pés de altura.");
			case 1000:
				System.out.println("O avião está a 1000 pés de altura.");
			case 2500:
				System.out.println("O avião está a 2500 pés de altura.");
			case 4000:
				System.out.println("O avião está a 4000 pés de altura.");
			case 6000:
				System.out.println("O avião está a 6000 pés de altura.");
			}
		}
		return altitude;
	}

	public int Emergencia(int opcao) {
		System.out.println("\tVocê ativou o botão de Emergência!");
		System.out.println("Está em emergência?");
		System.out.println("1. Sim");
		System.out.println("2. Não");
		opcao = input.nextInt();
		if (opcao == 1) {
			System.out.println("Segurem os cintos! O piloto sumiu...");
		} else {
			System.out.println("Quer uma barrinha de cereal? A aeromoça está a caminho");
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
