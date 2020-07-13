import java.util.ArrayList;
import java.util.List;

public class Wave {


	public static int nbWave = 2;
	List<Mob> listMobs = new ArrayList<Mob>();


	public Wave(int currentWave) {

		System.out.println("cW = "+currentWave);
		switch(currentWave) {
		case 0:
			listMobs.add(new MobsNiv1());
			System.out.println("mob add : 1 " + listMobs);
			break;
		case 1:
			listMobs.add(new MobsNiv1());
			listMobs.add(new MobsNiv1());
			System.out.println("mob add : 2 " + listMobs);
			break;
		}

	}


	public List<Mob> getListMobs() {
		return listMobs;
	}


	public void setListMobs(List<Mob> listMobs) {
		this.listMobs = listMobs;
	}


	public void checkMobsKilled () {
		for (int i = 0; i < listMobs.size(); i++) {
			if (listMobs.get(i).getNbHPMob() <= 0 ) {
				listMobs.remove(i);
			}
		}
	}

	public boolean waveFinish () {
		return listMobs.isEmpty();
	}



}






