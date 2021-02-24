package com.empwagebuilder;

public class EmpWageBuilder
{
	final static int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private final int RATE_PER_HR;
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	public final String COMPANY_NAME;
	private  int totalEmpWage;

	public EmpWageBuilder(String company, int emp_hrs, int work_hrs, int hrs_month) {
		this.RATE_PER_HR = emp_hrs;
		this.NUM_OF_WORKING_DAYS = work_hrs;
		this.MAX_HRS_IN_MONTH = hrs_month;
		this.COMPANY_NAME = company;
	}

	public void calcEmpWage() {
		int  empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println(" For Day : " + totalWorkingDays + "EmpHr:" + empHrs);
		}
		totalEmpWage = totalEmpHrs * RATE_PER_HR;
	}
	
	@Override
	public String toString() {
		return " Total Employee Wage for "+ COMPANY_NAME + " is : " + totalEmpWage;
	}
   
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program");
    	EmpWageBuilder dMart = new EmpWageBuilder("DMart", 20, 2, 10);
    	EmpWageBuilder vision = new EmpWageBuilder("Vision", 500, 8, 10);
    	dMart.calcEmpWage();
    	System.out.println(dMart);
    	vision.calcEmpWage();
    	System.out.println(vision);
	}
}
