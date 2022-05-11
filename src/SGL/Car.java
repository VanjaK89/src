package SGL;

public class Car implements Moveable{
    private String type;
    private String Color;
    private double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        Color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", Color='" + Color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void move(String destination) {
        System.out.println("Auto " + Color + type + " wird nach " + destination + " ausgegeben" );
    }
}
