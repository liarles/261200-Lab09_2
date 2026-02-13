package oop.ocp;

public class Sparrow implements Flyable { //นกกระจอกบินได้ มันเลยเดินได้ด้วย
    @Override
    public void fly() {
        System.out.println("Sparrow is gone");


    }

    @Override
    public void move() {
        System.out.println("Sparrow is walk");

    }
}
