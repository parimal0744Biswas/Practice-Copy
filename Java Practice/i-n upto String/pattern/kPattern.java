public class kPattern {
    public static void main(String[] args) {

        int n1 = 5;
        for (int row = 0; row < n1; row++) {
            for (int col = 0; col < n1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n2 = 5;
        for (int row = 0; row < n2; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int n3 = 9;
        for (int row = 1; row <= n3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();

        int n5 = 4;
        for (int row = 1; row <= n5; row++) {
            for (int j = 1; j <= n5 - row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int n6 = 5;
        for (int row = 1; row <= n6; row++) {
            for (int j = 1; j <= n6 - row + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        int n7 = 5;
        int count = 1;
        for (int row = 1; row <= n7; row++) {
            for (int j = 1; j <= row; j++) {
                int sum = row + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
