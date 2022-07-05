
public class ClaseInteger1 {
    
	public static void main (String args []) {

        // Creación de objeto Integer usando 2o constructor
        
        Integer num1 = 125;

        //Creación de un objeto Integer usando 1er constructor
        
		Integer num2 = 20;

        /*Obtener un entero que almacena cada objeto Integer
        Si no se hace, las lineas siguientes causarian error */

        int n1 = num1.intValue();

        int n2 = num2.intValue();

        System.out.println("Suma de "+ n1 + " y " + n2 + " vale " + (n1+n2));

        if (n1 + n2 > 130)

            n1++;

        else

            n1--;
        
        System.out.println(n1);
    }
}