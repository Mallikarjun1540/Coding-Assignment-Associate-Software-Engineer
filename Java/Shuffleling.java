package associate_software;

import java.util.Random;
import java.util.Scanner;

public class Shuffleling {
    public static void main(String[] args) {
        Shuffleling s = new Shuffleling();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Array Size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        s.shuffle(arr);
        System.out.println("Shuffled Array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        } 
    }
    public void shuffle(int arr[]) {
        Random random = new Random();
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
