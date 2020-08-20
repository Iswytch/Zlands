import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {


	private Panneau pan;

	public Fenetre(){
		this.setTitle("Bienvenue dans Zlands");
		this.setSize(1600,900);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setVisible(true);		
		pan = new Panneau();
		this.setContentPane(pan);

		deplacerMob();
	}

	private void deplacerMob() {
		System.out.println("width = "+this.getWidth());
		for (int i = 0; i < this.getWidth(); i++) {
			int x = pan.getPosX();
			x--;
			pan.setPosX(x);
			pan.repaint(); 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}