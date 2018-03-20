package cl.gmunoz;

public class B_DemoSinSPR {

	public static void main(String[] args) throws Exception {

		//
		B_JournalSinSRP j = new B_JournalSinSRP();
		j.addEntry("Hoy estoy feliz");
		j.addEntry("Hoy almorc�");
		System.out.println(j); // Esto llama a un to.String
		
		//Aqu� corregimos el SPR, ya que guardamos mediante clase persistencia
		//y llamamos desde ac� al saveToFile
		B_Persistence p = new B_Persistence();
		String filename = "c:\\GONZALO\\journal.txt";
		p.saveToFile(j, filename, true);
		
		Runtime.getRuntime().exec("notepad.exe " + filename);
	}

}
