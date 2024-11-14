import java.util.Scanner;

public class SelectSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    public static void sort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int smallest=i;
            for(int j=i+1;i<arr.length;j++) {
                if (arr[smallest] > arr[j])
                {
                    smallest=j;
            }}
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter values in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.println(" ");
        sort(arr);
        System.out.println(" ");
        print(arr);
    }
}


