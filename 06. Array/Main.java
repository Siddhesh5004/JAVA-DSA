class ArrayExamples{
    void demoArrays(){
        int [] arr = new int [3];
        float[] arr1 = new float[3];
        String [] arr3 = new String[3];

        arr[0]=34;
        arr[1]=12;
        arr[2]=45;
        ///arr[3]=55;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExamples obj =new ArrayExamples();
        obj.demoArrays();
    }
    
}
