import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	}
	
	public void testSelectionSort() {
	}
	
		public void testPositive(){
			int[] arr = new int[5];
			arr[0] = 8;
			arr[1] = 9;
			arr[2] = 7;
			arr[3] = 10;
			arr[4] = 2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = 2;
			Sortedarr[1] = 7;
			Sortedarr[2] = 8;
			Sortedarr[3] = 9;
			Sortedarr[4] = 10;
			/** add tests to check for this unit test **/
			assertEquals(Sortedarr, arr, "Test failed");
		}
		public void testNegative(){
		/** Test data contains negative values only **/
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = -9;
			arr[2] = -7;
			arr[3] = -10;
			arr[4] = -2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = -10;
			Sortedarr[1] = -9;
			Sortedarr[2] = -8;
			Sortedarr[3] = -7;
			Sortedarr[4] = -2;
			assertEquals(Sortedarr, arr, "Test failed");
		}
		public void testMixed(){
		/** Test data contains with both positive, negative and zeros **/
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = 9;
			arr[2] = 7;
			arr[3] = -10;
			arr[4] = 2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = -10;
			Sortedarr[1] = -8;
			Sortedarr[2] = 2;
			Sortedarr[3] = 7;
			Sortedarr[4] = 9;
			assertEquals(Sortedarr, arr, "Test failed");
		}
		public void testDuplicates(){
		/** Test data contains duplicates **/
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = 9;
			arr[2] = 9;
			arr[3] = -10;
			arr[4] = -10;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = -10;
			Sortedarr[1] = -10;
			Sortedarr[2] = -8;
			Sortedarr[3] = 9;
			Sortedarr[4] = 9;
			assertEquals(Sortedarr, arr, "Test failed");
		}
		}


