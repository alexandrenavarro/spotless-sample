package com.github.aleandrenavarro.spotlesssample.idea;


public class Foo {
    public int[] X = new int[]{1, 3, 5, 7, 9, 11};

    public void foo(boolean a, int x, int y, int z) {
        label1:
//        do {
        try {
            if (x > 0) {
                int someVariable = a ? x : y;
                int anotherVariable = a ? x : y;
            } else if (x < 0) {
                int someVariable = (y + z);
                someVariable = x = x + y;
            } else {
                label2:
                for (int i = 0; i < 5; i++) doSomething(i);
            }
            switch (x) {
                case 0:
                    doCase0();
                    break;
                default:
                    doDefault();
            }
        } catch (Exception e) {
            processException(e.getMessage(), x + y, z, a);
        } finally {
            processFinally();
        }
//        }
//        while (true);

        if (2 < 3) return;
        if (3 < 4) return;
        do {
            x++;
        } while (x < 10000);
        while (x < 50000) x++;
        for (int i = 0; i < 5; i++) System.out.println(i);
    }

    private void doCase0() {
    }

    private void doDefault() {

    }

    private void processFinally() {
    }

    private void processException(String message, int i, int z, boolean a) {

    }

    private void doSomething(int i) {

    }

    private class InnerClass implements I1, I2 {
        public void bar() throws E1, E2 {
        }
    }
}
