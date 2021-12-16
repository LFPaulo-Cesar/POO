package exerciciosClassesEObjetos;

import java.util.Scanner;

public class ModeloProdutoEletronico {
	Scanner input = new Scanner(System.in);
	private String tipo, marca, modelo, cor, voltagem;

	ModeloProdutoEletronico(String tipo, String marca, String modelo, String cor, String voltagem) {
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.voltagem = voltagem;
	}
	
	public void CadastraProdutoEletronico() {
		System.out.println("Digite qual é o produto eletrônico: ");
		tipo = input.nextLine();
		System.out.println("Digite a marca do " + tipo);
		marca = input.nextLine();
		System.out.println("Digite o modelo do " + tipo);
		modelo = input.nextLine();
		System.out.println("Digite a cor do " + tipo);
		cor = input.nextLine();
		System.out.println("Digite a voltagem do " + tipo);
		voltagem = input.nextLine();
	}

	public void ImprimeInfo() {
		System.out.println("\t#####Dados do produto#####\nTipo produto eletrônico: "+tipo+"\nMarca: "+marca
				+"\nModelo: "+modelo+"\nCor: "+cor+"\nVoltagem: "+voltagem);
	}

	public void TestaProduto() {
		int opcao;
		System.out.println("\nDeseja testar o "+tipo+"?");
		System.out.println("1. Sim!");
		System.out.println("2. Não.");
		opcao = input.nextInt();
		if(opcao == 1) {
			LigarProduto();
			ApertandoBotaoPower();
			TestandoLeds();
			TestandoBotoes();
			System.out.println("\n"+tipo+" Testes do produto, tudo okay?");
			System.out.println("1. Sim!");
			System.out.println("2. Não.");
			opcao = input.nextInt();
			if(opcao == 1) {
				System.out.println("Obrigado! Volte Sempre!");
			}else if (opcao == 2) {
				System.out.println("Retornaremos do estoque um novo produto. Um momento.");
			}
		}else if(opcao == 2) {
			System.out.println("Você poderá trocar na loja dentro de 48 horas, caso o produto apresente algum defeito.");
		}
		
	}
	
	public void LigarProduto() {
		System.out.println("Colocando " +tipo+" na tomada...");
	}
	
	public void ApertandoBotaoPower() {
		System.out.println(tipo+" está ligando...");
	}
	
	public void TestandoLeds() {
		System.out.println("Testando leds e tela...");
	}
	
	public void TestandoBotoes() {
		System.out.println("Testando botões....");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
}
