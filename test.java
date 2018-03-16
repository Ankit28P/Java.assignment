package Java8;

@FunctionalInterface
interface SampleInt {
	int Operation(int a, int b);
}

public class test {
	public static void main(String[] args) {
		SampleInt sampleInt = (a, b) -> {
			return a + b;
		};
		int c = sampleInt.Operation(10, 20);
		System.out.println(c);

	}
}
