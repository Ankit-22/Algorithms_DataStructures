import java.util.*;

class ArrayExample {
	public static void main (String[] args) {
		System.out.println("Enter number of elements: ");
	    Scanner in = new Scanner(System.in);
	    int[] priceOfPen = new int[in.nextInt()];
	    for(int i=0;i<priceOfPen.length;i++)
	        priceOfPen[i]=in.nextInt();

	    for(int i=0;i<priceOfPen.length;i++)
		    System.out.print(priceOfPen[i]+" ");
	}
}
