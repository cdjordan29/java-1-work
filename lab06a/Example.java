
public class Example
{
	public static void main (String[] args)
	{
	int j = 0, k = 0, m = 0;
int count = 0;
for (j = 0; j < 3; j++) 
  for (k = 0; k < 3; k++)
    for (m = 0; m < 3; m++)
       count++; 
System.out.println(count);
System.out.println(j + ":" + k + ":" + m);
	}
}
