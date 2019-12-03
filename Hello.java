import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

        String name;
        String age;
        String location;

        System.out.print("Hello. What is your name? ");
        Scanner scnr = new Scanner(System.in);
        name = scnr.next();

        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        age = scnr.next();

        System.out.println("I see that you are still quite young at only " + age + ".");

        System.out.print( "Where do you live? ");
        location = scnr.next();

        System.out.print("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye!");


    }

}
//Just here for fun :D


