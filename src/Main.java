import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author rdz89
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
 * In an array, A, of size N, each memory location has some unique index, i (where 0 <= N), 
 * that can be referenced as A[i] (you may also see it written as Ai).

 * Given an array, A, of N integers, print each element in reverse order as a single line of space-separated 
 * integers.
 */
public class Main {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int length = a.length;
        int[] result = new int[length];
        int j = length-1;

        for(int i = 0; i < length; i++ ){
            result[i] = a[j];
            j--;
        }//for
        return result;
    }//static method

    private static Scanner scanner = null;
    
    public static void main(String[] args){
    	
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);
        
        //Print result        
        for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
			
			if (i != res.length - 1) {
				System.out.print(" ");
            }
		}


    }//main method
    
    static {
    	
    	 File inputFile = new File("../test/input");
    	 try {
			scanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    	
    }//static block
}