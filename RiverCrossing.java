import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RiverCrossing extends JFrame {

	public static void main(String[] args){
		int rows = 9;
		int cols = 13;
		RiverCrossing gt = new RiverCrossing(rows, cols);
		gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gt.pack();
		gt.setVisible(true);
	}

	public RiverCrossing(int rows, int cols) {
		 Container pane = getContentPane();
		 pane.setLayout(new GridLayout(rows, cols));
		 for (int i = 0; i < 117; i++){
			JButton button = new JButton(Integer.toString(i +1));
			pane.add(button);
		 }
	}
}
