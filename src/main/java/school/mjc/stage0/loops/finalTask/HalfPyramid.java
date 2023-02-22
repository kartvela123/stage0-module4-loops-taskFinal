package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String res = "";
        for (int x = 1; x <= cathetusLength; x++) {
            res = "";
            for (int num = 1; num <= cathetusLength; num++) {
                if (x <= cathetusLength - num) {
                    res += " ";
                } else {
                    res += "*";
                }

            }
            System.out.println(res);

        }
    }

        public static void main (String[]args){
            new HalfPyramid().printHalfPyramid(8);
        }
    }

