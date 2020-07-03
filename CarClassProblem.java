
public class CarClassProblem {

	public static void main(String[] args) {
		Car car = new Car();
		car.accelerate();
		car.brake();
		car.park();
	}

}
class Car{
	int chassisWidth;
	String color;
	String brand;
	public void brake() {
		System.out.println("BRAKE");
	}
	public void accelerate() {
			System.out.println("Speed Away");
	}
	public void park() {
		System.out.println("PARK");
	}
}
