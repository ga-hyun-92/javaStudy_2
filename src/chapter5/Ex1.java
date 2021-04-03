package chapter5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Direction[] direction =Direction.values();
		
		for (Direction dir : direction) {
			System.out.println(dir+"="+dir.getValue());
		}
		
		Direction d1=Direction.EAST;
		System.out.println(d1.name()+", "+d1.getValue());
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���(1-4): ");
		int value=scanf.nextInt();
		try {
			Direction d2=Direction.of(value);
			System.out.println(d2.name()+", "+d2.getValue());
		} catch (IllegalArgumentException e) {
			System.out.println("1-4������ �Է°����մϴ�.");
		}
		
		System.out.println(Direction.EAST.rotate(1));
		System.out.println(Direction.EAST.rotate(2));
		System.out.println(Direction.EAST.rotate(-1));
		System.out.println(Direction.EAST.rotate(-2));



		
		
				

	}

}
