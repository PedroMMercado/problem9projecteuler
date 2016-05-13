
public class Main {

	public static void main(String[] args) {

		// Special Pythagorean triplet Problem 9
		// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		// Find the product abc.
		// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
		int a = 1, b = a + 1, c = 0;
		
		while(true){
			++a;
			++b;
			c = 1000 - a - b;
			if(a * a + b * b == c * c && a < b && b < c)
				break;
		}
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of c is " + c);
		System.out.println((a + b + c));
		System.out.println("a^2 + b^2 is " + (a * a) + (b * b));
		System.out.println("c^2 is " + (c * c));

	}

}
