package main;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//학생 객체
		Student stu1 = new Student(181213,"안성원");
		Student stu2 = new Student(181518,"오태훈");
		Student stu3 = new Student(171230,"이동호");
		Student stu4 = new Student(171255,"조성욱");
		Student stu5 = new Student(171590,"최태평");
		
		//과목별 객체
		Subject subject1 = new Subject("국어",1000,1);
		Subject subject2 = new Subject("수학",2000,1);
		Subject subject3 = new Subject("댄스",3000,2);
		
		//국어
		Score koreanScore1 = new Score(stu1.stuId,subject1,95);
		Score koreanScore2 = new Score(stu2.stuId,subject1,95);
		Score koreanScore3 = new Score(stu3.stuId,subject1,100);
		Score koreanScore4 = new Score(stu4.stuId,subject1,89);
		Score koreanScore5 = new Score(stu5.stuId,subject1,85);
		
		ArrayList<Score> koreanScoreList = new ArrayList<>();
		koreanScoreList.add(koreanScore1);
		koreanScoreList.add(koreanScore2);
		koreanScoreList.add(koreanScore3);
		koreanScoreList.add(koreanScore4);
		koreanScoreList.add(koreanScore5);
		
		//영어
		
		Score mathScore1 = new Score(stu1.stuId,subject2,56);
		Score mathScore2 = new Score(stu2.stuId,subject2,95);
		Score mathScore3 = new Score(stu3.stuId,subject2,88);
		Score mathScore4 = new Score(stu4.stuId,subject2,95);
		Score mathScore5 = new Score(stu5.stuId,subject2,56);
		
		ArrayList<Score> mathScoreList = new ArrayList<>();
		mathScoreList.add(mathScore1);
		mathScoreList.add(mathScore2);
		mathScoreList.add(mathScore3);
		mathScoreList.add(mathScore4);
		mathScoreList.add(mathScore5);
		
		//댄스
		Score danceScore1 = new Score(stu1.stuId,subject3,95);
		Score danceScore2 = new Score(stu2.stuId,subject3,85);
		Score danceScore3 = new Score(stu3.stuId,subject3,55);
		
		ArrayList<Score> danceScoreList = new ArrayList<>();
		danceScoreList.add(danceScore1);
		danceScoreList.add(danceScore2);
		danceScoreList.add(danceScore3);
		
		
		
		//안성원씨의 객체에 각 과목들의 점수를 리스트에 넣어줌
		stu1.addSubjectScore(koreanScore1);
		stu1.addSubjectScore(mathScore1);
		stu1.addSubjectScore(danceScore1);
		
		//오태훈씨의 객체에 각 과목들의 점수를 리스트에 넣어줌
		stu2.addSubjectScore(koreanScore2);
		stu2.addSubjectScore(mathScore2);
		stu2.addSubjectScore(danceScore2);
		
		//이동호씨의 객체에 각 과목들의 점수를 리스트에 넣어줌
		stu3.addSubjectScore(koreanScore3);
		stu3.addSubjectScore(mathScore3);
		stu3.addSubjectScore(danceScore3);
		
		//조성욱씨의 객체에 각 과목들의 점수를 리스트에 넣어줌
		stu4.addSubjectScore(koreanScore4);
		stu4.addSubjectScore(mathScore4);
		
		//최태평씨의 객체에 각 과목들의 점수를 리스트에 넣어줌
		stu5.addSubjectScore(koreanScore5);
		stu5.addSubjectScore(mathScore5);
		
		//과목별로 수강하는 학생들의 리스트
		//국어과목을 듣는 수강생들 추가
		subject1.register(stu1);
		subject1.register(stu2);
		subject1.register(stu3);
		subject1.register(stu4);
		subject1.register(stu5);
		
		//수학과목을 듣는 수강생들 추가
		subject2.register(stu1);
		subject2.register(stu2);
		subject2.register(stu3);
		subject2.register(stu4);
		subject2.register(stu5);
		
		//댄스과목을 듣는 수강생들 추가
		subject3.register(stu1);
		subject3.register(stu2);
		subject3.register(stu3);
		
		//GradeEvaluation 인터페이스를 상속받는 MajorEvaluation 객체 생성 
		MajorEvaluation majorEvaluation = new MajorEvaluation();
		
		//GradeEvaluation 인터페이스를 상속받는 PassFailEvaluation 객체 생성 
		PassFailEvaluation passFailEvaluation = new PassFailEvaluation();
		
		//리포트 양식을 담아줄 StringBuilder 객체 선언
		StringBuilder sb = new StringBuilder();
/////////////////////////////////////////////////////////////////////////////////////////////////////
		sb.append(subject1.subjectName);
		//헤더
		sb.append("\t수강생\t학점\n");
		sb.append("이름  |  학번   |  점수\n");
		sb.append("---------------------\n");
		
		//바디
		for(int i = 0; i<subject1.studentList.size();i++) {
			sb.append(subject1.studentList.get(i).name + " | " + subject1.studentList.get(i).stuId
					+ " | " + koreanScoreList.get(i).subjectScore + ":");
			
			//필수과목인지 일반과목인지 구분하여 성적 반영
			if(subject1.gradeType == 1) {
				sb.append(majorEvaluation.calculation(koreanScoreList.get(i).subjectScore) + "\n");
			}else {
				sb.append(passFailEvaluation.calculation(koreanScoreList.get(i).subjectScore) + "\n");
			}
			
			sb.append("---------------------\n");
				
			}
		sb.append("\n");
		
/////////////////////////////////////////////////////////////////////////////////////////////////		
		sb.append(subject2.subjectName);
		//헤더
		sb.append("\t수강생\t학점\n");
		sb.append("이름  |  학번   |  점수\n");
		sb.append("---------------------\n");
		
		//바디
		for(int i = 0; i<subject2.studentList.size();i++) {
			sb.append(subject2.studentList.get(i).name + " | " + subject2.studentList.get(i).stuId
					+ " | " + mathScoreList.get(i).subjectScore + ":");
			
			//필수과목인지 일반과목인지 구분하여 성적 반영
			if(subject2.gradeType == 1) {
				sb.append(majorEvaluation.calculation(mathScoreList.get(i).subjectScore) + "\n");
			}else {
				sb.append(passFailEvaluation.calculation(mathScoreList.get(i).subjectScore) + "\n");
			}
			
			sb.append("---------------------\n");
				
			}
		sb.append("\n");
		
/////////////////////////////////////////////////////////////////////////////////////////////		
		sb.append(subject3.subjectName);
		//헤더
		sb.append("\t수강생\t학점\n");
		sb.append("이름  |  학번   |  점수\n");
		sb.append("---------------------\n");
		
		//바디
		for(int i = 0; i<subject3.studentList.size();i++) {
			sb.append(subject3.studentList.get(i).name + " | " + subject3.studentList.get(i).stuId
					+ " | " + danceScoreList.get(i).subjectScore + ":");
			
			//필수과목인지 일반과목인지 구분하여 성적 반영
			if(subject3.gradeType == 1) {
				sb.append(majorEvaluation.calculation(danceScoreList.get(i).subjectScore) + "\n");
			}else {
				sb.append(passFailEvaluation.calculation(danceScoreList.get(i).subjectScore) + "\n");
			}
			
			
			sb.append("---------------------\n");
				
			}
		
		
		
		
		
//		if(subject1.gradeType == 1) {
//			sb.append(majorEvaluation.calculation(i)+"\n");
//		}else if(subject1.gradeType == 2){
//			sb.append(passFailEvaluation.calculation(i)+"\n");
//		}
		//sb.append(stu1.name + " | " + stu1.stuId + " | " + koreanScore1.subjectScore + ":" + majorEvaluation.calculation(koreanScore1.subjectScore)+"\n");
		System.out.println(sb);
		
		
		
	}
}
