package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // печатаем пробелы
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // печатаем числа в возрастающем порядке
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // печатаем числа в убывающем порядке
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // печатаем новую строку
            System.out.println();
        }
}


    public static void main(String[] args) {

        new Pyramid().printPyramid(7);
    }
}