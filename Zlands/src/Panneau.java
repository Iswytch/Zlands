import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Panneau extends JPanel {

	
	private int posX = 1400;
	private int posY = 700;
	


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public void paintComponent(Graphics g){
		try {
			
			Image stickman = ImageIO.read(new File("julesv2.jpg"));
			Image fond = ImageIO.read(new File("fond.png"));
			Image base = ImageIO.read(new File("base.png"));


			g.drawImage(fond, 0, 0, this.getWidth(), this.getHeight(), this);
			g.drawImage(base, 0, 500, this);
			g.drawImage(stickman, posX, posY, this);
			g.drawImage(stickman, posX+500, posY, this);
			g.drawImage(stickman, posX+1000, posY, this);


		} catch (IOException e) {
			e.printStackTrace();
		}                
	}               
}