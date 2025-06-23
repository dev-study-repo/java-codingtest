import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < 1; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            for (int j = 0; j<2; j++) {
                int temp = arr[I+j];
                arr[I+j] = arr[J-j];
                arr[J-j] = temp;
            }
        }
        for (int i : arr)
            System.out.print(i+" ");
    }
}
