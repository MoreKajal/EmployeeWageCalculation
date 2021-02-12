public class EmpWageBuilder
{
	public static final int IS_PRESENT = 1, IS_PART_TIME = 2;

	public static void calEmpWageForCompany(String companyName,int empRate,
                                          int empWorkingDays, int maxHrs) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrs && totalWorkingDays < empWorkingDays ) {
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
         System.out.println("For Day # : " + totalWorkingDays + " Worked EmpHrs are : " + empHrs );
      }
      int totalEmpWage = totalEmpHrs * empRate;
      System.out.println("Total Employee Wage for Company " + companyName + " is :"+ totalEmpWage);
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program");
      	calEmpWageForCompany("DMART", 20, 2, 100);
      	calEmpWageForCompany("VISION", 400, 8, 16);
	}
}

