

// UTILE ???


public abstract class Mob {

	private int nbHP;
	private int vitesse;
	private int degat;
	private int resistance;
	private int x;


	public Mob(int nbHP, int vitesse, int degat, int resistance, int x) {
		this.nbHP = nbHP;
		this.vitesse = vitesse;
		this.degat = degat;
		this.resistance = resistance;
		this.x = x;
	}


	//GETTERS AND SETTERS 

	public int getXMob() {
		return x;
	}


	public void setXMob(int x) {
		this.x = x;
	}


	public int getNbHPMob() {
		return nbHP;
	}


	public void setNbHPMob(int nbHP) {
		this.nbHP = nbHP;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	public int getDegatMob() {
		return degat;
	}


	public void setDegatMob(int degat) {
		this.degat = degat;
	}


	public int getResistance() {
		return resistance;
	}


	public void setResistance(int resistance) {
		this.resistance = resistance;
	}



	//METHODS TODO

	public boolean isAlive () {
		return (nbHP>0);
	}




}
