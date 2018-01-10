
/**
 * Methods that do things with 2D Arrays
 * 
 * @author (Daniel Jordan) 
 * @version (4/13/16)
 */
public class MatrixSrv
{
    public int sum(int[][] nums)
    {
        int sum = 0;
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                sum += nums[row][col];
            }
        }
        return sum;
    }
    public int min(int[][] nums)
    {
        int min = nums[0][0];
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                if(nums[row][col] < min)
                {
                    min = nums[row][col];
                }
            }
        }
        return min;
    }
    public int max(int[][] nums)
    {
        int max = nums[0][0];
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                if(nums[row][col] > max)
                {
                    max = nums[row][col];
                }
            }
        }
        return max;
    }
    public int range(int[][] nums)
    {
        int max = nums[0][0], min = nums[0][0];
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                if(nums[row][col] < min)
                {
                    min = nums[row][col];
                }
                if(nums[row][col] > max)
                {
                    max = nums[row][col];
                }
            }
        }
        return max - min;
    }
    public int[] sumRows(int[][] nums)
    {
        int[] sumRows = new int[nums.length];
        for(int row = 0; row < nums.length; row++)
        {
            int sum = 0;
            for(int col = 0; col < nums[row].length; col++)
            {
                sum += nums[row][col];
            }
            sumRows[row] = sum;
        }
        return sumRows;
    }
    public boolean isFound(int[][] nums, int num)
    {
        boolean found = false;
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                if(nums[row][col] == num)
                {
                    found = true;
                }
            }
        }
        return found;
    }
    public void print(int[][] nums)
    {
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                System.out.print(nums[row][col] + "\t");
                System.out.println();
            }
        }
    }
}
