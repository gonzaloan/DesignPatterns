package cl.gmunoz;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class B_JournalSinSRP {

	private final List<String> entries = new ArrayList<>();
	private static int count = 0;
	
	public void addEntry(String text){
		entries.add("" + (++count) + ": " + text);
	}
	
	public void removeEntry(int index){
		entries.remove(index);
	}
	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}

	/**
	 * Hasta aquí estamos cumpliendo el principio de una responsabilidad, ya que
	 * toda la funcionalidades son relevantes a Journal.
	 */

	public void save(String filename) throws FileNotFoundException{
		try(PrintStream out = new PrintStream(filename)){
			out.println(toString());
		}
	}
	
	public void load (String filename){
		
	}
	public void load(URL url){}
	
	/**
	 * Se rompe el principio, ya que ahora se le están dando responsabilidades de 
	 * persistencia a la clase. Para solucionar esto, se agrega la persistencia en una clase distinta.
	 * 
	 */
}
