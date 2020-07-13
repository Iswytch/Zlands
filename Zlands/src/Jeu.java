
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
		
		while (!endGame()) {
			
			System.out.println("");
			System.out.println("--- Nouvelle boucle ---");
			System.out.println("");


			checkPointerNullLaser();
			if (base.getLaser()!=null) {
				base.getLaser().setXLaser(base.getLaser().getXLaser()+1);
				System.out.println("x laser = "+ base.getLaser().getXLaser());
			}

			
			
			if (wave.getListMobs().get(0).getXMob() > 0 ) {
				wave.getListMobs().get(0).setXMob(wave.getListMobs().get(0).getXMob()-1);
				System.out.println("x mob = "+ wave.getListMobs().get(0).getXMob());
			}
			

			checkContactLaser();
			checkContactBase();
			wave.checkMobsKilled();
			
			launchCheckForNextWave();

		}

	}



	public boolean endGame() {
		if (currentWave==Wave.nbWave && wave.waveFinish()) {
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
