public class CircleRunner {
	public static void main(String[] args) {
		Circle test = new Circle(5.0);
		System.out.println(test.getInfo());
		test.setRadius(9.2);
		System.out.println(test.getInfo());
	}
}
