package main;

import java.util.ArrayList;

public class Subject {
	String subjectName; //과목이름
	int subjectId; //과목고유번호
	int gradeType;//학점평가
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	//생성자
	public Subject(String subjectName, int subjectId, int gradeType) {
		super();
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;
	}
	
	//수강신청메소드
	public void register(Student student) {
		studentList.add(student);
	}
	
	
	
	
}
