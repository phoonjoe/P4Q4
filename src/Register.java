/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MissingOne
 */
public class Register {
    private static int count = 1001;
    
    private int regNo;
    private Person person;
    private Car car;

    public Register(Person person, Car car) {
        this.person = person;
        this.car = car;
        this.regNo=count;
        count++;
        
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return String.format("%-10d%s%s", regNo,person.toString(),car.toString());
    }
    
    
    
}
