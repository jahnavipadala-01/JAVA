import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        System.out.println("User Input");
        Scanner sc = new Scanner(System.in);
        int subj1, subj2, subj3, subj4, subj5;
        int total;
        double percentage;
        System.out.println("Entet Subject 1 marks: ");
        subj1 = sc.nextInt();
        System.out.println("Entet Subject 2 marks: ");
        subj2 = sc.nextInt();
        System.out.println("Entet Subject 3 marks: ");
        subj3 = sc.nextInt();
        System.out.println("Entet Subject 4 marks: ");
        subj4 = sc.nextInt();
        System.out.println("Entet Subject 5 marks: ");
        subj5 = sc.nextInt();
        total = subj1 + subj2 + subj3 + subj4 + subj5;
        percentage = (total/500.0*100);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        
    }
}
