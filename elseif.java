import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }
        System.out.println("Thanks for using my java code");
        /*if(age>56){
            System.out.println("You are experienced!");
        }else if(age>46){
            System.out.println("You are semi-experienced!");
        }else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }else{
            System.out.println("You are not experienced");
        }*/
    }
}

