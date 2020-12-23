public class EmpWagePartTime
{
	public static void main(String[] args)
	{
		int fullTime=1;
		int partTime=2;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		int empHrs=0;
		int empRatePerHr=20;
		int salary=0;

		if(empCheck==fullTime)
		{
			empHrs=8;
		}
		else if(empCheck==partTime)
		{
			empHrs=4;
		}
		else
		{
			empHrs=0;
		}
		salary=empHrs*empRatePerHr;
		System.out.println("Employee Wage: "+salary);
	}
}
