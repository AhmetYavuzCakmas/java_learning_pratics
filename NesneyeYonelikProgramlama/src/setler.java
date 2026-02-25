import java.awt.event.ItemEvent;
import java.util.TreeSet;

import javax.swing.event.TreeExpansionEvent;

public class setler {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();

		tree.add(10);
		tree.add(8);
		tree.add(12);
		
		tree.forEach(item -> System.out.println(item));
	}

}
