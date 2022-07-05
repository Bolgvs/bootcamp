public class Act_5 {
	
	public static void main (String args []) {
		
		// Variables:
		
		int A = 91, B = 38, C = 77, D = 189;
		
		// Valor de las variables antes del cambio
		
		System.out.println("A =" + A + "\nB = " + B + "\nC = " + C + "\nC = " + D);
		
		// Ejercicio:
		
		B = C;
			
		C = A;
		
		A = D;
		
		D = B;
		
		System.out.println("\nA =" + A + "\nB = " + B + "\nC = " + C + "\nC = " + D);
		
	}

}
