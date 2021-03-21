package class19;
//List-ArrayList����ؼ� �̸� ���� ��������,������������ ����ϱ�
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	public Student(String name,int ban,int no,int kor,int eng,int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3.0f)*10+0.5)/10.0f;
	}
	
	public String toString(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}

	@Override
	public int compareTo(Student o) {
		
//		return o.name.compareTo(name);//��������
		return name.compareTo(o.name);//��������
	}
}

public class Examination {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ȫ�浿",1,1,80,90,100));
		list.add(new Student("���ù�", 1, 2,80, 90, 100));
		list.add(new Student("������", 1, 3,80, 90, 100));
		list.add(new Student("������", 1, 4,80, 90, 100));
		list.add(new Student("����", 1, 4,80, 90, 100));

		Collections.sort(list);
		
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
