/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_jdbc;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author USER
 */
public class Dao_jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //SellerDao sellerDao = DaoFactory.creatingSellerDao();
        DepartmentDao departmentDao = DaoFactory.creatingDepartmentDao();
        List<Department> list = null;

        /*System.out.println("TEST 1");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);
        
        System.out.println("TEST 2");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("TEST 3");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        
        System.out.println("TEST5");
        seller = sellerDao.findById(1);
        seller.setName("Diana Silva");
        sellerDao.update(seller);
        System.out.println("UPDATE OK!");
    
        System.out.println("TEST6");
        System.out.print("Delete ID:");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("DELETED");*/
        
        System.out.println("TEST 3");
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        
        /*System.out.println("TEST4");
        Department dep = new Department(null,"test");
        departmentDao.insert(dep);*/

        System.out.println("TEST5");
        Department department = departmentDao.findById(1);
        department.setName("Computers");
        departmentDao.update(department);
        System.out.println("UPDATE OK!");

        System.out.println("TEST6");
        System.out.print("Delete ID:");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("DELETED");

    }
}
