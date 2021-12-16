package exerciciosClassesEObjetos;

public class TesteProdutoEletronico {
	public static void main(String[] args) {

		ModeloProdutoEletronico produto1 = new ModeloProdutoEletronico(null, null, null, null, null);
		
		produto1.CadastraProdutoEletronico();
		produto1.ImprimeInfo();
		produto1.TestaProduto();
	}
}