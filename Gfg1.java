import java.util.ArrayList;

// Java program to find
// Sum of GCD over all subarrays.
class Gfg1
{

// Utility function to calculate
// sum of gcd of all sub-arrays.
static int findGCDSum(int n, int a[])
{
	int GCDSum = 0;
	int tempGCD = 0;
	for (int i = 0; i < n; i++)
	{
		// Fixing the starting index of a subarray
		for (int j = i; j < n; j++)
		{
            ArrayList<Integer> list = new ArrayList<>();
             tempGCD = 0;
			// Fixing the ending index of a subarray
			for (int k = i; k <= j; k++)
			{
				// Finding the GCD of this subarray
                list.add(a[k]);
				tempGCD = __gcd(tempGCD, a[k]);
			}
            System.out.print(tempGCD+" ");
			
			// Adding this GCD in our sum
		
            System.out.println(list);
		}
	}
	return GCDSum;
}

static int __gcd(int a, int b)
{
	return b == 0 ? a : __gcd(b, a % b);	
}

// Driver Code
public static void main(String[] args)
{
	int n = 4;
	int a[] = { 18,6,24,1 };
	int totalSum = findGCDSum(n, a);
	System.out.print(totalSum + "\n");
}
}

// This code is contributed by 29AjayKumar
