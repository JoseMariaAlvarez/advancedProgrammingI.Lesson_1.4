
public class ArraysTest {

	public static void main(String[] args) {

		// Declaration
		int [] listInteger;
		Point [] listPoints;

		// Initialization
		listInteger = new int[10];
		listPoints = new Point[23];
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		Point p = new Point(1, 1);
		Point[] ap = {new Point(2, 2), p, null};
		System.out.println(ap.length);

		for (int i = 0; i < listInteger.length; i++) {
			listInteger[i] = i;
		}
		for (int i = 0; i < listPoints.length; i++) {
			listPoints[i] = new Point(i, i);
		}
		String[] strs = {"CAD1", "CAD2", "CAD3"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i].toLowerCase());
		}

		int[][] matrix = new int[4][];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new int[i + 5];
			for (int j = 0; j < matrix[i].length; j++)
			{
				matrix[i][j] = i + j;
			}
		}

		String[][] families = {
				{"Flintstone","Fred","Wilma","Pebbles","Dino"},
				{"Rubble","Barney","Betty","Bamm-Bamm"},
				{"Simpson","Homer","Marge","Burt","Lisa","Maggie"}
		};
		for (int i = 0; i < families.length; i++) {
			System.out.print(families[i][0] + ": ");
			for (int j = 1; j < families[i].length; j++) {
				System.out.print(families[i][j] + " ");
			}
			System.out.println();
		}

		char[] source =
			{'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i]);
		}
		for (char c : source) {
			System.out.println(c);
		}
		
		int[] ar = {1,3,5,7,9};
		System.out.println("ar " + ar);
		System.out.println("java.util.Arrays.toString(ar) " + 
		                    java.util.Arrays.toString(ar));
	}

}
