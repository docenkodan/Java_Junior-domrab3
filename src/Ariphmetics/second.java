package Ariphmetics;

public class second {
	public void answer (double x)
	{
		int accuracy = 9;		//точность
		accuracy = accuracy*2+1;
		double a = 1;			//каждый из элементов выражения
		double ans = 0;			//ответ
		
		for (int i=1;i<=accuracy;i= i+2)
		{
			for (int j = 1; j<=i; j++)
			{
				a = a*x/j;	
			}
			if (i % 4 == 1)
			{
				ans += a;
			}
			else
			{
				ans -= a;
			}
			a = 1;
		}
		System.out.println(ans);
	}
	
	public void answer2 (double x)
	{
		System.out.println(Math.sin(x));
	}
	
}
