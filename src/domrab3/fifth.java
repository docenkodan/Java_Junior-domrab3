package domrab3;

public class fifth {
	public void answer (double x)
	{
		int accuracy = 10;
		accuracy = accuracy*2-1;
		double a = 1;
		double x1 = 1;
		double ans = 0;
		
		for (int i=1;i<=accuracy;i = i+2)
		{
			for (int j = 1; j<=i; j++)
			{
				x1 *= x;
			}
			a=i;
			if (i % 4 == 1)
			{
				ans += x1/a;
			}
			else
			{
				ans -= x1/a;
			}
			a = 1; x1 = 1;
		}
		System.out.println(ans);
	}
	
	public void answer2 (double x)
	{
		System.out.println(Math.atan(x));
	}
}
