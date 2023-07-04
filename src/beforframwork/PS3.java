package beforframwork;

public class PS3 {

    int a;
	
	public PS3(int a)        //no need to invoke separatly as it already invoked by ps2
	{	
		this.a=a;
	}

	public int multiplytwo()
	{
		a=a*2;
		return a;
	}
	
	public int multiplythree()
	{
		a=a*3;
		return a;
	}
}
