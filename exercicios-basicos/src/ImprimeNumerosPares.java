// os 20 primeiros
public class ImprimeNumerosPares {

	public static void main(String[] args) {

		int numeroInicial = 1;

		for (int numero = 1; numero <= 20;) {

			if (numeroInicial % 2 == 0) {
				System.out.println(numeroInicial);
				numero++;
			}
			numeroInicial++;
		}
	}
}
