public class EmpWageBuilder
{
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
        public static final int WAGE_RATE = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_HRS = 100;
        public static void main(String args[]) {
                System.out.println("Welcome to Employee Wage Computation Program");
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS && totalWorkingDays < WORKING_DAYS ) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("On Day : " + totalWorkingDays + " Worked EmpHrs are : " + empHrs );
		}
		int totalEmpWage = totalEmpHrs * WAGE_RATE;
		System.out.println("Total Employee Wage is : " + totalEmpWage);
        }
}
