public class linearsearch {

    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,10,12,14};
        int key =12;

        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key is at index " + index);
        }

    }

}