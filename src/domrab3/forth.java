package domrab3;

public class forth {
	public void answer (double x)
	{
		int accuracy = 10;
		double a = 1;
		double ans = 1;
		double x1 = 1;
		for (int i=1;i<accuracy;i++)
		{
			x1 *= x;
			a *= i;
			ans += x1/a;
		}
		System.out.println(ans);
	}
	
	public void answer2 (double x)
	{
		System.out.println(Math.exp(x));
	}
}
