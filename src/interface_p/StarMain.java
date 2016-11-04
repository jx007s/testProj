package interface_p;
interface Building
{
	void build(String name);
	void repair(String name);
}
interface Riding
{
	void ride(String name);
	void repair(String name);
}
interface Fight
{
	void attack(String name);
}


interface BRF extends Building, Riding, Fight
{
	
}

class SCV implements BRF
{
	String name;
	
	
	public SCV(String name) {
		super();
		this.name = name;
	}

	@Override
	public void build(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"이 "+name+"을 지어요");
	}
	@Override
	public void repair(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"이 "+name+"을 고쳐요");
	}
	
	@Override
	public void ride(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"이 "+name+"을 타요");
	}
	@Override
	public void attack(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"이 "+name+"과 싸워요");
	}
}




public class StarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCV scv = new SCV("이신협");
		Building bb;
		Riding rr;
		Fight ff;
		
		bb = scv;
		bb.build("우리집");
		bb.repair("교실");
		
		rr = scv;
		rr.ride("GSX750");
		rr.repair("우리집차");
		
		ff = scv;
		ff.attack("도둑");
	}

}
