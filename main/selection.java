package main;

public class selection {
static void selectionSort(int[] arr) {
	  for (int i = 0; i < arr.length - 1; i++)  
      {  
          int index = i;  
          for (int j = i + 1; j < arr.length; j++){  
              if (arr[j] < arr[index]){  
                  index = j;//searching for lowest index  
              }  
          }  
          int smallerNumber = arr[index];   
          arr[index] = arr[i];  
          arr[i] = smallerNumber;  
      }  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] ={3,60,35,54,21,45,23,67,98};
		 for(int i=0; i < arr.length; i++){  
             System.out.print(arr[i] + " ");  
     }  
		  System.out.println();  
          
		selectionSort(arr);
          for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
      }  

	}

}
