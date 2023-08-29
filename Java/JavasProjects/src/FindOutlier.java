public class FindOutlier {
    static int find(int[] integers) {
        int contaimpar = 0;
        int impar = 0;
        int par = 0;
        for (int number : integers) {
            if (number % 2 == 0) {
                par = number;
            } else {
                contaimpar++;
                impar = number;
            }
        }
        if (contaimpar == 1) {
            return impar;
        } else {
            return par;
        }
    }
}