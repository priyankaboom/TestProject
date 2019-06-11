package demo1;

public class PloyDemo 
{
	public static void main(String args[])
	{
		AnimalDemo s1=new AnimalDemo();
		s1.animalSound();
		int x = s1.printFactorial(3);
		System.out.println(x);
		
		CowDemo s2= new CowDemo();
		s2.animalSound();
		int y = s2.printFactorial(5);
		System.out.println(y);
		
		CatDemo s3= new CatDemo();
		s3.animalSound();
		int z = s3.printFactorial(10);
		System.out.println(z);
		
		
		
	}

}
