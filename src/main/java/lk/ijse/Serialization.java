package lk.ijse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.id = "200157101820";
        employee.name = "Ayoma";
        employee.address = "Makola";
        employee.age = "23";

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in employee.ser");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}