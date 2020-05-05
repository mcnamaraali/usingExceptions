
public class UsingExceptions {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch (Exception e) {
			System.err.printf("%s%n%n", e.getMessage());
			e.printStackTrace();
			
			StackTraceElement[] traceElements = e.getStackTrace();
			
			System.out.printf("%n Stack trace from getStackTrace:%n");
			System.out.println("Class\t\tfile\t\t\tLine\tMethod");
			
			for (StackTraceElement ele: traceElements) {
				System.out.printf("%s\t",ele.getClassName());
				System.out.printf("%s\t",ele.getFileName());
				System.out.printf("%s\t",ele.getLineNumber());
				System.out.printf("%s%n",ele.getMethodName());
			}
			
		}

	}

	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
	}
	
}
