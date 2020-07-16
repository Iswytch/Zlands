import java.util.LinkedList;

public class Wave {


	public static int nbWave = 2;
	LinkedList<Mob> listMobs = new LinkedList<Mob>();


	public Wave(int currentWave) {

		System.out.println("cW = "+currentWave);
		switch(currentWave) {
		case 0:
			listMobs.offer(new MobsNiv1());
			System.out.println("mob add : wave 1 " + listMobs);
			break;
		case 1:
			listMobs.offer(new MobsNiv1());
			
			//TODO better way to spawn another mob
			listMobs.offer(new MobsNiv1());
			listMobs.getLast().setXMob(listMobs.getLast().getXMob()+listMobs.size()-1);
			
			listMobs.offer(new MobsNiv1());
			listMobs.getLast().setXMob(listMobs.getLast().getXMob()+listMobs.size()-1);
			System.out.println("mob add : wave 2 " + listMobs);
			break;
		}

	}


	public LinkedList<Mob> getListMobs() {
		return listMobs;
	}


	public void setListMobs (LinkedList<Mob> listMobs) {
		this.listMobs = listMobs;
	}


	public void checkMobsKilled () {
			if (listMobs.element().getNbHPMob() <= 0 ) {
				listMobs.poll();
			}
	}

	public boolean waveFinish () {
		return listMobs.isEmpty();
	}



}






