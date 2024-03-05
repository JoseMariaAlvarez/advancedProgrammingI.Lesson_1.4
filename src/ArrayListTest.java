import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Point> points = new ArrayList<>();
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			numbers.add(value);
			points.add(new Point(value, value));
		}
		System.out.println(numbers);
		System.out.println(points);
	}

}
