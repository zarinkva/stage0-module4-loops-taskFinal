package school.mjc.stage0.loops.finalTask;

public class Power {
    int result=1;
    public void printPower(int numberToPrint, int power) {
for (int i=1; i<=power; i++){
    result=result*numberToPrint;
    //System.out.println(result);
    }
        System.out.println(result);
}
    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
