package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String res = "";
        String sym = "";
        for (int x = 1; x <= cathetusLength; x++) {
            res = "";
            sym = "";
            for (int num = cathetusLength; num > 0; num--) {
                if (x < num) {
                    res += " ";
                } else {
                    res += num;
                    if (num != 1) {
                        sym += num;
                    }
                }

            }
            System.out.println(res + sym);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
