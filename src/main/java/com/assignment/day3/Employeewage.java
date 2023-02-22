 package com.assignment.day3;

public class Employeewage {
    public static final int FullTime = 1;
    public static final int PartTime = 2;

    private String company;
    private int hrWages;
    private int workingDays;
    private int workingHours;
    static double EmpWages;

    public Employeewage(String company, int hrWages, int workingDays, int workingHours) {
        this.company = company;
        this.hrWages = hrWages;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }


    private double CompanyEmpWage() {
        int TotalWorkingHours = 0;
        int TotalWorkingDays = 0;

        double TotalWages = 0;
        while (TotalWorkingHours <= workingHours && TotalWorkingDays <= workingDays) {
            TotalWorkingDays++;
            int empID = (int) Math.floor(Math.random() * 10) % 3;
            switch (empID) {
                case FullTime: {
                    TotalWorkingHours = +8;
                    break;
                }
                case PartTime: {
                    TotalWorkingHours = +4;
                    break;
                }
                default: {
                    TotalWorkingHours = +0;

                }
            }
            EmpWages = TotalWorkingHours * hrWages * workingDays;
            TotalWages += EmpWages;
        }
        return TotalWages;

    }


    public static void main(String[] args) {

        System.out.println(" Employee Wage Computation \n" );

        Employeewage Amazon = new Employeewage("Amazon", 20, 20, 100);
        Employeewage Cognizant = new Employeewage("Cognizant", 10, 20, 100);
        Employeewage TCS = new Employeewage("TCS", 15, 20, 100);

        System.out.println("Total Monthly wages of " + Amazon.company + " is : Rs " + Amazon.CompanyEmpWage());
        System.out.println("Total Monthly wages of " + Cognizant.company + " is : Rs " + Cognizant.CompanyEmpWage());
        System.out.println("Total Monthly wages of " +TCS.company + " is : Rs " + TCS.CompanyEmpWage());
    }


}
