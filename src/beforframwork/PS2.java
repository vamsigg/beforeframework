 package beforframwork;

public class PS2 extends PS3 {

	int a;               //doudt???
	
	
	public PS2(int a)                  
	{
		super(a);                     //parent class constructor is invoked in ps3
		this.a=a;
	}

	public int increment(int a)
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-2;
		return a;
	}
}




