package main;

public class PassFailEvaluation implements GradeEvaluation{

	@Override
	public String calculation(int score) {
		if(score >= 70) {
			return "p";
		}else {
			return "F";
		}
	}

}
