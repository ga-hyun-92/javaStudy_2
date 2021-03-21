package class19;

import java.util.HashSet;
import java.util.Set;

class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}
	
	public SutdaCard(int num,boolean iskwang) {
		this.num=num;
		this.isKwang=iskwang;
	}

//	shif+alt+s
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	
	@Override
	public String toString() {
		 
		return num+(isKwang?"K":"");
	}

	@Override
	public int hashCode() {
		 
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard c=(SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		} else {

		} return false;
	}
}

public class Exercise_HashCode {

	public static void main(String[] args) {
		Set<SutdaCard> sutdacard=new HashSet<SutdaCard>();
		
		SutdaCard c1=new SutdaCard(3,true);
		SutdaCard c2=new SutdaCard(3,true);
		SutdaCard c3=new SutdaCard(1,true);
		
		sutdacard.add(c1);
		sutdacard.add(c2);
		sutdacard.add(c3);
		
		System.out.println(sutdacard);

		
	}

}
