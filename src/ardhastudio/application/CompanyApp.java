package ardhastudio.application;

import ardhastudio.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company  = new Company();
        company.setName("ArdhaStudio");
        Company.Employee employee = company.new Employee();
        employee.setName("Yohan");

        System.out.println("===========================================");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        System.out.println("===========================================");
        Company company2 = new Company();
        company2.setName("Belum Ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Fathar");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
