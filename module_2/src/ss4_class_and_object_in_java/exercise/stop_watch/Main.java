package ss4_class_and_object_in_java.exercise.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.start();
        System.out.println(startTime);
        int sum = 0;
        int[] numArr;
        numArr = new int[1000000];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) ((Math.random() * numArr.length));
        }
        Arrays.sort(numArr);

        long endTime = stopWatch.stop();
        System.out.println(endTime);
        System.out.println(stopWatch.getElapsedTime() + " mili giây");
    }
}
