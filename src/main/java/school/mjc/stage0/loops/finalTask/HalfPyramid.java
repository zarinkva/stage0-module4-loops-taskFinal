package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
for (int i=0; i<cathetusLength;i++){
    for(int j=2*(cathetusLength-i); j>=0; j--){
        System.out.print(" ");
    }
    for(int j=0; j<=i; j++)
    {
        // printing stars
        System.out.print("* ");
    }

    // ending line after each row
    System.out.println();
}
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
