
public class Main {

	public static void main(String[] args) {

		// Special Pythagorean triplet Problem 9
		// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		// Find the product abc.
		// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
		int a = 0, b = 0, c = 0;
		
//		while(true){
//			++a;
//			++b;
//			c = 1000 - a - b;
//			if(a * a + b * b == c * c && a < b && b < c)
//				break;
//		}
		for(a = 1; a < 1000;a++){
			for(b = a + 1; b < 1000;b++){
				c = 1000 - a - b;
				if((a * a) + (b * b) == (c * c) && (a + b + c) == 1000){
					System.out.println("The value of a is " + a);
					System.out.println("The value of b is " + b);
					System.out.println("The value of c is " + c);
				}
			}
		}

	}

}
