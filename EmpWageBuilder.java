public class EmpWageBuilder
{
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
        public static final int WAGE_RATE = 20;
        public static void main(String args[]) {
                System.out.println("Welcome to Employee Wage Computation Program");
		int empHrs = 0;
		int empWage = 0;
	        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        	if (empCheck == IS_PRESENT)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
              	else
                	empHrs = 0;
		empWage = empHrs * WAGE_RATE;
		System.out.println("Employee Wage is : " + empWage);

        }
}
