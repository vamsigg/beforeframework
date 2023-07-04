package beforframwork;

import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test                                    //before and after this method
	public void testtrun()
	{
		dothis();                            //parent class
		PS2 ps2=new PS2(4);                  //parametrised constuctor                          	
		System.out.println(ps2.increment(9));
		System.out.println(ps2.decrement());
		//PS3 ps3=new PS3(3);
		System.out.println(ps2.multiplytwo());
		System.out.println(ps2.multiplythree());
	}	
}
