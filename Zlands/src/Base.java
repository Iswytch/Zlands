import java.util.LinkedList;

public class Base {

	private int HP;
	LinkedList<Laser> laser = new LinkedList<Laser>();


	//BASE PAS UPGRADABLE TODO
	public Base() {
		this.HP = 20;
		laser.offer(new Laser());

	}


	public LinkedList<Laser> getLaser() {
		return laser;
	}


	public void setLaser(LinkedList<Laser> laser) {
		this.laser = laser;
	}


	public int getHPBase() {
		return HP;
	}


	public void setHPBase(int hP) {
		HP = hP;
	}
	
	
}
