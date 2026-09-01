public class Main {

    public static void main(String[] args)
    {

        System.out.println("========================================");
        System.out.println("     JAVA PROGRAMMING TASK");
        System.out.println("          SELF-TEST PROGRAM");
        System.out.println("========================================");

        System.out.println();
        System.out.println("Use this program to test your solutions.");
        System.out.println("Check both the output and the expected result.");
        System.out.println();


        // =====================================================
        // PROBLEM 1
        // =====================================================

        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 1 - TEXT COMPRESSION");
        System.out.println("----------------------------------------");

        String text1 = "aaabbccccccdd";

        System.out.println("Test 1");
        System.out.println("Input:    " + text1);
        System.out.println("Expected: a3b2c6d2");
        System.out.println("Your result: " + Tarea1.compress(text1));

        System.out.println();

        String text2 = "hello   world";

        System.out.println("Test 2");
        System.out.println("Input:    " + text2);
        System.out.println("Expected: h1e1l2o1 3w1o1r1l1d1");
        System.out.println("Your result: " + Tarea1.compress(text2));

        System.out.println();

        String text3 = "aaaaaa";

        System.out.println("Test 3");
        System.out.println("Input:    " + text3);
        System.out.println("Expected: a6");
        System.out.println("Your result: " + Tarea1.compress(text3));

        System.out.println();

        String compressed = "a3b2c6d2";

        System.out.println("Test 4 - Decompression");
        System.out.println("Input:    " + compressed);
        System.out.println("Expected: aaabbccccccdd");
        System.out.println("Your result: " + Tarea1.decompress(compressed));


        // =====================================================
        // PROBLEM 2
        // =====================================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 2 - STATISTICS");
        System.out.println("----------------------------------------");

        int[] data = {4, 2, 7, 2, 9, 4, 2};

        System.out.println("Data: [4, 2, 7, 2, 9, 4, 2]");
        System.out.println();

        System.out.println("Mean");
        System.out.println("Expected: 4.285714...");
        System.out.println("Your result: " + Tarea1.mean(data));

        System.out.println();

        System.out.println("Median");
        System.out.println("Expected: 4");
        System.out.println("Your result: " + Tarea1.median(data));

        System.out.println();

        System.out.println("Mode");
        System.out.println("Expected: 2");
        System.out.println("Your result: " + Tarea1.mode(data));

        System.out.println();

        System.out.println("Range");
        System.out.println("Expected: 7");
        System.out.println("Your result: " + Tarea1.range(data));

        System.out.println();

        int[] evenData = {1, 2, 3, 4};

        System.out.println("Median with an even number of elements");
        System.out.println("Data:     [1, 2, 3, 4]");
        System.out.println("Expected: 2.5");
        System.out.println("Your result: " + Tarea1.median(evenData));


        // =====================================================
        // PROBLEM 3
        // =====================================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 3 - PATTERN SEARCH");
        System.out.println("----------------------------------------");

        String text = "ABABABA";
        String pattern = "ABA";

        int[] positions = Tarea1.findOccurrences(text, pattern);

        System.out.println("Text:    " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Expected positions: [0, 2, 4]");
        System.out.print("Your result:         ");

        printArray(positions);

        System.out.println();

        text = "AAAAA";
        pattern = "AAA";

        positions = Tarea1.findOccurrences(text, pattern);

        System.out.println("Text:    " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Expected positions: [0, 1, 2]");
        System.out.print("Your result:         ");

        printArray(positions);

        System.out.println();

        text = "hello world";
        pattern = "xyz";

        positions = Tarea1.findOccurrences(text, pattern);

        System.out.println("Text:    " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Expected positions: []");
        System.out.print("Your result:         ");

        printArray(positions);


        // =====================================================
        // PROBLEM 4
        // =====================================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 4 - TWO SMALLEST VALUES");
        System.out.println("----------------------------------------");

        int[] times = {
                17, 4, 9, 4, 12, 7, 9, 3
        };

        int[] result = Tarea1.twoSmallest(times);

        System.out.println("Input:    [17, 4, 9, 4, 12, 7, 9, 3]");
        System.out.println("Expected: [3, 4]");
        System.out.print("Your result: ");

        printArray(result);

        System.out.println();

        times = new int[]{-2, -8, -2, 4};

        result = Tarea1.twoSmallest(times);

        System.out.println("Input:    [-2, -8, -2, 4]");
        System.out.println("Expected: [-8, -2]");
        System.out.print("Your result: ");

        printArray(result);

        System.out.println();

        times = new int[]{5, 5, 5};

        result = Tarea1.twoSmallest(times);

        System.out.println("Input:    [5, 5, 5]");
        System.out.println("Expected: []");
        System.out.print("Your result: ");

        printArray(result);


        // =====================================================
        // PROBLEM 5
        // =====================================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("PROBLEM 5 - ANOMALY DETECTION");
        System.out.println("----------------------------------------");

        int[] transactions = {
                10, 11, 12, 50, 13, 12, 11
        };

        int[] anomalies = Tarea1.findAnomalies(transactions);

        System.out.println("Input:    [10, 11, 12, 50, 13, 12, 11]");

        System.out.println("Expected: [3]");
        System.out.print("Your result: ");

        printArray(anomalies);

        System.out.println();

        transactions = new int[]{10, 10, 1, 10, 10};

        anomalies = Tarea1.findAnomalies(transactions);

        System.out.println("Input:    [10, 10, 1, 10, 10]");

        System.out.println("Expected: [2]");
        System.out.print("Your result: ");

        printArray(anomalies);

        System.out.println();

        transactions = new int[]{10, 11, 12, 13, 14};

        anomalies = Tarea1.findAnomalies(transactions);

        System.out.println("Input:    [10, 11, 12, 13, 14]");

        System.out.println("Expected: []");
        System.out.print("Your result: ");

        printArray(anomalies);


        // =====================================================
        // ANOMALY REPORT
        // =====================================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("ANOMALY REPORT TEST");
        System.out.println("----------------------------------------");

        int[] reportData = {10, 11, 12, 50, 13, 12, 11};

        System.out.println("Input: [10, 11, 12, 50, 13, 12, 11]");

        System.out.println();

        Tarea1.printAnomalyReport(reportData);


        // =====================================================
        // FINAL MESSAGE
        // =====================================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("SELF-CHECK FINISHED");
        System.out.println("========================================");

        System.out.println();
        System.out.println("If one or more results are incorrect,");

        System.out.println("review your implementation before submitting.");

        System.out.println();
        System.out.println("Passing these tests does NOT guarantee that");

        System.out.println("your program is completely correct.");

        System.out.println("You should create additional test cases.");
    }


    // ---------------------------------------------------------
    // Auxiliary method for displaying arrays
    // ---------------------------------------------------------

    public static void printArray(int[] array)
    {

        if (array == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");

        for (int i = 0; i < array.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(array[i]);
        }

        System.out.println("]");
    }
}
