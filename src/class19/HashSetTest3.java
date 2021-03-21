package class19;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Passenger1 implements Comparable<Passenger1>{
	private String name;
	private String tel;
	private String seat;
	
	public Passenger1(String name,String tel,String seat) {
		this.name=name;
		this.tel=tel;
		this.seat=seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public int hashCode() {
		int hashCode=name.hashCode()+tel.hashCode()+seat.hashCode();
		return hashCode;
	}
	
	@Override
	public int compareTo(Passenger1 o) {
		 
		return name.compareTo(o.name);
	}
	
//	���� ������Ÿ��:Integer
/**		 public boolean equals(Object obj) {
	        if (obj instanceof Integer) {
	            return value == ((Integer)obj).intValue();
	        }
	        return false;
	    }
*/
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Passenger1) {
			boolean nameSame=name.equals(((Passenger1) obj).getName());
			boolean telSame=tel.equals(((Passenger1) obj).getTel());
			boolean seatSame=seat.equals(((Passenger1) obj).getSeat());
			return nameSame&&telSame&&seatSame;
		} else {
			return false;
		} 
		
	}
	
}

public class HashSetTest3 {

	public static void main(String[] args) {
		Set<Passenger1> passengerList=new LinkedHashSet<Passenger1>();//LinkedHashSet����ϸ�, �Է��� ������ ��µ�.
		//TreeSet(���Ŀ� ����)����ϸ�, comparable�� ����.
		
//		Passenger1 passenger1=new Passenger1("ȫ�浿", "010-0000-0000", "���ڳ��");
//		Passenger1 passenger2=new Passenger1("ȫ�浿", "010-0000-0000", "���ڳ��");
		
//		boolean euqal =passenger1.equals(passenger2);
//		System.out.println("euqal="+euqal);
		
//		passengerList.add(passenger1);
//		passengerList.add(passenger2);
//		System.out.println(passengerList);//�̷��� �Ǹ� hashcode ���� ��µȴ�.
//		System.out.println("\n");
		
//		passengerList.remove(passenger1);//hashCode���� �����Ѵ�.
//		System.out.println(passengerList);
		
		Passenger1 passenger1=new Passenger1("ȫ�浿", "010-0000-0000", "���ڳ��");
		Passenger1 passenger2=new Passenger1("ȫ�浿", "010-0000-0000", "���ڳ��");
		Passenger1 passenger3=new Passenger1("����", "010-0000-0002", "����Ͻ�");
		Passenger1 passenger4=new Passenger1("��ȣ", "010-0000-0003", "�۽�Ʈ");
		Passenger1 passenger5=new Passenger1("����", "010-0000-0004", "���ڳ��");

		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
		
		System.out.println(passengerList);
		System.out.println(passenger1.hashCode());
		System.out.println(passenger2.hashCode());
		
		Iterator<Passenger1> iterator=passengerList.iterator();
		while (iterator.hasNext()) {
			Passenger1 passenger  = (Passenger1) iterator.next();
			
			System.out.println("�̸�:"+passenger.getName());
			System.out.println("����ó:"+passenger.getTel());
			System.out.println("�¼����:"+passenger.getSeat());
			System.out.println("======================");
		}
		
	}

}
