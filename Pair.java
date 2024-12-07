public class Pair {
    private int first;
    private int second;

    public Pair() {
        this.first = 0;
        this.second = 0;
    }

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void set(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void sort(Pair[] pairs) {
        java.util.Arrays.sort(pairs, (p1, p2) -> Integer.compare(p1.getSecond(), p2.getSecond()));
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
