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

}

