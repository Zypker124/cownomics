
/*
ID: angusjy1
LANG: JAVA
TASK: outline
*/
import java.io.*;
import java.util.*;

class cownomics {
	
	public static int numOfCows;
	public static int genomeLength;
	
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader reader = new BufferedReader(new FileReader("cownomics.in"));
                                                  // input file name goes above
    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
    StringTokenizer st = new StringTokenizer(reader.readLine());
    numOfCows = Integer.parseInt(st.nextToken());
    genomeLength = Integer.parseInt(st.nextToken());
    String[] genomesSpotty = new String[numOfCows];
    String[] genomesPlain = new String[numOfCows];
    for(int ind = 0; ind < numOfCows; ind++){
    	st = new StringTokenizer(reader.readLine());
    	genomesSpotty[ind] = st.nextToken();
    }
    for(int ind = 0; ind < numOfCows; ind++){
    	st = new StringTokenizer(reader.readLine());
    	genomesPlain[ind] = st.nextToken();
    }
    //printArrayS(genomesSpotty);
    //printArrayS(genomesPlain);
    
    
    writer.println();
    writer.close();
  }
  
  public static void printArrayI(int[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(arr[i]);
	  }
  }
  
  public static void printArrayB(boolean[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(arr[i]);
	  }
  }
  
  public static void printArrayD(double[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(arr[i]);
	  }
  }
  
  public static void printArrayC(char[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(arr[i]);
	  }
  }
  
  public static void printArrayS(String[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(arr[i]);
	  }
  }

  public static void printListI(ArrayList<Integer> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(arr.get(i));
	  }
  }
  
  public static void printListD(ArrayList<Double> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(arr.get(i));
	  }
  }
  
  public static void printListS(ArrayList<String> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(arr.get(i));
	  }
  }
  
  private int array[];
  private int length;
  
  public void sort(int[] inputArr) {
      
      if (inputArr == null || inputArr.length == 0) {
          return;
      }
      this.array = inputArr;
      length = inputArr.length;
      quickSort(0, length - 1);
  }

  private void quickSort(int lowerIndex, int higherIndex) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (array[i] < pivot) {
              i++;
          }
          while (array[j] > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbers(i, j);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSort(lowerIndex, j);
      if (i < higherIndex)
          quickSort(i, higherIndex);
  }

  private void exchangeNumbers(int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
  }
  
}