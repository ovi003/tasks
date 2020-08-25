/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor.pattern;

/**
 *
 * @author Ovi-PC
 */
public class Main {
    public static void main(String[] args){
        
        Context context = new Context();
        Vehicle car = context.getInstance("car");
        System.out.println(car.set_num_of_wheels());
        System.out.println(car.set_num_of_passengers());
        System.out.println(car.has_gas());
        
        Vehicle plane = context.getInstance("");
        System.out.println(plane.set_num_of_wheels());
        System.out.println(plane.set_num_of_passengers());
        System.out.println(plane.has_gas());

    }
}
