
public class BagTest {

	public static void main(String[] args) {
		Bag b = new Bag(5, 3);
		
		Bag.BallColour cb = b.extractBall();
		if (cb == Bag.BallColour.Black) {
			System.out.println("black");
		} else {
			System.out.println("white");
		}
	}

}
