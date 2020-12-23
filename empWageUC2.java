public class empWageUC2
{
	public static void main(String[] args)
	{
		int fullTime=1;
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		int empHrs=0;
		int empRatePerHr=20;
		int salary=0;
		if(empCheck==fullTime)
		{
			empHrs=8;
		}
		else
		{
			salary=0;
		}
		salary=empHrs*empRatePerHr;
		System.out.println("Employee Wage: "+salary);
	}
}
