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
public class Main {
    public static void main(String[] args){
        
        // Access Car properties
        Context carContext = new Context(new Car());
        System.out.println(carContext.get_wheels());
        System.out.println(carContext.get_passengers());
        System.out.println(carContext.has_gas());
        
        // Access Plane properties
        Context planeContext = new Context(new Plane());
        System.out.println(planeContext.get_wheels());
        System.out.println(planeContext.get_passengers());
        System.out.println(planeContext.has_gas());
       
    }
    
}
