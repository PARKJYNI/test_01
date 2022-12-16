package example;

public class DemensionArray {
	public void testDemensionArray() {
		int[][] arr;
		int[] arr2[];
		int arr3[][];
		
		arr = new int[3][5];
		
		arr2 = new int[2][];
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
				
		int num = 1;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num++;	
			}			
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
