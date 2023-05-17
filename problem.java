import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



    class GFG {

        private static List<Integer> sortListOrder (List<Integer> list) {
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenList = new ArrayList<>();


            for (Integer elem : list) {
                if (elem%2 != 0) {
                    oddList.add(elem);
                }
                else {
                    evenList.add(elem);
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            List<Integer> reversedList = new ArrayList<>();
            for (int i = oddList.size() - 1; i >= 0; i--) {
                reversedList.add(oddList.get(i));
            }

            reversedList.addAll(evenList);

            return reversedList;
        }

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int numTests = sc.nextInt();

            while(numTests-- > 0) {
                int size = sc.nextInt();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    int elem = sc.nextInt();
                    list.add(elem);
                }

                List<Integer> sortedList = sortListOrder(list);

                for (Integer elem : sortedList) {
                    System.out.print(elem + " ");
                }
                System.out.println();

            }
            sc.close();
        }
    }

