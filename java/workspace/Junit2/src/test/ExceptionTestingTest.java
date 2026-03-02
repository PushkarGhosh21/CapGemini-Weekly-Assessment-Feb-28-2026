package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class ExceptionTestingTest {

	@Test
	void testPrintArray() {
		try {
			int arr[] = null;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException encountered");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException encountered");
		}
		
	}
	
	@Test
	void testBeyondArray() {
		try {
			int arr[] = {1, 2, 3, 4, 5};
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException encountered");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException encountered");
		}
		
	}

}
