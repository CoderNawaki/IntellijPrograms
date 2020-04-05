import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Map;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println("Using java 7");
        //count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("List:" + strings);
        long count = getCountEmptyStringJava7(strings);

        System.out.println("Empty strings:" + count);
        count = getCountLength3UsingJava7(strings);

        System.out.println("Strings of length 3:" + count);

        //Eliminate empty string
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("filtered list:" + filtered);

        //Eliminate empty string and join using comma.
        String mergedString = getMergedStringUsing7(strings, ",");
        System.out.println("Merged String:" + mergedString);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);


        //get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("squares list:" + squaresList);

        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("list:" + integers);
        System.out.println("highest number in list" + getMax(integers));
        System.out.println("lowest number in list" + getMin(integers));
        System.out.println("sum of all numbers:" + getSum(integers));
        System.out.println("Average of all numbers:" + getAverage(integers));
        System.out.println("random numbers:");


        //print ten random numbers
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("Using java 8:");
        System.out.println("List:" + strings);
        count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("empty Strings:" + count);
        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3:" + count);
        filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("filtered list:" + filtered);

        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("merged String:" + mergedString);
        squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Sqaure list:" + squaresList);
        System.out.println("list" + integers);
        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in list:" + stats.getMax());
        System.out.println("lowest number in  list" + stats.getMin());
        System.out.println("sum of all numbers:" + stats.getSum());
        System.out.println("Average of all numbers:" + stats.getAverage());
        System.out.println("Random Numbers:");
        random.ints().limit(10).sorted().forEach(System.out::println);

        //parallel processing
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("empty strings:" + count);

    }

      private static int getCountEmptyStringJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

   private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

     private static String getMergedStringUsing7(List<String> strings, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            if (!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length() - 2);
    }

      private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squareList = new ArrayList<Integer>();
        for (Integer number : numbers) {
            Integer square= new Integer(number.intValue()*number.intValue());
            if (!squareList.contains(square)) {
                squareList.add(square);
            }
        }
        return squareList;
    }

    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if (number.intValue() > max) {
                max = number.intValue();
            }
        }
        return max;
    }

     private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if (number.intValue() < min) {
                min = number.intValue();
            }

        }
        return min;
    }

     private static int getSum(List numbers) {
        int sum = (int) (numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            sum += (int) numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }

}