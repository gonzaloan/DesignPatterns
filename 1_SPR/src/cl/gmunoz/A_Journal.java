package cl.gmunoz;

import java.util.ArrayList;
import java.util.List;

public class A_Journal {

	private final List<String> entries = new ArrayList<>();
	private static int count = 0;
	
	public void addEntry(String text){
		entries.add("" + (++count) + ": " + text);
	}
	
	public void removeEntry(int index){
		entries.remove(index);
	}
	/**
	 * Hasta aqu� estamos cumpliendo el principio de una responsabilidad, ya que
	 * toda la funcionalidades son relevantes a Journal.
	 */

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}

	
}