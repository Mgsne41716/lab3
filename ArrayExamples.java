

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {

    int front = 0;
    int back = arr.length - 1;
    while (front < back) {
      // swap
      int cur = arr[front];
      arr[front] = arr[back];
      arr[back] = cur;

      front++;
      back --;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    int countNotLowest = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; countNotLowest++;}
    }
    return sum / countNotLowest;
  }


}

