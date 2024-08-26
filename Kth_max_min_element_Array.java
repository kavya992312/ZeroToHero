import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_max_min_element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = {8,1,3,2,6,7};
        //        for(int i=0;i<n;i++){
//            a[i] = sc.nextInt();
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println("value of i is " + i + "value of k is " + k);
            pq.add(a[i]);
            System.out.println("adding " + a[i]);
        }
        System.out.println("peak is "+ pq.peek());
        for (int c = k; c < a.length; c++) {
            System.out.println("enterin in compoarison ");
            if (pq.peek() > a[c]) {
                System.out.println("first peek" + pq.peek());
                pq.remove();     //kth smallest number
                pq.add(a[c]);
                System.out.println("added a[j]" + a[c]);
                System.out.println("peek" + pq.peek());
            }
        }
        System.out.println("" + k + "th smallest number" + pq.poll());

//        for (int j = k; j < a.length; j++) {
//            System.out.println("comming inside 2nd loop with peek " + pq.element());
//
//            if (pq.peek() < a[j]) {
//                System.out.println("first peek" + pq.peek() + "coparing with" + a[j]);
//                pq.remove();     //kth largestnumber
//                pq.add(a[j]);
//                System.out.println("added a[j]" + a[j]);
//                System.out.println("peek" + pq.peek());
//            }
//        }
//        System.out.println("" + k + "th largest number" + pq.peek());
    }
}
