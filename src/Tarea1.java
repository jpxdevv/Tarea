import java.lang.reflect.Array;
import java.util.Arrays;

public class Tarea1 {
    public static String compress(String text) {

        if (text.length() == 0) {
            return "";
        }

        String result = "";
        int count = 1;
        int length = text.length();

        for (int i = 1; i < length; i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {

                result = result + text.charAt(i - 1) + count;
                count = 1;
            }
        }


        result = result + text.charAt(length - 1) + count;

        return result;
    }

    public static String decompress(String text) {
        if (text == null) {
            return null;
        }
        if (text.length() == 0) {
            return "";
        }
        String result = "";
        int i = 0;
        int length = text.length();
        while (i < length) {
            char c = text.charAt(i);
            i++;
            if (c >= '0' && c <= '9') {
                return null;
            }
            if (i >= length) {
                return null;
            }
            String countStrin = "";
            while (i < length && text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                countStrin += text.charAt(i);
                i++;
            }
            if (countStrin.length() == 0) {
                return null;
            }
            int count = Integer.parseInt(countStrin);
            for (int j = 0; j < count; j++) {
                result += c;
            }
        }
        return result;

    }

    public static double mean(int[] data) {
        double sum = 0;
        if(data.length == 0){
            return 0.0;
        }
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double average = sum / data.length;

        return average;
    }

    public static double median(int [] data){
        if (data.length == 0){
            return 0.0;
        }
        int [] copy = new int[data.length];
        for(int i = 0; i< data.length; i++){
            copy[i] = data[i];
        }
        Arrays.sort(copy);
        int middle = copy.length/2;

        if(copy.length % 2== 0) {
            return(copy[middle-1]+ copy[middle]) / 2.0;
        } else {
            return copy[middle];
        }

    }

    public static int mode(int[] data){
        if (data.length == 0){
            return 0;
        }
        int [] copy = new int [data.length];
        for(int i = 0; i< data.length; i++ ){
            copy[i] = data[i];
        }
        Arrays.sort(copy);
        int mostRepetedNumber = copy[0];
        int maxCount = 1;
        int currentCount = 1;
        for(int i = 1; i < copy.length; i++){
            if (copy[i]== copy [i-1]){
                currentCount++;

            } else {
                if(currentCount > maxCount){
                    maxCount = currentCount;
                    mostRepetedNumber = copy[i-1];

                }
                currentCount = 1;
            }

        }
        if(currentCount > maxCount){
            mostRepetedNumber = copy[copy.length -1 ];
        }
        return  mostRepetedNumber;

    }
    public static int range(int [] data){
        if (data.length == 0){
            return 0;
        }
        int largerNumber = data[0];
        int minimumNumber = data[0];
        for( int i = 1; i< data.length; i++){
            if(data[i]> largerNumber){
                largerNumber = data[i];
            }
            if (data[i] < minimumNumber){
                minimumNumber = data[i];
            }
        }
        return largerNumber - minimumNumber;

    }

    public static int[] findOccurrences(String text, String pattern){
        if (pattern.length() > text.length() || pattern.length() == 0) {
            return new int[0];
        }
        int count = 0;
        int limit = text.length() - pattern.length();
        for(int i = 0; i<= limit; i++){
           boolean coincidence = true;
           for(int j = 0; j< pattern.length(); j++){
               if(text.charAt(i+j) != pattern.charAt(j)){
                   coincidence = false;
                   break;
               }
           }
           if(coincidence){
               count++;
           }

        }
        int[] result = new int[count];
        int savePosition = 0;
        for(int i = 0; i <= limit; i++){
            boolean coincidence = true;
            for(int j = 0; j < pattern.length(); j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    coincidence = false;
                    break;
                }
            }
            if (coincidence){
                result[savePosition] = i;
                savePosition++;
            }
        }
        return result;

    }
    public static int[] twoSmallest(int[] times){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < times.length; i++){
            if (times[i] < min1){
                min2 = min1;
                min1 = times[i];
            }else if (times[i] < min2 && times[i] != min1){
                min2 = times[i];
            }
        }
        if (min2 == Integer.MAX_VALUE){
            return new int[0];
        }
        return new int[]{min1, min2};
    }
    public static int[] findAnomalies(int[] transactions){
        if (transactions.length < 3) {
            return new int[0];
        }
        int count = 0;
        for(int i = 1; i < transactions.length - 1; i++){
            int actual = transactions[i];
            int previous = transactions[i-1];
            int next = transactions[i+1];
            if((actual> previous * 3 && actual > next)||(actual < previous / 3 && actual < next/3)){
                count++;
            }
        }
        int [] positions = new int[count];
        int saveIndex = 0;

        for (int i = 1; i < transactions.length - 1; i++) {


            int actual = transactions[i];
            int previo = transactions[i - 1];
            int siguiente = transactions[i + 1];


            if ((actual > previo * 3 && actual > siguiente * 3) ||
                    (actual < previo / 3 && actual < siguiente / 3)) {

                positions[saveIndex] = i;
                saveIndex++;
            }

        }
        return positions;



    }
    public static void printAnomalyReport(int[] transactions) {

        System.out.println("Anomaly Reports");

        if (transactions.length < 3) {

            System.out.println("There´s no Anomaly's ");
            return;
        }

        boolean TheresAnomalys= false;

        for (int i = 1; i < transactions.length - 1; i++) {
            int actual = transactions[i];
            int previous = transactions[i - 1];
            int next = transactions[i + 1];

            if (actual > previous * 3 && actual > next * 3) {
                System.out.println("Value " + actual);
                System.out.println("Previous Value " + previous);
                System.out.println("Next Value " + next);
                System.out.println("Type High");
                System.out.println("Position: " + i);
                TheresAnomalys = true;

            } else if (actual < previous / 3 && actual < next / 3) {
                System.out.println("Value " + actual);
                System.out.println("Previous Value: " + previous);
                System.out.println("Next Value: " + next);
                System.out.println("Type Minor");
                System.out.println("Position " + i);
                TheresAnomalys = true;
            }
        }

        if (!TheresAnomalys) {
            System.out.println("Theres no anomalys.");
        }
    }


}
