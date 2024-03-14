
public class StringExamples {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("Billy"));
		} catch  (NumberFormatException e){
			System.out.println("You fool." + e.getMessage());
		}
		
		String myStr = "hello";
		myStr = "bye";
		String greeting = new String("hello and bye");

		String userName = "Susan";
		String goodMorningGreeting = "Good morning, " + userName;
		goodMorningGreeting += ".";
		System.out.println(goodMorningGreeting);
		// Good morning, Susan.

		int counter = 1;
		String firstUserName = "Susan", secondName = "Jack";
		firstUserName += counter;
		counter++;
		String secondUserName = "Jack" + counter;
		Point pnt = new Point (3.0d, 5.0d);
		System.out.println(firstUserName);
		System.out.println(secondUserName);
		System.out.println("Point at " + pnt);
		// Susan1
		// Jack2
		// Point at Point@555590

		String c1 = "Billy"; // c1 refers to an object with content "billy"
		String c2 = "wig"; // c2 refers to an object with content "wig"
		String c3 = "Bil"; // c3 refers an an object with content "bil"
		c3 += "ly"; // c3 refers an an object with content "billy"
		boolean b1 = c1.equals(c2); // false (c1 y c2 refer to objects with
		// different content)
		boolean b2 = c1.equals(c3); // true (c1 y c3 refer to objects with the
		// same content)
		boolean b3 = c1 == c3; // false (c1 y c3 refer to different objects)
		int r1 = c1.compareTo(c2); // < 0 ("Billy" is less than "wig")

		System.out.println("c1.length() " + c1.length());
		System.out.println("c1.charAt(1) " + c1.charAt(1));
		System.out.println("c1.charAt(1) " +  c1.indexOf('l'));
		System.out.println("c1.lastIndexOf('l') " + c1.lastIndexOf('l'));
		System.out.println("c1.indexOf(\"ll\" )" + c1.indexOf("ll"));
		System.out.println("c1.lastIndexOf(\"ll\") " + c1.lastIndexOf("ll"));
		
		System.out.println("c1.substring(1,2) " + c1.substring(1,2));
		System.out.println("c1.substring(0) " + c1.substring(0));
		System.out.println("c1.toUpperCase() " + c1.toUpperCase());
		System.out.println("c1.toUpperCase() " + c1.toLowerCase());
		System.out.println("c1.replace(\"ll\", \"mm\") " + 
		                    c1.replace("ll", "mm"));
		System.out.println("c1.concat(\" idol\") " + 
		                    c1.concat(" idol")); // or +
		System.out.println("String.format(\"%d %s\", 1, c1) " +
		                    String.format("%04d %s", 1, c1));
		
	}

}

class Point{
	private double x, y;

	public Point (double x, double y) {this.x = x; this.y = y;}

		public String toString() {
			return "(" + x + ", " + y + ")";
		}
}
