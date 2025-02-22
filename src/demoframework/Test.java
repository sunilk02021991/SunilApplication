package demoframework;

public class Test {

	public static void main(String[] args)
	{
		// reverse the string
		
		String str = "sunil";
		
		char [] ch = str.toCharArray();
		
		for(int i= ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}

}
