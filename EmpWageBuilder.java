public class EmpWageBuilder
{
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
        public static final int WAGE_RATE = 20;
        public static void main(String args[]) {
                System.out.println("Welcome to Employee Wage Computation Program");
		int empHrs = 0, empWage = 0;
	        int empCheck = (int)Math.floor(Math.random() * 10 ) % 3;
        	switch (empCheck ) {
			case IS_PRESENT:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
              		default:
                		empHrs = 0;
		}
		empWage = empHrs * WAGE_RATE;
		System.out.println("Employee Wage is : " + empWage);

        }
}
