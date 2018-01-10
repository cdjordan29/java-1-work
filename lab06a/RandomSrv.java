import java.util.Random;
public class RandomSrv
{
	
	public void generateNumbers(int total)
	{
		Random generator = new Random();
		
		final int UPPER_BOUND = 10;
		int start = 0;
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		int count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
		
		
		while(start <= total)
		{
			int num = generator.nextInt(UPPER_BOUND);
			switch(num)
			{
				case 0:
					count0++;
					break;
				case 1:
					count1++;
					break;
				case 2:
					count2++;
					break;
				case 3:
					count3++;
					break;
				case 4:
					count4++;
					break;
				case 5:
					count5++;
					break;
				case 6:
					count6++;
					break;
				case 7:
					count7++;
					break;
				case 8:
					count8++;
					break;
				case 9:	
					count9++;
					break;
			}
			start++;
		}
		print(0, count0);
		print(1, count1);
		print(2, count2);
		print(3, count3);
		print(4, count4);
		print(5, count5);
		print(6, count6);
		print(7, count7);
		print(8, count8);
		this.print(9, count9);
	}
	
	public void print(int num, int count)
	{
		String sum = " ";
		
		while(count > 0)
		{
			sum += "*";
			
			count--;
		}
		System.out.println(num + sum);
	}
	
}