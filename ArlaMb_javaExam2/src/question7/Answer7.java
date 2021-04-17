/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class Answer7 {
        public static void main(String[] args) {
        FighterJet fighterJet = new FighterJet("F-16",Type.FIGHTER_JET,300);
        PassengerPlane passengerPlane = new PassengerPlane("Boeing-777",Type.PASSENGER_AIRPLANE,265,
                "Food,Bed,Hotel");
        PersonalPlane personalPlane = new PersonalPlane("Jumbo jet",Type.PRIVATE_PLANE,16,
                "5 star hotel",265,3);
        System.out.println(fighterJet);
        System.out.println(passengerPlane);
        System.out.println(personalPlane);
    }
}
enum Type {
    FIGHTER_JET,
    PASSENGER_AIRPLANE,
    PRIVATE_PLANE
}
class Airplane{
    private String name;
    private Type type;

    public Airplane(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
class FighterJet extends Airplane{
    private double speed;

    public FighterJet(String name, Type type, double speed) {
        super(name, type);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "FighterJet{" +
                "speed=" + speed +
                '}';
    }
}
class PassengerPlane extends Airplane{
    private int capacity;
    private String facilities;

    public PassengerPlane(String name, Type type, int capacity, String facilities) {
        super(name, type);
        this.capacity = capacity;
        this.facilities = facilities;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "capacity=" + capacity +
                ", facilities='" + facilities + '\'' +
                '}';
    }
}
class PersonalPlane extends Airplane{
    private int capacity;
    private String facalities;
    private double speed;
    private int engine;

    public PersonalPlane(String name, Type type, int capacity, String facalities, double speed, int engine) {
        super(name, type);
        this.capacity = capacity;
        this.facalities = facalities;
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "PersonalPlane{" +
                "capacity=" + capacity +
                ", facalities='" + facalities + '\'' +
                ", speed=" + speed +
                ", engine=" + engine +
                '}';
    }

}
