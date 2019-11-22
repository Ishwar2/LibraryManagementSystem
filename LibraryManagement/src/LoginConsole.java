/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 *
 * @author HP
 */
public class LoginConsole {

    public static void main(String[] args) {
        boolean checkStatus = false;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("****Menu****");
            System.out.println("1. Admin login");
            System.out.println("2. librarian login");
            System.out.println("3. exit");
            System.out.println("Enter the choice");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter password: ");
                    String pass = sc.next();
                    AdminLogin admin = new AdminLogin();
                    checkStatus = admin.checkLogin(name, pass);
                    if (checkStatus) {
                        admin.adminConsole();
                    }
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("librarian");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        } while (n != 3);
    }
}
