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
		System.out.println(this.name+"�� "+name+"�� �����");
	}
	@Override
	public void repair(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� "+name+"�� ���Ŀ�");
	}
	
	@Override
	public void ride(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� "+name+"�� Ÿ��");
	}
	@Override
	public void attack(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� "+name+"�� �ο���");
	}
}




public class StarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCV scv = new SCV("�̽���");
		Building bb;
		Riding rr;
		Fight ff;
		
		bb = scv;
		bb.build("�츮��");
		bb.repair("����");
		
		rr = scv;
		rr.ride("GSX750");
		rr.repair("�츮����");
		
		ff = scv;
		ff.attack("����");
	}

}
