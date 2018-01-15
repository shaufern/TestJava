
import static java.lang.System.out;

class Entry{
	public static boolean isPrime(int number)
	{
		if (number <= 1)
			return false; // zero and one are not prime
		
		for (int i=2; i*i<=number; i++) 
		{
			if (number % i == 0) 
				return false;
		}
		return true;
		
	}
	public static void displaySeries(int count)
	{
		int num=2;
		while(count>0)
		{
			if(isPrime(num))
			{
				out.println(num+" ");
				--count;
			}
			++num;
			
		}
		
	}
	public static void main(String args[]){
		int count=10000000;
		displaySeries(count);
	}
}

//D:\training\10012018-JAVA\code\src