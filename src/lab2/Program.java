package lab2;

public class Program {
    static void main(String[] args) {

        int mark = 60;

        }

    String getGrade(int mark){
        if (mark < 50) {
            System.out.println("Fail");
        } else if (mark >= 50 && mark <= 60) {
            System.out.println("Pass");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("Merit");
        } else if (mark >= 71 && mark <= 100) {
            System.out.println("Distinction");
        } else {
            System.out.println("An error has occured");
        }

    }
}