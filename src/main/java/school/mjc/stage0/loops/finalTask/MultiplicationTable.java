package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int res;
        for (int num = 1; num <= 10; num++) {
            res = num*numberTableToPrint;
            System.out.println(num + " x " + numberTableToPrint + " = " + res);
        }
    }
}
