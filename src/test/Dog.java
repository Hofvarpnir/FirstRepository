package test;

/**
 * Created by nikit on 25.09.2016.
 */
public class Dog {

    private int weight;   // вес собаки
    private String name;  // имя собаки
    private String color; //порода собаки

    // Собака ищет палку
    public void root(){
        System.out.print("Looking for a stick...\n");
    }

    // Собака гоняется за своим хвостом
    public void tailgame(){
        System.out.print("I gonna catch you! Wow!\n");
    }

    // Собака дает лапу с гавканием
    public String paw(String words){
        String phrase = words + "...WoW WoW!...\n";
        return phrase;
    }

}
