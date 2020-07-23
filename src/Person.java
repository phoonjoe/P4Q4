/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MissingOne
 */
public class Person {
    private String name;
    private String icNum;
    
    public Person(String name,String icNum){
        this.name=name;
        this.icNum=icNum;
    }
    
    public String toString(){
        return String.format("%-15s%-15s", name,icNum);
    }
}
