package domrab3;

public class first {
		
	public void answer (int n, double x)
	{
		int accuracy = 9;	//точность
		double ans = 1;		//ответ
		double a = 1;		//числитель
		double b = 1;		//знаменатель
		double x1 = 1;		//x в степени
		
		for (int i=1;i<=accuracy;i++)
		{
			for (int j = 1; j<=i; j++)
			{
				a *= (n-j+1);
				x1 = x1*x;
				b *= j;
			}				
			ans += a/b*x1;
			a = 1; b = 1; x1 = 1;
		}
		System.out.println(ans);
	}
	
	public void answer2 (int n, double x)
	{
		double ans = 1;
		for (int i=1;i<=n;i++)
		{
			ans = ans*(x+1);
		}
		System.out.println(ans);
	}
}
