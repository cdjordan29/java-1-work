public class SearchSrv
{
	public int timesFound(int[] array, int num)//determines how many times int is found in the array
	{
		int count = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == num)
			{
				count++; 	
			}
		}
		
		return count;
	}
	
	public boolean isFound(int[] array, int num)//determines if the int is in the array
	{
		boolean found = false;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == num)
				found = true;
		}

		return found; 
	}
	
	public int range(int[] array)// finds the range of the array
	{	
		int range = 0;
		
		if (array.length == 0)
		{
			range = 0;
		}
		else
		{
			int max = array[0];
			int min = array[0];
			
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] > max)
					max = array[i];
			
				else if (array[i] < min)
					min = array[i];
			}
			range = max - min;
		}
	
		return range;
	}
	
	public int[] reverse(int[] array)//returns the given array in reverse
	{
		int[] reverseArray = new int[array.length];
		
		for(int i = 0; i < reverseArray.length; i++)
		{
			reverseArray[i] = array[array.length - 1 - i];
		}
		return reverseArray;
	}
	

}