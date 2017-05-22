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
	ImageIcon stump1_man  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/stump1_man.jpg"); 
	ImageIcon stump3  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/stump3.jpg"); 
	ImageIcon plank2  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/plank2.jpg"); 
	ImageIcon stump1  = new ImageIcon("C:/Users/bentocru/IdeaProjects/RiverCrossing/src/stump1.jpg"); 
	
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
		
		button[8][6].setIcon(stump1_man);
		button[4][4].setIcon(stump1);
	    button[5][9].setIcon(stump1);
		button[0][6].setIcon(stump3);
		button[4][8].setIcon(stump1);
		button[3][3].setIcon(stump1);
		button[5][0].setIcon(plank2);
		button[6][5].setIcon(plank2);
		button[7][1].setIcon(plank2);
		button[7][10].setIcon(plank2);
		
        mainFrame.add(UIPanel);
        mainFrame.setSize(310,350);
        mainFrame.add(gamePanel);
        mainFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}