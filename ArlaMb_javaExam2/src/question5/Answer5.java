/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;
import java.util.GregorianCalendar;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class Answer5 {
    public static void main(String[] args) {
        Person person = new Person("Madhu", "street 12",
                "000-111-222", "134@gmail.com");

        Student student = new Student("babu", "Street 10", "111-222-3333",
                "babu@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("arla", "34 street", "555-888-6666",
                "arla@gmail.com", 510, 3000);

        Faculty faculty = new Faculty("bear", "28street", "333-333-2222",
                "bear@gmail.com", 111, 40000, "4pm to 6pm", "Professor");

        Staff staff = new Staff("cat", "90 road", "222-888-7777",
                "cat@gmail.com", 12, 65000, "Executive Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}

class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String name, String address,
                   String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

   public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}

class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;
    public Employee(String name, String address, String phone,
                    String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    public int getOffice() {
        return office;
    }
    public String getSalary() {
        return String.format("%.2f", salary);
    }
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay()
                + "/" + dateHired.getYear();
    }
    public String toString() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}

class Staff extends Employee {
    private String title;
    public Staff(String name, String address, String phone,
                 String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;
    public Faculty(String name, String address, String phone, String email,
                   int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
class MyDate {
    private int year;
    private int month;
    private int day;
    MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    
    
}
