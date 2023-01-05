public class TestClass {
    int[] input1={};
    int[] input2={1,2,5,3,1,7,9,1,12,83,1,5,3,2};
    int[] input3={1,1,1,1,1,1,1,2,1,1,1};
    int[] input4={2,2,2,2};
    int[] input5={1,2};
    int[] input6={2,1};
    BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();



    public void startTests() throws InterruptedException {
        doTest(input1);
        doTest(input2);
        doTest(input3);
        doTest(input4);
        doTest(input5);
        doTest(input6);
    }



    public void doTest(int [] array) throws InterruptedException {
        System.out.println(" Input array: " +algorithm.printArray(array));
        algorithm.sortArray(array);
        System.out.println("Output array: "+algorithm.printArray(algorithm.getResult()));
        Thread.sleep(3000);
    }

}
