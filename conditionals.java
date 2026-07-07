import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = 6;
        // boolean cond = (age == 18);
        // if(cond){
        // if(age > 18){
        //     System.out.println("Yes you can drive!");
        // }else{
        //     System.out.println("No you cannot drive!");
        // }


        // int a;
        //System.out.println("enter a:");
        // a = sc.nextInt();
        // if(a % 2 == 0){
        //     System.out.println("The number is even");
        // }else{
        //     System.out.println("The number is Odd");
        // }

        // int a;
        // System.out.println("enter a: ");
        // a = sc.nextInt();
        // int b;
        // System.out.println("enter b:");
        // b = sc.nextInt();
        // if(a==b){
        //     System.out.println("Equal");
        // }else if(a > b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("a is lesser");
        // }

        // 3 diff greetings
        int button;
        System.out.println("enter button:");
        button = sc.nextInt();
        // if(button == 1) {
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Bonjour");
        // }else {
        //     System.out.println("Invalid button");
        // }
        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("invalid button");
        }
    }
}


