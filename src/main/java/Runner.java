import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
                scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
                scottishIslands.add(0,"Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
                scottishIslands.add(2,"Islay");
//        4. Print out the index position of "Skye"
                int skyeIndex = scottishIslands.indexOf("Skye");
                System.out.println(skyeIndex);
//                answer: java return '4'.
//        5. Remove "Tresco" from the list by name
                scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
                scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
                System.out.println("The size of the ArrayList is: " + scottishIslands.size());
//        8. Sort the list alphabetically
               Collections.sort(scottishIslands);
        System.out.println("After sort" + scottishIslands);

//        9. Print out all the islands using a for loop
            for(String island: scottishIslands) {
                System.out.println(island);
            }
        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//             for (int i = 1; i<=4; i+2=); {
//                 numbers.a
//                              }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) { //change condition
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
//
//        2. Print the difference between the largest and smallest value
        int maxValue = Collections.max(numbers);
        int minValue = Collections.min(numbers);
        int result = maxValue - minValue;
        System.out.println(result);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean resultOneAndOne = false;
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 1 && numbers.get(i+1) ==1) {
                resultOneAndOne = true;
            }
        }
        System.out.println(resultOneAndOne);

//        4. Print the sum of the numbers // expected to be 156
//            int numbers= new int[1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7]
            int sum =0;
            for (int i=0; i <numbers.size(); i++){
                sum = sum + numbers.get(i);
            }
            System.out.println("Sum value of numbers is:" + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

//        int sumTwo =0;
//        for (int i=0; i < numbers.size(); i++) {
//            if(numbers.get(i) == 13); {
//                break;
//            }
//            sumTwo = sumTwo + numbers.get(i);
//        }
//        System.out.println("Sum value of numbers is:" + sumTwo);

        int sumTwo = 0;
        if(numbers.get(i) ==13) {
            for(i = 0; i < numbers.size(); i++) {
                sumTwo = sumTwo + numbers.get(i);
            }
            break;
        }
        System.out.println("Sum value of numbers is:" + sumTwo);
    }

}
