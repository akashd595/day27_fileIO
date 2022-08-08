package com.bridgelabz.file_io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOStream{ File_IO, Console_IO; }
    List<EmployeePayrollData> employeePayrollDataList;

    EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList){
        this.employeePayrollDataList = employeePayrollDataList;
    }

    public static void main(String[] args) {

        ArrayList<EmployeePayrollData> payrolList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(payrolList);
        employeePayrollService.writeData();
        employeePayrollService.readData();

    }
    public void writeData(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id");
        int id = scanner.nextInt();
        System.out.println("Enter Employee name");
        String name = scanner.next();
        System.out.println("Enter Employee Salary");
        double salary = scanner.nextDouble();

        employeePayrollDataList.add(new EmployeePayrollData(id, name, salary));
    }
    public void readData(){

        Iterator iterator = employeePayrollDataList.iterator();
        while ( iterator.hasNext() ){
            System.out.println(iterator.next() + " ");

        }
    }
}
