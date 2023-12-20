package main;

public class MajorEvaluation implements GradeEvaluation {
	//필수과목 학점
	@Override
	public String calculation(int score) {
		String grade;
		if(score >= 90) {
			grade = "A";
		}else if(score >=80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if(score >60) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
}
