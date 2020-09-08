//Take two variable one is static and another one is non-static perform all operations.
class Ass_1
{
	static int x = 4259;
	int y = 4036;
	public static void main(String args[])
	{
		Ass_1 p1 = new Ass_1();
		System.out.println("Addition : "+(x+p1.y));
		System.out.println("Subtraction : "+(x-p1.y));
		System.out.println("Multiplication : "+(x*p1.y));
		System.out.println("Division : "+(x/p1.y));
		System.out.println("Remainder : "+(x%p1.y));
		System.out.println("Post Increment x : "+ x++);
		System.out.println("Increment x : "+ ++x);
		System.out.println("Post Decrement y : "+ p1.y--);
		System.out.println("Decrement y : "+ --p1.y);
		System.out.println("Is Equal..? : "+(x==p1.y));
		System.out.println("Is Greater..? : "+(x>p1.y));
		System.out.println("Is Less..? : "+(x<p1.y));
		System.out.println("Is not Equal..? : "+(x!=p1.y));
		System.out.println("Shift right : "+ (x>>1));
		x+=x;
		System.out.println(x);
		x*=x;
		System.out.println(x);
		x/=x;
		System.out.println(x);
		x-=x;
		System.out.println(x);
	}
}