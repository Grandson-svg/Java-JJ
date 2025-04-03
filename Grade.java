import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grade{
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);

        List <Integer>marks = new ArrayList<>();
        List <String>subjects = new ArrayList<>();

        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        int numberOfSubjects = sc.nextInt();
        sc.nextLine();

        System.out.println(" ENTER THE SEMESTER");
        String semester = sc.nextLine();

        for(int i=0; i<numberOfSubjects;i++){
            System.out.println("ENTER THE SUBJECT"+(i+1) + ":");
            String subject = sc.nextLine();
            subjects.add(subject);

            System.out.println("ENTER MARKS FOR"+subject+ ":");
            int mark = sc.nextInt();
            marks.add(mark);
            sc.nextLine();

        }

        System.out.println("semester: " +semester);
        System.out.println("Your marks:");
        for(int i=0; i<subjects.size();i++){
            System.out.println(subjects.get(i)+": "+marks.get(i));
        }
        sc.close();

    }
}