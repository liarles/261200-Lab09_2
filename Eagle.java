package oop.ocp;

public class Eagle implements Flyable{ //เหยี่ยวบินได้ มันเลยเดินได้ด้วย
    @Override
    public void fly() {
        System.out.println("Eagle is coming after you!");

    }

    @Override
    public void move() {

    }
    public void hunt(Moveable obj){
        System.out.println("Eagle hunt " + obj);
    }
    public void follow (Flyable obj){
        System.out.println("Eagle follow " + obj);
    }
}
