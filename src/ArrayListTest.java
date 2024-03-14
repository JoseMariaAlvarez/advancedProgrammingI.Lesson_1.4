import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		System.out.println("args: " + args.toString());
		System.out.println("args: " + Arrays.toString(args));

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Point> points = new ArrayList<>();
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			numbers.add(value);
			points.add(new Point(value, value));
		}
		
		numbers.add(3, 34);
		
		numbers.remove(4);
		numbers.clear();
		
		points.remove(3);
		points.remove(new Point(1.0, 1.0));
		
		System.out.println(numbers);
		System.out.println(points);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Point> list2 = new ArrayList<>(points);
		System.out.println(list2);
		ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4));
		ArrayList<String> list4 = new ArrayList<>(List.of(args));

		boolean b = list4.isEmpty();
		int isz = list.size();
		
		
		
	}

}
