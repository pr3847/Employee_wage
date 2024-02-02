import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage");

        EmployeeManage E=new EmployeeManage();
        E.addCompanyWage("hp",20,100,20);
        E.addCompanyWage("dmart",10,160,20);
        E.addCompanyWage("hcl",25,100,15);
        E.addCompanyWage("p",15,100,17);
        E.addCompanyWage("h",11,100,19);
        E.addCompanyWage("hip",30,100,18);
        E.compute();

    }
}