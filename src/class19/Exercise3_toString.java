package class19;

class Card{
	String kind;
	int number;
	
	public Card() {
		this("space",1);
	}
	
	public Card(String kind,int number) {
		this.kind=kind;
		this.number=number;
	}
	
	@Override
	public String toString() {
		// Card 인스턴스의 kind와 number값을 문자열로 반환한다.이렇게 안하면, 주소값이 반환된다.
		return "kind="+kind+", number="+number;
	}
	
}

public class Exercise3_toString {

	public static void main(String[] args) {
		Card card1=new Card();
		Card card2=new Card();
		
//		16진수 hex값 a=10, b=11, c=12,d=13,e=14,f=15
		System.out.println(card1.toString());
		System.out.println(card2.toString());

	}

}
