public class Main {
    public static void main(String[] args) {
        //task3
        int[] aDozen = new int[3];
        aDozen[0] = 1;
        aDozen[1] = 2;
        aDozen[2] = 3;
        for (int i = aDozen.length - 1; i > 0; i--) {
            System.out.print(aDozen[i] + ", ");
        }
        System.out.println(aDozen[0]);
        double[] aDozen2 = {1.57, 7.654, 9.986};
        for (int i2 = aDozen2.length - 1; i2 > 0; i2--) {
            System.out.print(aDozen2[i2] + ", ");
        }
        System.out.println(aDozen2[0]);
        int[] aDozen3 = {5, 7, 10, 15, 7, 8};
        for (int i3 = aDozen3.length - 1; i3 > 0; i3--) {
            System.out.print(aDozen3[i3] + ", ");
        }
        System.out.println(aDozen3[0]);
    }
}