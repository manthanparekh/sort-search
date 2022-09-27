/*
 * Sort and Search the following array
 * Array = {12, 89, 70, 190, 57, 3, 14, 5, 30}
 */
class sortNsearch {

  //TODO: Task1 -> Write a method which sorts an array from least to greatest
  void sort(int arr[]) {
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < arr.length - 1; i++) {
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) if (
        arr[j] < arr[min_idx]
      ) min_idx = j;

      // Swap the found minimum element with the first
      // element
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  //TODO: Task2 -> Write a method which searches through the array seaching for its index value AFTER the array is sorted
  public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  //TODO: Task3 -> Write a method to loop though the array and print out its value
  // Prints the array
  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
    System.out.println();
  }

  // TODO: Task4 -> In the main create a new Object
  public static void main(String[] args) {
    sortNsearch object = new sortNsearch();
    // TODO: Task5 -> Create an array with with the unsorted value { 12, 89, 70, 190, 57, 3, 14, 5, 30 }
    int[] array = { 12, 89, 70, 190, 57, 3, 14, 5, 30 };
    // TODO: Task6 -> Sort and print the array
    object.sort(array);
    System.out.print("The Sorted Array: ");
    object.printArray(array);
    // TODO: Task7 -> Seach for an value in the array and print its index value
    int key = 14;
    System.out.println(key + " is found at index: " + linearSearch(array, key));
  }
}
