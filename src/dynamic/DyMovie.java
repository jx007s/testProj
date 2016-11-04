package dynamic;

class MovieReser
{
	String title;
	
	
	
	public MovieReser(String title) {
		super();
		this.title = title;
	}

	void reservation(int cnt)
	{
		
	}
}
class Adult extends MovieReser
{
	int age;

	public Adult(String title, int age) {
		super(title);
		this.age = age;
	}
	
	@Override
	void reservation(int cnt) {
		// TODO Auto-generated method stub
		System.out.println("성인영화:"+title+"("+age+")"+cnt +"예매완료");
	}
}

class Solid extends MovieReser
{
	String kind;
	int height;
	public Solid(String title, String kind, int height) {
		super(title);
		this.kind = kind;
		this.height = height;
	}
	
	@Override
	void reservation(int cnt) {
		// TODO Auto-generated method stub
		System.out.println("입체영화:"+"("+kind+")"+title+cnt +"예매완료");
	}
}

public class DyMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MovieReser [] arr = {
				 
				 new Adult("예수는 성인", 20),
				 new Solid("이밤에 끝을 잡고", "4D", 150)
		 };
		 
		 arr[0].reservation(3);
		 arr[1].reservation(2);
	}

}


///////////
//////핸드폰을 조립해서 판매하세요
/// 기기종류 : 핸드폰 ---> 전화, 사진찍기, 인터넷 
///  기기타입 : 안드로이드폰, 아이폰, ms폰
////  안드로이드 - 구글 크롬, 구글 플레이, 폭탄, 카메라
///   아이폰  - 쉬리, 안들림, 카메라
///   ms폰 - 익스플로러, 느린부팅, 엑셀, 포토샵, 카메라







