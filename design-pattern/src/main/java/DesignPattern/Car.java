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
public class Car implements Vehicle{
    @Override
    public int set_num_of_wheels(){
        return 4;
    }
    @Override
    public int set_num_of_passengers(){
        return 3;
    }
    @Override
    public boolean has_gas(){
        return true;
    }
}
