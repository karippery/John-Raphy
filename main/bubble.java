package main;

public final class bubble {
	
	static void bubbleSort(int[] arr) {
		//int n = arr.length;
		int temp = 0;
		// step 1 first check and swap
		for(int k = 0; k<arr.length-1; k++) {
			// step 2 check and swap
		for (int i=0; i<arr.length-k-1;i++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i]= temp;
				
			}
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] ={3,60,35,2,45,320,5,6,3,8,1,9,3,55};
		 for(int i=0; i < arr.length; i++){  
             System.out.print(arr[i] + " ");  
     }  
		  System.out.println();  
          
		  bubbleSort(arr);
          for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
      }  
	}

}
