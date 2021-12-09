
public class ImprimirTabuada {
	public static void main(String[] args) {

		int resultado;

		for (int numero = 1; numero <= 10; numero++) {
			for (int numeroAMultiplicar = 1; numeroAMultiplicar <= 10; numeroAMultiplicar++) {
				resultado = numero * numeroAMultiplicar;
				System.out.println(numero + " X " + numeroAMultiplicar + " = " + resultado);
			}
			
			System.out.println("------------");
		}
	}
}
