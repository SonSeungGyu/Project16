package main;

import java.util.ArrayList;

//학생클래스
public class Student {
	int stuId; //학번
	String name; //이름
	ArrayList<Score> scoreList = new ArrayList<>();
	
	
	//생성자
	public Student(int stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	
	
	
}
