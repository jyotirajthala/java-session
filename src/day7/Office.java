package day7;

import java.util.Calendar;
//import java.util.Date;

public class Office {
    //    var i = 3; // Not be able to use var outside the function

    public static void main(String[] args) {


//        var i = 3;

        Employee taman = new Employee("Taman", 30, 5000, Calendar.getInstance());
        System.out.println(taman.getName());
        System.out.println(taman.getAge());
        System.out.println(taman.getSalary());
        System.out.println(taman.getHireDate());

        Employee jyoti = new Employee("Jyoti", 28, 6000, Calendar.getInstance(), "275680");
        System.out.println(jyoti.getName());
        System.out.println(jyoti.getAge());
        System.out.println(jyoti.getSalary());
        System.out.println(jyoti.getHireDate());

        Employee abc = new Employee("ABC", 25, 8000, Calendar.getInstance(), "125454");
        System.out.println(abc.getName());
        System.out.println(abc.getAge());
        System.out.println(abc.getSalary());
        System.out.println(abc.getHireDate());

        Employee xyz = new Employee("XYZ", 20, 9000, Calendar.getInstance());
        System.out.println(xyz.getName());
        System.out.println(xyz.getAge());
        System.out.println(xyz.getSalary());
        System.out.println(xyz.getHireDate());


    }
}
