package exercise;

public class Exe1 {
    public static int checkGame(double percent, int prize, int pay) {
        double res = percent * prize;
        int rsul = pay - (int) res;
        if (res > pay) {
            return rsul;
        }
        else if (res <= 0) {
            return 0;
        }

        else {
            return 0;
        }

    }
}
