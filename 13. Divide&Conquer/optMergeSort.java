
public class optMergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
    }
    System.err.println();
}

    public static void mergesort(int arr[],int si, int ei){
        //kaam work

        int mid = (si+ei) /2;

        mergesort(arr, si, mid); //left part
        mergesort(arr, mid+1, ei); //right part
        merge(mid, si, mid, ei);
    }

    public static void merge (int arr, int si,int mid ,int ei){
        int temp = new int[ei-si+1];
        int i = si; // iterator for left 
        int j= mid+1;//itr for right
        int k =0;// itr for temp arr

        while (i<=mid && j<=ei) {
            if(arr[i] <arr[j]){
                temp [k] =arr[i];
                i++;
                k++;
            }else{
                temp[k] =arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] =arr[i++];
        }
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        for (k = 0; i=si ; k < temp.length; k++;i++) {
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,3,2,1,5,7};
        mergesort(arr, 0, arr.length-1);
    }
}
