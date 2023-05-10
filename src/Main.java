import java.util.Scanner;
import java.util.ArrayList;

class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        System.out.println("The fifth item in the list is: " + listOfStrings.get(4));
    }
}
class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        System.out.println(listOfStrings.size());
    }
}
class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                System.out.println("Done entering integers");
                break;
            }
            listOfNumbers.add(inputNumber);
        }
        System.out.println("What number are you looking for in the list?");
        int yourNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) == yourNumber) {
                System.out.println(yourNumber + " is at index " + i);
            }
        }
    }
}
class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        String theLastItem = listOfStrings.get(listOfStrings.size() - 1);
        System.out.println("The last item in the list is: " + theLastItem);


    }
}
class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                System.out.println("The sum of that list is:");
                break;
            }
            listOfNumbers.add(inputNumber);
        }

        int totalSum = sum(listOfNumbers);
        System.out.println(totalSum);
    }

    public static int sum(ArrayList<Integer> listOfNumbers) {
        int totalSum = 0;
        for (int num : listOfNumbers) {
            totalSum += num;
        }
        return totalSum;
    }
}