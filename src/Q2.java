public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{30, 20, 10, 60, 70, 69, 62};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Ascending order is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}