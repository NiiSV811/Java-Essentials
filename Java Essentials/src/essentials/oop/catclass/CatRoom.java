package essentials.oop.catclass;

public class CatRoom {
    public static void main(String[] args) {
        Cat kitty1 = new Cat("Lua", 2.5,"tiger", true);

        kitty1.eat();
        kitty1.sleep();
        kitty1.setCatWeight(3.6); // Oh no, kitty1 increase its weight 'cause eats too much

        // Create your own Cats
        //....
    }
}
