package demo1;

public class CowDemo extends AnimalDemo
{
	int i1;
	public void animalSound()
	{
		System.out.println("cow says =woooo");
	}
	
	public int printFactorial(int i)
	{
		int i1 = 1, fac = 1;
		
		while(i1<i)
		{
			fac=fac*i1;
			i1++;
		}
		return fac;
	}

}
