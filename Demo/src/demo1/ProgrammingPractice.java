package demo1;

public class ProgrammingPractice {


		   public static void main(String[] args) {

/*			   // fibnocci series 
		        int count = 7, num1 = 0, num2 = 1;
		        System.out.print("Fibonacci Series of "+count+" numbers:");

		        for (int i = 1; i <= count; ++i)
		        {
		            System.out.print(num1+" ");
		            int sumOfPrevTwo = num1 + num2;
		            num1 = num2;
		            num2 = sumOfPrevTwo;
		        }
		        
		        
		        int f1=0,f2=1,n=0;
		        
		        for(int i=0;i<=7;i++)
		        {
		        	f1=f2;
		        	f2=n;
		        	n=f1+f2;
		        	System.out.println(n);
		        			
		        }*/
		        
		        //pallindrome
		        
		        int num=121;
		        int rev = 0,mod;
		        int temp=num;
		        for(int i=0;i<=num;i++)
		        {
		        	mod=num%10;
		        	rev=rev*10+mod;
		        	num=num/10;
		        	if(temp==rev)
		        	{
		        		System.out.println("is a pallindrome");
		        	}
		        }
		        
	        	
		        
		    }
		   
		   
		   
		   
		}