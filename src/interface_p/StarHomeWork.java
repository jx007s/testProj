package interface_p;


class Resource{
	int [] rr = new int[2];
}


class PartsBuild{
	String name;
	Resource rr;
	int [] cnt = new int[3];
}


class PartsRider{
	String name;
	int [] cnt = new int[3];
}


class PartsEnemy{
	String name;
	int [] cnt = new int[3];
}


interface Build{
	void building(PartsBuild bb);
	void repair(PartsBuild bb);
}


interface Ride{
	void repair(PartsRider bb);
	void riding(PartsRider bb);
}
interface Enemy{
	void attack(PartsEnemy bb);
}

class Data{
	PartsBuild [] pb = new PartsBuild[0];
	PartsRider [] pr = new PartsRider[0];
	PartsEnemy [] pe = new PartsEnemy[0];
}

public class StarHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
