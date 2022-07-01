package Assignment_2;

import java.util.Scanner;

public class Packaging {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edgeSmallBoxes;
		int lengthLargeBox;
		int widthLargeBox;
		int heightLargeBox;
		int cubesInLength;
		int cubesInWidth;
		int cubesInHeight;
		int numSmallCubes;
		
// Input from the user
		System.out.print("Please enter the length of the large box: ");
		lengthLargeBox = scanner.nextInt();
		
		System.out.print("Please enter the width of the large box: ");
		widthLargeBox = scanner.nextInt();
		
		System.out.print("Please enter the height of the large box: ");
		heightLargeBox = scanner.nextInt();
	
		System.out.print("Please enter the edge length of the small cubic boxes: ");
		edgeSmallBoxes = scanner.nextInt();
		
// Calculations
// 1. Small cubes boxes that fit in the length of the cuboid-shaped (large) box.
		cubesInLength = lengthLargeBox / edgeSmallBoxes;
		
// 2. Small cubes boxes that fit in the width of the cuboid-shaped (large) box.
		cubesInWidth = widthLargeBox / edgeSmallBoxes;
		
// 3. Small cubes boxes that fit in the height of the cuboid-shaped (large) box.
		cubesInHeight = heightLargeBox / edgeSmallBoxes;
		
// 4. Small cubes boxes that fit in the large box - It will be the volume or multiplication of small cubes adjusted in the length by small cubes adjusted in the width by small cubes adjusted in the height
		numSmallCubes = cubesInLength * cubesInWidth * cubesInHeight;
		
// Output Program
		System.out.println();
		System.out.println();
		System.out.print(numSmallCubes + " small cubic boxes fit in a large box that is " + lengthLargeBox + " long, " + widthLargeBox + " wide, and " + heightLargeBox + " high." );
		
		scanner.close();
		
	
		
	}

}
