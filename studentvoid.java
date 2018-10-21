package thi;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

import JAVA.student;

public class studentvoid {
	String name;
	double diemToan;
	double diemLy;
	double diemHoa;
	Vector list=new Vector();
	public studentvoid() {
		
		while (true) {
			System.out.println("-*-*-*-*-*-");
			System.out.println("Nhap Thong Tin Sinh Vien");
			System.out.println("1 . Nhap Thong Tin");
			System.out.println("2 . Xem Thong Tin");
			Scanner key=new Scanner(System.in);
			System.out.println("Moi Ban Chon Chuc Nang : ");
			int n;
			n=key.nextInt();
			switch(n) {
			case 1 : NhapTT();
			break;
			case 2 : XemTT();
			break;
			
			}
			
		}
	}
		public void NhapTT()  {
			Scanner key = new Scanner(System.in);
			int sl;
			System.out.println("Nhap So Luong Hoc Sinh \n");
			sl=Integer.parseInt(key.nextLine());
				for(int i=1;i<=sl;i++)
				{
					System.out.println("Nhap Thong Tin Sinh Vien Thu "+i+"\n******************");
			System.out.println("Ho Va Ten :");
			this.name=key.nextLine();
			System.out.println("Diem Mon Toan :");
			this.diemToan=Double.parseDouble(key.nextLine());
			System.out.println("Diem Mon Ly :");
			this.diemLy=Double.parseDouble(key.nextLine());
			System.out.println("Diem Mon Hoa :");
			this.diemHoa=Double.parseDouble(key.nextLine());
			
			Student obj1=new Student(name ,diemToan , diemHoa ,diemLy );
			list.add(obj1);
			
			
			
			
				}
		
		}
		public void XemTT() {
			Enumeration EStudent=list.elements();
			int i=1;
			while(EStudent.hasMoreElements()) {
				Student obj2=(Student)EStudent.nextElement();
				System.out.println("Ten Hoc Sinh : " + obj2.getName()+"\nDiem Toan : "+obj2.getDiemToan()+"\nDiem Hoa : "+obj2.getDiemHoa()+"\nDiem Ly : "+obj2.getDiemLy());
			} 

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new studentvoid();
		
	}

}

