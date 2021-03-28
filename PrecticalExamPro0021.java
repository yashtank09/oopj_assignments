import java.util.Scanner;
interface Exam{
    boolean Pass(int marks);
}
interface Classify{
    String Division(int average);
}
class Result implements Classify, Exam{

    
    public boolean Pass(int marks) {
        // TODO Auto-generated method stub
        return marks>=50;
    }

    public String Division(int average) {
        // TODO Auto-generated method stub
        String student = "";
        
        if(average>=60){
            student = "First";
        } else if(average>=50){
            student = "Second";
        } else {
            student = "No Division";
        }
        return student;
    }
    
}
public class PrecticalExamPro0021{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        // System.out.println("Enter your marks: ");
        // int marks = scanf.nextInt();

        Result res = new Result();
        System.out.println(res.Pass(50));
        System.out.println(res.Division(50));
    }
}
