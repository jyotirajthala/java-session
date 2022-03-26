package day4;

public class Cat {
    //State
    String name;
    int age;
    String color;
    String breed;

    // behaviour
    public void sleep(){
        System.out.println("sleeping");
    }
    public void play(){
        System.out.println("playing");
    }
    public void feed(){
        System.out.println("eating");
    }

    public static void main(String[] args){
        Cat thor = new Cat();
        Cat ramey = new Cat();

        thor.name = "thor";
        thor.age = 2;
        thor.color = "black";
        thor.breed = "xyz";

        ramey.name = "ramey";
        ramey.age = 3;
        ramey.color = "gray";
        ramey.breed = "abc";

        thor.sleep();
        thor.play();
        thor.feed();

        ramey.sleep();
        ramey.play();
        ramey.feed();

        System.out.println(thor.name);
        System.out.println(thor.age);
    }

}
