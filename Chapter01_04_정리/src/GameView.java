

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class GameView extends JPanel {


		Image back, horse, airplane;
		int x=450;
		int y=310;
		public GameView() {
			back = Toolkit.getDefaultToolkit().getImage("C:\\javadv\\back.jpg");
			horse = Toolkit.getDefaultToolkit().getImage("C:\\javadv\\horse.gif");
			//airplane = Toolkit.getDefaultToolkit().getImage("C:\\javadv\\airplane.png");
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
			g.drawImage(horse, x, y, 200, 200, this);
			//g.drawImage(airplane, 0, 10, 200, 200, this);
			
		}

}
