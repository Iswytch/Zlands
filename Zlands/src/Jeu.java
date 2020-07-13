
public class Jeu {

	private int currentWave;
	private Base base;
	private Wave wave;

	public Jeu() {
		this.currentWave=0;
		this.base = new Base();
		this.wave = new Wave(currentWave);
	}


	public void playGame () {
		int xLaser = base.getLaser().getXLaser();
		int xMob = wave.getListMobs().get(0).getXMob();
		int gameRun = 0;

		while (!endGame()) {

			System.out.println("");
			System.out.println("--- Nouvelle boucle ---");
			System.out.println("");
			launchCheckForNextWave();

//			if (gameRun%10==0&&gameRun!=0) {
//				System.out.println("in");
//				base.setLaser(new Laser());
//				xLaser=0;
//			}

			checkPointerNullLaser();
			if (base.getLaser()!=null) {
				xLaser++;
				base.getLaser().setXLaser(xLaser);
				System.out.println("x laser = "+ xLaser);
			}


			if (wave.getListMobs().get(0).getXMob() > 0 ) {
				xMob--;
			}
			wave.getListMobs().get(0).setXMob(xMob);
			System.out.println("x mob = "+ xMob);


			checkContactLaser();
			checkContactBase();
			wave.checkMobsKilled();

			gameRun++;
			System.out.println("gR = "+gameRun);
		}

	}



	public boolean endGame() {
		if (currentWave==Wave.nbWave) {
			System.out.println("Bravo ! Vous avez fini le jeu !");
			return true;
		}else if(base.getHPBase()<=0){
			System.out.println("Game Over");
			return true;
		}else {
			return false;
		}
	}




	public void launchCheckForNextWave () {
		if (wave.waveFinish()) {
			System.out.println("Nouvelle vague");
			currentWave++;
			this.wave = new Wave(currentWave);
		}

	}


	public void checkContactLaser () {
		if (base.getLaser()!=null) { 
			if (base.getLaser().getXLaser() == wave.getListMobs().get(0).getXMob()) {
				wave.getListMobs().get(0).setNbHPMob ( wave.getListMobs().get(0).getNbHPMob() - base.getLaser().getDegat() );
				System.out.println("hp mob = "+  wave.getListMobs().get(0).getNbHPMob());
			}
		}
	}


	public void checkPointerNullLaser () {
		if (base.getLaser() != null ) {
			System.out.println("debug"+wave.getListMobs());
			if (base.getLaser().getXLaser() >= wave.getListMobs().get(0).getXMob()) {
				base.setLaser(null);
			}
		}
	}


	public void checkContactBase () {
		if (wave.getListMobs().get(0).getXMob()== 0) {
			base.setHPBase ( base.getHPBase() - wave.getListMobs().get(0).getDegatMob() );
			System.out.println("hp base : "+ base.getHPBase());
		}
	}




}
