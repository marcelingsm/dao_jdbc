/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_jdbc;

import java.util.List;
import model.dao.DaoFactory;
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
      
        SellerDao sellerDao = DaoFactory.creatingSellerDao();
        
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);
        
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        
    }
    
}
