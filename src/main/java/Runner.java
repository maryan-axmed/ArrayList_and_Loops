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
//                Arrays.sort(scottishIslands, Collections.sort());

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
//        for (int i = 0; i < numbers.size(); i++) {
//            if (i % 2 == 0) {
//                evenNumbers.add(i);
//                System.out.println(evenNumbers);
//            }
        for (int i = 0; i < numbers.size(); i++) { //change condition
            if (i % 2 == 0) {
                evenNumbers.add(i);
                System.out.println(evenNumbers);
            }
        }
//          for (int i = 0; i < numbers.size(); i++)
                if (in)
//        2. Print the difference between the largest and smallest value
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
