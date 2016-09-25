package test;
import java.util.Scanner;

/**
 * Created by nikit on 23.09.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);

        Dog ourdog = new Dog();
        ourdog.root();
        ourdog.tailgame();
        String wow = ourdog.paw("Master!");
        System.out.println(wow);

        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i < nums.length; i++){
            nums[i]=in.nextInt();
        }

        for(int i=0;i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
