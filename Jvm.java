package Q1;

import java.util.Map;

public class Jvm {
	public static void main(String[] args) {
		System.out.println("Java Virtual Machine implementation name : " + System.getProperty("java.vm.name"));
		System.out.print("Operating System: ");
		System.out.println(System.getProperty("os.name"));
		String javaLibPath = System.getProperty("java.library.path");
		System.out.println("Java lib path "+javaLibPath);
	}
}
