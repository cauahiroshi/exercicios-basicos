// os 10 primeiros numeros 
public class ImprimeNumerosFibonacci {

	public static void main(String[] args) {
		
		int numero = 1; 
		
		int primeiroNumero = 0;
		int segundoNumero = 1; 
		int terceiroNumero = 0; 
		
		
		while(numero <= 10) {
			terceiroNumero= primeiroNumero + segundoNumero; 
			primeiroNumero=segundoNumero; 
			segundoNumero=terceiroNumero; 
			terceiroNumero= primeiroNumero + segundoNumero; 
			
			System.out.println(terceiroNumero);
			numero++;
		}
	}

}

// 0-1-1-2-3-5-8
