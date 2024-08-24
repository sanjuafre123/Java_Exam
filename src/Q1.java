public class Q1 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5,6};

        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(" Largest Element Is = " + max);
    }

}