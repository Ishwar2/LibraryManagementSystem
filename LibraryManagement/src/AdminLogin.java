/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class AdminLogin implements Admin {

    @Override
    public boolean checkLogin(String name, String pass) {
       if(name.equals("admin") && pass.equals("admin@123")){
           return true;
       }
       return false;
    }
    
    public void adminConsole(){
            System.out.println("****** Admin Console ********");
            System.out.println("1. Add librarian");
            System.out.println("2. View librarian");
            System.out.println("3. Delete Librarian");
            System.out.println("4. Logout");
        
        
    }
    
}
