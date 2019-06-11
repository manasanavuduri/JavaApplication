package game;
import java.awt.Dimension;

import javax.swing.JFrame;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Snake");
		
		frame.setContentPane(new GamePannel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		
		frame.setPreferredSize(new Dimension(GamePannel.WIDTH,GamePannel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
