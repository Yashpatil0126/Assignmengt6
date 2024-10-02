package assignment6;

public class TestCar {
	public static void main(String[] args) {

		Engine engine = new Engine("V8", 450, "Ford");

		Car car = new Car("Ford Mustang", engine);

		car.displayEngineDetails();

		car.startCar();
		car.stopCar();
	}
}
