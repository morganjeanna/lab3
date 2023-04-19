import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = {1, 3, 4, 5, 6, 7, };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {0, 0, 2};
    assertArrayEquals(new int[]{2, 0, 0}, ArrayExamples.reversed(input1));
  }
  
}
