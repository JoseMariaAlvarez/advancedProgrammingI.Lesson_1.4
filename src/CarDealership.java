import java.util.ArrayList;
public class CarDealership {
	private ArrayList<Car> cars;
	public CarDealership() {
		cars = new ArrayList<>();
	}
	public void add(Car c) {
		int idx = seekCar(c.getModel());
		if (idx < 0) {
			cars.add(c);
		} else {
			cars.set(idx, c);
		}
	}

	public void remove(String model) {
		int idx = seekCar(model);
		if (idx < 0) {
			throw new RuntimeException("Car not found" + model);
		}
		cars.remove(idx);
	}

	private int seekCar(String model) {
		int i = 0;
		while ((i < cars.size()) && ! cars.get(i).
				getModel().equalsIgnoreCase(model) ) {
			++i;
		}
		return (i < cars.size()) ? i : -1;
	}
	public String toString() {
		return cars.toString();
	}
	public Car cheapestCar() {
		if (cars.isEmpty()) {
			throw new RuntimeException("Empty collection.");
		}
		Car r = cars.get(0);
		for (Car x : cars) {
			if (x.calcFinalPrice() < r.calcFinalPrice()) {
				r = x;
			}
		}
		return r;
	}	
}

class Car{

	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public int calcFinalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
