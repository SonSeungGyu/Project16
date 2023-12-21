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
	
	//듣는 수업의 점수를 저장해줄 리스트에 각 점수들을 넣어주는 메소드
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	
	
	
}
