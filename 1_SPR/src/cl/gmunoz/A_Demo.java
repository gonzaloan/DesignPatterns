package cl.gmunoz;

public class A_Demo {

	public static void main(String[] args) {
		/**
		 * Single Responsible Principle: Cada clase se encarga de una actividad.
		 * 
		 */
		
		A_Journal j = new A_Journal();
		j.addEntry("Hoy estoy feliz");
		j.addEntry("Hoy almorcé");
		System.out.println(j); // Esto llama a un toString
		
	
		
	}

}
