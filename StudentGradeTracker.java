import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter The student Grades:");
        while(true){
            int grade = scanner.nextInt();
            if(grade == -1) break;
            list.add(grade);
        }        
        if(list.size() == 0){
            System.out.println("No Grades Entered");
            return ;

        }
        int total = 0, highest = list.get(0), lowest = list.get(0);
        for (int grade :list){
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }
        double average = (double) total /list.size();

        System.out.println("Average grade: " + average);  
        System.out.println("Highest grade: " + highest); 
        System.out.println("Lowest grade: " + lowest);  
        
        scanner.close(); 
    }

}
