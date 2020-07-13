
public class Base {

	private int HP;
	private Laser laser;


	//BASE PAS UPGRADABLE TODO
	public Base() {
		this.HP = 20;
		this.laser = new Laser();
		//		for (int i = 0; i < 5; i++) {
		//			this.laser = new Laser();
		//			try {
		//				Thread.sleep(1);
		//			} catch (InterruptedException e) {
		//				e.printStackTrace();
		//			}
		//		}

	}


	public Laser getLaser() {
		return laser;
	}


	public void setLaser(Laser laser) {
		this.laser = laser;
	}


	public int getHPBase() {
		return HP;
	}


	public void setHPBase(int hP) {
		HP = hP;
	}
	
	
	public void generateLaser() {
		this.laser = new Laser() ;
	}

}
