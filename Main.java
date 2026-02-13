package oop.ocp;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.move();

        Eagle eagle = new Eagle();
        eagle.hunt(new Sparrow()); // นกกระจอกเป๋น flyable ซึ่ง flyable เป็น Moveable ด่้วย
        eagle.hunt(sparrow);

        Penguin penguin = new Penguin();
        penguin.move();
        // penguin.fly; error เพนกวินบินไม่ได้ มันไม่ได้ implement flyable มา
        Ostrich ostrich = new Ostrich();
        ostrich.move();
        // eagle.follow(ostrich); error นกกระจอกเทศเป็นแค่ Movable ไม่ใช่ Flyable อินทริเลยใช้ฟังก์ชันนี้ไม่ได้
        eagle.hunt(ostrich); // นกกระจอกเทศเป็น Movable เลย hunt ได้
        eagle.follow(sparrow); // นกกระจอกเป็น Flyable แล้วก็เรียกใช้ object เดิม address ก็จะของเตัวดิมกับ hunt(sparrow) ข้างบน
        eagle.follow(new Eagle()); //

    }
}