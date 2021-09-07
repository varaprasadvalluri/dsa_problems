package arrays.problems;

@FunctionalInterface
public interface functionalInterfaceA {

	// abstract void set();

	// abstract void sss();

	static void add() {
		System.out.println("this is static method");
	}

	default void add(int a) {
		System.out.println("defult methods ");
	}

	default void add(long a) {
		System.out.println("defult methods ");
	}

	// void add(int a, int b);

	void add(int a, long b);

	static void add(long a, long b) {
		System.out.println("this is static method");
	};
}
