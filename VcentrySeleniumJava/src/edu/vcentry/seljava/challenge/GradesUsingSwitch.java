package edu.vcentry.seljava.challenge;

public class GradesUsingSwitch {

	public static void main(String[] args) {
		char myGrade = 'A';
		//int myMark = getMarks(myGrade);
		
		//System.out.println(String.format("My grade is %d, My mark is %d", myGrade, myMark));
		
		int empId = 4;
		String empName = "AAAA";
		String empDept = "Manufacturing";
		String sql = "select * from emp where empId =" + empId + " and empName = '" + empName + "' and empDept = '"+ empDept +"'";
		
		sql = String.format("select * from emp where empId =%d and empName ='%s' and empDept = '%s'", empId, empName, empDept);
		
		
		System.out.println(sql);
		
		//System.out.println("My grade is " + myGrade + " , My mark is " + myMark );

	}
	
	public static int getMarks(final char grade) {
		int marks = -1;
		switch (grade) {
		case 65:
			marks = 80;
			break;
		case 'B':
			marks = 70;
			break;
		case 'C':
			marks = 60;
			break;
		case 'D':
			marks = 50;
			break;
		default:
			marks = 40;
			break;
		}
		
		return marks;
	}

}
