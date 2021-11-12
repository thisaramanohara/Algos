public class Main {

    public static void main(String[] args) {
        Sorting obj = new Sorting();
        int A[] = {1,22,343,23,23,1,45,465,435,32423,3};
        obj.bubbleSort(A);
        System.out.println();
        obj.optimizedBubbleSort(A);
        System.out.println();
        obj.insertionSort(A);
        

    }
}
