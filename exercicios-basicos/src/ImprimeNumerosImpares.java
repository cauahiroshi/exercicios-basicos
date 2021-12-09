// 
public class ImprimeNumerosImpares {

	public static void main(String[] args) {

		int primeiroNumero = 1; 

		for (int numero = 1; numero <= 20;) {
			
			if (primeiroNumero % 2 != 0) {
				System.out.println(primeiroNumero);
				numero++;
			}
			primeiroNumero++;
		}

	}
}
