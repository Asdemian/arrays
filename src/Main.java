public class Main {
    public static void main(String[] args) {
        //task4
        int[] aDozen = new int[7];
        aDozen[0] = 1;
        aDozen[1] = 2;
        aDozen[2] = 3;
        aDozen[3] = 13;
        aDozen[4] = 5;
        aDozen[5] = 8;
        aDozen[6] = 9;
        for (int i = 0; i < aDozen.length; i++) {
            if (aDozen[i] % 2 == 1) {
                aDozen[i] = aDozen[i] + 1;
            }
            System.out.print(aDozen[i] + " ");
        }
        //System.out.println(aDozen[0]);
        double[] aDozen2 = {1.57, 7.654, 9.986};
        for (int i2 = aDozen2.length - 1; i2 > 0; i2--) {
            //System.out.print(aDozen2[i2] + ", ");
        }
        //System.out.println(aDozen2[0]);
        int[] aDozen3 = {5, 7, 10, 15, 7, 8};
        for (int i3 = aDozen3.length - 1; i3 > 0; i3--) {
            //System.out.print(aDozen3[i3] + ", ");
        }
        //System.out.println(aDozen3[0]);
    }
}