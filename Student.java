package thi;

import java.util.Scanner;

public class Student {
	String name;
	double diemToan;
	double diemLy;
	double diemHoa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public Student(String name,double diemLy,double diemHoa,double diemToan) {
		this.diemHoa=diemHoa;
		this.diemLy=diemLy;
		this.diemToan=diemToan;
		this.name=name;
		
	}
}
