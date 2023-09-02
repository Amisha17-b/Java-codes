class Alpha
{
	static String s = " ";
	protected Alpha()
	{
		s += "alpha ";
	}
}
class SubAlpha extends Alpha
{
	private SubAlpha()
	{
		s += "sub ";
	}
}

public class SubSubAlpha extends Alpha
{
	private SubSubAlpha()
	{
		s += "subsub ";
	}
	public static void main(String[] args)
	{
		new SubSubAlpha();
		System.out.println(s);
	}
}



//class Clidder
//{
//	private final void flipper()
//	{
//		System.out.println("Clidder");
//	}
//}
//
//public class Clidlet extends Clidder
//{
//	public final void flipper()
//	{
//		System.out.println("Clidlet");
//	}
//	public static void main(String[] args)
//	{
//		new Clidlet().flipper();
//	}
//}




//}