package exerciciosClassesEObjetos;

public class TestaCliente {
	public static void main(String[] args) {
		ModeloCliente cliente1 = new ModeloCliente("Paulo Cesar Lopes Filho", "01/05/1994", "Rua das Oliveiras, 468", 7252219925l, 32248661l);
		ModeloCliente cliente2 = new ModeloCliente("Rita de Cássia", "02/09/1986", "Jardim das Acássias, 1001", 97843827155l, 33445251);
		cliente1.ClienteEntraNaloja();
		cliente1.ClienteAtendimento();
		cliente2.ClienteEntraNaloja();
		cliente2.ClienteAtendimento();
	}
}
