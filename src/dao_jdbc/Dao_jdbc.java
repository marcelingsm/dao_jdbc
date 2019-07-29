/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_jdbc;

import model.entities.Department;

/**
 *
 * @author USER
 */
public class Dao_jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Department obj = new Department(1,"D1");
        System.out.println(obj.toString());
    }
    
}
