public class Sorting {

    public void bubbleSort(int A[]) {
        for (int i=0; i<A.length-1;i++) {
            for (int j=0; j<A.length-1; j++) {
                if(A[j]>A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public void optimizedBubbleSort(int A[]) {
        int flag;
        for (int i=0; i<A.length-1;i++) {
            flag = 0;
            for (int j=0; j<A.length-1-i; j++) {
                if(A[j]>A[j+1]) {
                    flag = 1;
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
            if(flag==1) {
                break;
            }
        }

        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }


    public void insertionSort(int A[]) {
        for (int i=1; i<A.length; i++) {
            int temp = A[i];
            int j=i-1;
            while (j>=0 && A[j]>temp) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = temp;
        }

        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public void selectionSort(int A[]) {
        for (int i=0; i<A.length-1; i++) {
            int min = i;
            for (int j=i+1; j<A.length; j++) {
                if(A[j]<A[min]) {
                    min = j;
                }
            }
            if (min!=i) {
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }

        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}

