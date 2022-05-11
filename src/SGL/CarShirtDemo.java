package SGL;

public class CarShirtDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Golf", "blue", 3.5);
        LogisticManager hansi = new LogisticManager();

        hansi.add(new Shirt(" Tom Tailor ", " L ", " white "));
        hansi.add(new Car(" Mercedes ", " blue", 3000.0));

        hansi.moveAll("Schladming");


    }
}
