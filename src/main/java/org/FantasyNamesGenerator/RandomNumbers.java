package org.FantasyNamesGenerator;

import java.util.List;
import java.util.Random;

public class RandomNumbers {

    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int x = 0;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getX() {
        return x;
    }


    public void randomNumbers() {

        Random wordsNumber = new Random();
        this.x = wordsNumber.nextInt(2) + 2;

        Random ArraysNumbers = new Random();
        for (int iCount = 0; iCount < x; iCount = iCount + 1) {

            if (iCount == 0) {
                this.a = ArraysNumbers.nextInt( Controller.getSyllabefirstArrayList().size() - 1);
            }
            if (iCount == 1) {
                this.b = ArraysNumbers.nextInt(Controller.getSyllabelastArrayList().size() - 1);
            }
            if (iCount == 2) {
                this.c = ArraysNumbers.nextInt(Controller.getSyllabesecondArrayList().size() - 1);
            }
        }
    }
}
