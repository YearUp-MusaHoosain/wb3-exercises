package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        bufReader.readLine();
        String input;

        FileWriter fw = new FileWriter("payroll-oct-2024.csv");
        BufferedWriter bw = new BufferedWriter(fw);
//        or you can do
//        BufferedWriter bw = new BufferedWriter(new FileWriter("payroll-sept-2023.csv"));

        bw.write("id|name|gross pay\n");

        while((input = bufReader.readLine()) != null){
            String[] tokens = input.split(Pattern.quote("|"));
            int employeeId = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double hoursWorked = Double.parseDouble(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);

            Employee theEmp = new Employee(employeeId, name, hoursWorked, payRate);
            displayEmployee(theEmp);

            String outputData = theEmp.getEmployeeId() + "|" + theEmp.getName() + "|" + theEmp.getGrossPay() + "\n";
            bw.write(outputData);
        }
        bufReader.close();
        bw.close();

    }


    private static void displayEmployee(Employee e){
        System.out.printf("%d:%s Pay this period: %.2f\n", e.getEmployeeId(), e.getName(), e.getGrossPay());
    }
}
