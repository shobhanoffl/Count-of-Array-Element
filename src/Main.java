import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int i = 0; i < size; i++) {
            if(array[i]>max){
                max=array[i];
                maxCount=0;
            }
            if(array[i]==max){
                maxCount+=1;
            }
        }
        System.out.println(size-maxCount);

    }
}