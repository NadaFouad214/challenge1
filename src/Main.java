import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        String result = reverseLettersInWords(s);
        System.out.println(result);
        scanner.close();
        }
    public static String reverseLettersInWords(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= charArray.length; end++) {
            if (end == charArray.length || charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }

        return new String(charArray);
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    }
