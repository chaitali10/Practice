package Arrays;

public class Primes {

	public boolean isPrime(int n)
	{
		if(n < 0)
			return false;
		
		if(n % 2 == 0)
			return false;
		
		int sqrt = (int) Math.sqrt(n);
		for(int i=3; i<=sqrt; i++)
		{
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	// Find prime numbers upto n
	// Seive of Eratosthenes
	public void findPrimes(int n)
	{
		if(n < 0 || n == 1)
			return;
		
		byte[] primes = new byte[n];		
		int sqrt = (int) Math.sqrt(n);
		
		for(int i=2; i<=sqrt; i++)
		{
			if(primes[i] == 0)
			{
				for(int j=i*2; j<n; j = j+i)
				{
					primes[j] = 1;
				}
			}
		}
		
		for(int i=2; i < n; i++)
		{
			if(primes[i] == 0)
			{
				System.out.println(i);
			}
		}
	}
}
