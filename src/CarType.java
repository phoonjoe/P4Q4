/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MissingOne
 */
public class CarType {
    private String name;
    private String model;
    private double capacity;


    
    public CarType(String name,String model,double capacity){
        this.name=name;
        this.model=model;
        this.capacity=capacity;
    }
    
    public String toString(){
        return String.format("%-10s%-10s%-5.1f", name,model,capacity);
    }


}
