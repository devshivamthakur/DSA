// Java program for queries of GCD excluding
// given range of elements.
import java.util.*;

class GFG {
	
// Calculating GCD using euclid algorithm
static int GCD(int a, int b)
{
	if (b == 0)
	return a;
	return GCD(b, a % b);
}

// Filling the prefix and suffix array
static void FillPrefixSuffix(int prefix[],
		int arr[], int suffix[], int n)
{
	// Filling the prefix array following relation
	// prefix(i) = GCD(prefix(i-1), arr(i))
	prefix[0] = arr[0];
	for (int i = 1; i < n; i++)
	prefix[i] = GCD(prefix[i - 1], arr[i]);

	// Filling the suffix array following the
	// relation suffix(i) = GCD(suffix(i+1), arr(i))
	suffix[n - 1] = arr[n - 1];

	for (int i = n - 2; i >= 0; i--)
	suffix[i] = GCD(suffix[i + 1], arr[i]);
}

// To calculate gcd of the numbers outside range
static int GCDoutsideRange(int l, int r,
	int prefix[], int suffix[], int n) {
		
	// If l=0, we need to tell GCD of numbers
	// from r+1 to n
	if (l == 0)
	return suffix[r + 1];

	// If r=n-1 we need to return the gcd of
	// numbers from 1 to l
	if (r == n - 1)
	return prefix[l - 1];
	return GCD(prefix[l - 1], suffix[r + 1]);
}

// Driver code
public static void main(String[] args) {
	int arr[] = {18, 6, 24, 1};
	int n = arr.length;
	int prefix[] = new int[n];
	int suffix[] = new int[n];
	FillPrefixSuffix(prefix, arr, suffix, n);

	int l = 0, r = 0;
	System.out.println(GCDoutsideRange
			(l, r, prefix, suffix, n));

	l = 1;
	r = 1;
	System.out.println(GCDoutsideRange
			(l, r, prefix, suffix, n));

	l = 1;
	r = 2;
	System.out.println(GCDoutsideRange
			(l, r, prefix, suffix, n));
}
}

// This code is contributed by Anant Agarwal.
