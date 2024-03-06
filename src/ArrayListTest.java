import java.util.ArrayList;
import java.util.List;

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
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>(list);
		ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4));
		ArrayList<String> list4 = new ArrayList<>(List.of(args));

		
	}

}
