
public class AdviceStudentExpertSystem {

	public static void main(String[] args) {
		
		String var1 = "ON_VM ADVISER";
		String var2 = "PUT_ON_VM";
		String result = null;
		
		if (var1 == "ADVICE_STUDENT") {
			result = var2+"STUDENT_REGISTER-COURSES";
		}
		if (var1 == "GIVE_PRE_REQUESTS") {
			result = var2+"COMPLETE-PRE-GIVE_PRE_REQUESTSCOURSES";
		}
		if (var1 == "COMPLETE_HOURS") {
			result = var2+"STUDENT_COMPLETE-HOURS";
		}
		if (var1 == "DO_PROJECTS") {
			result = var2+"STUDENT_WORK_ON_PROJECTS";
		}
		if (var1 ==  "GET_GOOD_GRADE") {
			result = var2+"STUDENT_STUDY_HARD_GOOD_GRAD";
		}
		if (var1 ==  "GET_GOOD_ATTENDACE") {
			result = var2+"STUDENT_ATTEND_CLASS";
		}
		if (var1 == "F_GRADE") {			
			result = var2+"STUDENT_FIAL"+"NO_SCHOLARSHIP";
		}else if((var1 == " > F_GRADE")&&(var1 == "=< A_GRADE")){
			result = var2+"STUDENT_PASS"+"SCHOLARSHIP";
		}
		if (var1 == "COMPLETE_GRADUATION") {			
			result = var2+"RECEIVES_DEGREE";
		}else if((var1 == "INCOMPLETE_GRADUATION")){
			result = var2+"STUDENT_MUST_COMPLETE_GRADUATE";
		}
		System.out.println("Result is..."+result);
	}
}
