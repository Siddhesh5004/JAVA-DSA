public class linearsearch {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 10, 12, 35, 34 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");

        } else {
            System.out.println("key is at index : " + index);

        }

    }

}
