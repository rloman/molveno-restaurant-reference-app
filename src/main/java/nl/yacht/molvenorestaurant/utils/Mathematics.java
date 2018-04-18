package nl.yacht.molvenorestaurant.utils;

public final class Mathematics {

    private Mathematics() {

    }

    public static int fac(int n) {

        if (n == 0) { // the simplest step
            return 1;
        } else {
            return fac(n - 1) * n;
        }
    }

    public static int ggd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return ggd(m, n % m);
        }
    }

    public static int kgv(int n, int m) {
        return (n * m) / ggd(n, m);
    }

    public static int fibon(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibon(n - 1) + fibon(n - 2);
        }
    }

    private static void hanoiHulp(int aantal, int van, int via, int naar) {

        // no stones left => done
        if (aantal == 0) {
            return;
        }

        // first move aantal -1 from van via naar to via
        hanoiHulp(aantal - 1, van, naar, via);

        // move the stone
        System.out.println("Move " + van + " to " + naar);

        // than move aantal-1 from via via van to naar
        hanoiHulp(aantal - 1, via, van, naar);
    }

    public static void hanoi(int aantal) {
        hanoiHulp(aantal, 1, 2, 3);
    }
}