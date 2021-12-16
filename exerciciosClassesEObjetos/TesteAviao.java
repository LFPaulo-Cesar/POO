package exerciciosClassesEObjetos;

public class TesteAviao {
	public static void main(String[] args) {
		ModeloAviao aviao1 = new ModeloAviao("Boeing 737", "Fucsia", "Gol", 1997);
		ModeloAviao aviao2 = new ModeloAviao("Airbus A320", "Gelo", "Azul", 1986);
		aviao1.ImprimeInfo();
		System.out.println();
		aviao2.ImprimeInfo();
		System.out.println();
		System.out.println("****************Azul anuncia compra da Gol!***************");
		aviao1.setCompanhia("Azul");
		aviao1.ImprimeInfo();
		System.out.println();
		aviao1.LigarAviao();
		aviao1.VelocidadeNaPistaDePouso(0);
		System.out.println();
		aviao1.Altitude(0);
		aviao1.Emergencia(0);
	}
}
