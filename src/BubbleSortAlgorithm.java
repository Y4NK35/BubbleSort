public class BubbleSortAlgorithm {

  private int[] result;

  public void sortArray(int[] inputArray) {
    if (isArrayEmpty(inputArray)) {
      System.out.println("Array is empty.");
      result = inputArray;
    } else {
      int arrayLength = inputArray.length;
      for (int i = 0; i < arrayLength; i++) {
        for (int j = 0; j < arrayLength - 1; j++) {
          if (inputArray[j] > inputArray[j + 1]) {
            int tempInt = inputArray[j + 1];
            inputArray[j + 1] = inputArray[j];
            inputArray[j] = tempInt;
          }
        }
      }
      result = inputArray;
    }
  }

  public boolean isArrayEmpty(int[] array) {
    return array.length == 0;
  }

  public String printArray(int[] array) {
    if (isArrayEmpty(array)) {
      return "{}";
    } else {
      StringBuilder sb = new StringBuilder();
      sb.append("{");
      for (int i = 0; i < array.length; i++) {
        sb.append(array[i] + ", ");
      }
      sb.setLength(sb.length() - 2);
      sb.append('}');
      return sb.toString();
    }
  }

  public int[] getResult() {
    return result;
  }
}
