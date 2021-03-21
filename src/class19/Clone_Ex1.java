package class19;

class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		 
		return "x="+x+", y="+y;
	}
	
	@Override
	protected Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return obj;
	}
	
}

class Circle implements Cloneable{
	Point p;
	double r;
	
	public Circle(Point p,double r) {
		this.p=p;
		this.r=r;
	}
	
	@Override
	protected Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			Circle c=(Circle)obj;
			c.p=new Point(this.p.x,this.p.y);
			//두 줄을 넣지 않으면, 객체가 각각 생기지 않고 하나의 주소값으로 저장됨.
		}
		
		return obj;
	}
	
	@Override
	public String toString() {
		 
		return p.toString()+", r="+r;
	}
}

public class Clone_Ex1 {

	public static void main(String[] args) {
		Point original=new Point(3, 5);
		Point copy=(Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
		
		Circle c1=new Circle(new Point(10, 20), 3.0);
		Circle c2=(Circle)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
	}

}
