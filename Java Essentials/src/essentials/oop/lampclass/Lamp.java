package essentials.oop.lampclass;

public class Lamp {
    //Attributes
    private String color;
    private String room;
    private boolean isTurnOn;

    //Methods
    public Lamp( String color, String room){
        this.color = color;
        this.room = room;
        this.isTurnOn = false;
    }

    //Setting Method
    public void setRoom(String room){
        this.room = room;
    }


    //Methods to Know about these attributes
    public String getRoom(){
        return this.room;
    }

    public boolean getIsTurOn(){
        return this.isTurnOn;
    }


    //Methods to turn On and Turn Off the lamp
    public void turnOn(){
        this.isTurnOn = true;
    }

    public void turnOff(){
        this.isTurnOn = false;
    }








}
