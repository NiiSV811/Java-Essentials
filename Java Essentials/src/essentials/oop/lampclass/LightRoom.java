package essentials.oop.lampclass;

public class LightRoom {
    public static void main(String[] args) {
        Lamp cheapLamp = new Lamp("white", "bedroom");

        cheapLamp.turnOn();
        System.out.println(cheapLamp.getIsTurOn());
    }
}
