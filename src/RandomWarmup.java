import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class RandomWarmup {

	public static void main(String[] args) {
		String num=JOptionPane.showInputDialog(null, " what is your number?");
		int number=Integer.parseInt(num);
		String wor=JOptionPane.showInputDialog(null, "what is your word?");
		for (int i = 0; i < number; i++) {
			System.out.println(wor);
		}
		
		
	}

	
	
	
	
	
}