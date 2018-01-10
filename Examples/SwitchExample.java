/**
  *SwitchExample.java takes a BS question from D2L and writes out the answer 
  because I'm too dumb to trace it
  *
  * @author		<Daniel Jordan>
  * @version	<2/05/16>
  */
import java.util.Scanner;
public class SwitchExample
{
	public static void main (String[] args)
	{
		int[] a = {23, 45, 25, 13, 28, 15, 25, 18};
		foo(a);
		
		public void foo(int[] nums)
		{
			int i = 0;
			boolean x = false;
			while (!x && i < nums.length)
			{
				boolean z = false;
				for (int j = 0; j < nums.length - 1; ++j)
				{
					if (nums[j] < nums[j + 1])
					{
						int t = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = t;
						z = true;
					}
						x = ((z) ? false : true);
				}
				for (int num: nums)
                System.out.print(num);
            	System.out.println();
            	++i;
            }
        }


	}
	
	
}