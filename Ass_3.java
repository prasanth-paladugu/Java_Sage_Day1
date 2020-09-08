//Swapping static variable into non-static variable without using another variable.
class Ass_3
{
	int x = 4;			//Non-static variable
	static int y = 9;	//Static variable
	public static void main(String args[])
	{
		Ass_3 pp = new Ass_3();
		System.out.println("BEFORE SWAPPING");
		System.out.println("x = "+ pp.x);
		System.out.println("y = "+ y);
		pp.x = pp.x + y;
		y = pp.x - y;
		pp.x = pp.x - y;
		System.out.println("AFTER SWAPPING");
		System.out.println("x = "+ pp.x);
		System.out.println("y = "+ y);
	}
}