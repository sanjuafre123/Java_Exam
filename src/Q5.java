public class Q5 {
    public static void main(String[] args) {
        int i = 7; 
        int j = 11; 

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i == 2 && (j == 5 || j == 7) || i == 3 && (j == 4 || j == 8) || i == 4 && (j == 3 || j == 9) || i == 5 && (j == 2 || j == 10) || i == 6 && (j == 1 || j == 11) || i == 7l̥) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
