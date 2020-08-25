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
public class Context {
    public Vehicle getInstance(String str){
        if(str.equals("car")){
            return new Car();
        }
        return new Plane();
    }
}
