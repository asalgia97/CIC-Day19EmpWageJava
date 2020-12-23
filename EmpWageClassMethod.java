public class EmpWageClassMethod
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	public static void computeEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)
	{
		int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=maxWorkingHrs && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;

                        switch(empCheck)
                        {
                                case FULL_TIME:
                                empHrs=8;
                                break;

                                case PART_TIME:
                                empHrs=4;
                                break;

                                default:
                                empHrs=0;
                        }
                        totalEmpHrs+=empHrs;
                }
                totalEmpWage=totalEmpHrs*empRatePerHr;
                System.out.println("Company: "+company+" Total Employee Wage: "+totalEmpWage);

	}

	public static void main(String[] args)
	{
		computeEmpWage("Dmart",12,34,56);
		computeEmpWage("Reliance",23,36,46);
		computeEmpWage("Deloitte",24,64,16);
		
	}
}
