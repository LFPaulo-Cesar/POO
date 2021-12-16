package exerciciosClassesEObjetos;

import java.util.Scanner;

public class ModeloCliente {
	Scanner input = new Scanner(System.in);
//atributos
	private String nome, dataDeNascimento, endereco;
	private long cpf, numeroDeTelefone;
	
	//construtores
	public ModeloCliente(String nome, String dataDeNascimento, String endereco, long cpf, long numeroDeTelefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.cpf = cpf;
		this.numeroDeTelefone = numeroDeTelefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public void setNumeroDeTelefone(long numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}
	
	public void ClienteEntraNaloja() {
		System.out.println("O sino da porta está tocando... Confira!\nCliente entrou na loja!");
	}
	
	public void ClienteAtendimento() {
		int opcao;
		System.out.println("\nCliente é atendido.");
		System.out.println("\nCliente encontrou o produto?");
		System.out.println("1.Sim");
		System.out.println("2.Não");
		opcao = input.nextInt();
		if (opcao == 1) {
			ClienteEncontrouOproduto();
			System.out.println("\nCliente gostou da loja e do atendimento?");
			System.out.println("1.Sim");
			System.out.println("2.Não");
			opcao = input.nextInt();
			if(opcao == 1) {
				ClienteComprouOProduto();
				ImprimeInfo();
				ClienteSaiDaloja();
			}else {
				ClienteInsatisfeito();
			}
		}else {
			ClienteNaoEncontrouOproduto();
		}
	}
	private void ClienteEncontrouOproduto() {
		System.out.println("\nÉ este aqui! Quero levar.");
	}
	
	private void ClienteNaoEncontrouOproduto() {
		System.out.println("\nNão tinha o que eu queria. Lojinha ¬¬");
	}
	
	private void ClienteComprouOProduto() {
		System.out.println("\nO cliente comprou o produto e está satisfeito");
	}
	
	public void ImprimeInfo() {
		System.out.println("\n\t#####DADOS DO CLIENTE#####");
		System.out.println("Nome do cliente: "+nome+"\nCPF: "+cpf+"\nData de nascimento: "+dataDeNascimento+"\nEndereço: "+
		endereco+"\nTelefone: "+numeroDeTelefone);
		System.out.println("\t*****OBRIGADO PELA COMPRA*****");
	}
	
	private void ClienteInsatisfeito() {
		System.out.println("\nMeu nome é Karen e eu quero falar com o seu gerente!!!");
	}
	
	private void ClienteSaiDaloja() {
		System.out.println("\nO sino da porta está tocando... Confira!\nCliente saiu da loja!\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
