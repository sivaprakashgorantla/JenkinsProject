// Implementation of IntStream range 
// (int startInclusive, int endExclusive) 
import java.util.*; 
import java.util.stream.IntStream; 
public class Helloworld{
		// Driver code 
    public static void main(String[] args) 
    { 
        // Creating an IntStream 
        IntStream stream = IntStream.range(6, 100000); 
  
        // Displaying the elements in range 
        // including the lower bound but 
        // excluding the upper bound 
        stream.forEach(System.out::println); 
    } 
}