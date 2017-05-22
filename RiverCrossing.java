import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RiverCrossing implements ActionListener {
    JButton[][] button = new JButton[9][13];
    ImageIcon water  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/water1.jpg");
    ImageIcon bank1  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/bank1.jpg");
    ImageIcon bank2  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/bank2.jpg");
	ImageIcon stump2_man  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/stump2_man.jpg");

    JFrame mainFrame = new JFrame();
    JPanel UIPanel = new JPanel();
    JPanel gamePanel = new JPanel();
	

    public void RiverCrossing() {
        gamePanel.setLayout(new GridLayout(13,9));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int x=0; x<9; x++){
            for(int i= 0; i<13; i++){
                button[x][i] = new JButton(water);
                gamePanel.add(button[x][i]);
            }
        }

        for(int x =0; x<1; x++) {
            for (int i = 0; i < 9; i++) {
                button[x][i].setIcon(bank2);
            }
        }

        for(int x =8; x<9; x++) {
            for (int i = 4; i < 13; i++) {
                button[x][i].setIcon(bank1);
            }
        }

        //GETS RID OF LINESZZZZ
        for(int x =0; x<9; x++) {
            for (int i = 0; i < 13; i++) {
                button[x][i].setBorderPainted(false);
                button[x][i].setFocusPainted(false);
            }
        }
		
		button[8][6].setIcon(stump2_man);
	
        mainFrame.add(UIPanel);
        mainFrame.setSize(310,350);
        mainFrame.add(gamePanel);
        mainFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}