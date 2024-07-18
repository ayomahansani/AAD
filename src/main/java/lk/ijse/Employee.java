package lk.ijse;

import java.io.Serializable;

public class Employee implements Serializable {

    public String id;
    public String name;
    public String address;
    public String age;

    public void mailCheck(){

        System.out.println("Mailing a check to " + name + " " + address);
    }
}
