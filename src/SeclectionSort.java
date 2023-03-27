import java.util.Random;

public class SeclectionSort {
    public static void main(String[] args) {
       StopWatch stopWatch = new StopWatch();
       stopWatch.setStartTime();
        int[] arr = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
       stopWatch.setEndTime();
        System.out.println("thoi gian troi qua=  "+ stopWatch.getElapsedTime());
    }
}