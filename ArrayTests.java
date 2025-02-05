import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceFail() {
    // Failure Inducing Input
    int[] input1 = {0, 1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1, 0}, input1);
	}

  @Test 
	public void testReverseInPlacePass() {
    //Non-Failure Inducing Input
    int[] input2 = {0, 1, 2, 1, 0};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{0, 1, 2, 1, 0}, input2);
  }








  /*
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {0, 1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1, 0}, ArrayExamples.reversed(input2));
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {10.0, 10.0, 10.0, 2.3, 10.0, 10.0};
    double av = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(10.0, av, 0.0);
  }
*/

}
