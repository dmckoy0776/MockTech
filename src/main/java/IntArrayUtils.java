import java.util.List;

public class IntArrayUtils {


    public int sumOfAllSubArraysSingleLoopMath(int [] array){
        int length = array.length;
        int total = 0;
        for (int i = 0; i < length; i++) {
            int multiple = parabolicValue(i, length);
            total += multiple * array[i];

        }
      return total;
    }

    public int parabolicValue(int index, int length){ //ax^2 + bx+ c; x = i
        double squareIndex = Math.pow(index, 2);
        int lengthTimesIndex = index * (length -1);

        return (int)(-1*squareIndex) + lengthTimesIndex + length;
    }

    public int sumOfAllSubArraysMultiLoop(int[] array){
        int length = array.length -1;
        int totalSum = 0;
        for (int i = 0; i <= length ; i++) {
            totalSum += array[i];
            int j = i;
            do {
                totalSum+= array[i];
                totalSum += array[j];
                j++;
            }
            while (j <= length);
            totalSum -= array[length];
        }
        totalSum += array[0] + array[length-1];
        return totalSum;
    }

    public int[] bubbleSortDesc(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j -1] < arr[j]){
                    int temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    

    public int secondLargestNumber(int[] numArray){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(numArray.length <= 1)
            return -1;

        numArray = bubbleSortDesc(numArray);
        for(int i = 0; i < numArray.length; i++){
            largest = numArray[i] > largest ?  numArray[i] : largest;
            secondLargest = numArray[i] > secondLargest && numArray[i] < largest ? numArray[i] : secondLargest;
        }
        return secondLargest;
    }



}
