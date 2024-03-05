
enum Week {Mon, Tue, Wed, Thur, Fri, Sat, Sun};

public class EnumWeekExample {

	public static void main(String[] args) {
		Week s = Week.Mon;
		Week t = Week.valueOf("Wed"); // Week.Wed
		for(Week se: Week.values())
			System.out.print(se + " ");
	}

}