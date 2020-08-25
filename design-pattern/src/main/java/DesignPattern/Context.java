/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

/**
 *
 * @author Ovi-PC
 */
public class Context {
    
    private Vehicle vehicle;
    
    public Context(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    
    public int get_wheels(){
        return vehicle.set_num_of_wheels();
    }
    
    public int get_passengers(){
        return vehicle.set_num_of_passengers();
    }
    
    public boolean has_gas(){
        return vehicle.has_gas();
    }
}
