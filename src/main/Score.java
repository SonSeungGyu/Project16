package main;

public class Score {
	int stuId; //학번
	Subject subject; //과목
	int subjectScore;//점수
	
	//생성자
	public Score(int stuId, Subject subject, int subjectScore) {
		super();
		this.stuId = stuId;
		this.subject = subject;
		this.subjectScore = subjectScore;
	}

//	@Override
//	public String toString() {
//		return "학번:" + stuId + ", " + subject.subjectName + ":" + subjectScore;
//	}
	
	
	
}
