package demo1;

public class AnimalDemo
{
	 int i1;

	public void animalSound()
	{
		System.out.println("Animal makes sound");
	}

	public int printFactorial(int i)
	{
		this.i1=i;
		int i1 = 1, fac = 1;
		
		while(i1<i)
		{
			fac=fac*i1;
			i1++;
		}
		return fac;
		
	}
}
