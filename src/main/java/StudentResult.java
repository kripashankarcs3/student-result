public class StudentResult {

    public String checkResult(int marks) {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}