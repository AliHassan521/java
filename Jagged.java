public class Jagged {
    public static void main(String[] args) {

        // int[][] jagged = new int[3][]; //Jagged array

        // jagged[0] = new int[3];
        // jagged[1] = new int[4];
        // jagged[2] = new int[2];

        // for (int i = 0; i < jagged.length; i++) {
        // for (int j = 0; j < jagged[i].length; j++) {
        // jagged[i][j] = (int) (Math.random() * 10);
        // }
        // }

        // for (int n[] : jagged) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        int multi[][][] = new int[3][4][3];

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    multi[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int n[][] : multi) {
            for (int m[] : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
