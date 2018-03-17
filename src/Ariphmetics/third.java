package Ariphmetics;

public class third {
	public void answer (double x)
	{
		int accuracy = 9;		//точность
		accuracy = accuracy*2-2;
		double a = 1; 			//каждый из элементов выражения
		double ans = 1;			//ответ
		
		for (int i = 2; i<=accuracy;i=i+2)
		{
			for (int j = 1; j<=i; j++)
			{
				a = a*x/j;
			}
			if (i % 4 != 0)
			{
				ans -= a;
			}
			else
			{
				ans += a;
			}
			a = 1;
		}
		System.out.println(ans);
	}
	
	public void answer2 (double x)
	{
		System.out.println(Math.cos(x));
	}
}
