package test;

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

    }
}
