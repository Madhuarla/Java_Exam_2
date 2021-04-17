/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Madhu Babu Arla 
 */
public class Answer4 {
    public static void main(String[] args) {
        FighterJet fighterJet = new FighterJet("F-16","Fighter Jet",300);
        PassengerPlane passengerPlane = new PassengerPlane("Boeing-777","Passenger",265,
                "Food,Bed,Hotel");
        PersonalPlane personalPlane = new PersonalPlane("Jumbo jet","Personal plane",16,
                "5 star hotel",265,3);
        System.out.println(fighterJet);
        System.out.println(passengerPlane);
        System.out.println(personalPlane);
    }
}
class Airplane{
    private String name;
    private String type;

    public Airplane(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
class FighterJet extends Airplane{
    private double speed;

    public FighterJet(String name, String type, double speed) {
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
        return super.toString()+" "+"FighterJet{" +
                "speed=" + speed +
                '}';
    }
}
class PassengerPlane extends Airplane{
    private int capacity;
    private String facilities;

    public PassengerPlane(String name, String type, int capacity, String facilities) {
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
        return super.toString()+" "+"PassengerPlane{" +
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

    public PersonalPlane(String name, String type, int capacity, String facalities, double speed, int engine) {
        super(name, type);
        this.capacity = capacity;
        this.facalities = facalities;
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"PersonalPlane{" +
                "capacity=" + capacity +
                ", facalities='" + facalities + '\'' +
                ", speed=" + speed +
                ", engine=" + engine +
                '}';
    }
    
}
