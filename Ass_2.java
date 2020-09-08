//Sum of static and non static variables with out using '+' operator
class Ass_2
{
	int a = 10;
	static int b = 15;
	public static void main(String args[])
	{
		Ass_2 pp = new Ass_2();
		System.out.println("Sum of static and non static variables : " + Integer.sum(pp.a,b));
	}
}