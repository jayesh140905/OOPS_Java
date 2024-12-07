public class PairApplication {
    public static void main(String[] args) {
        Pair[] pairs = {
            new Pair(1, 2),
            new Pair(3, 5),
            new Pair(2, 6),
            new Pair(1, 7)
        };

        System.out.println("Before Sorting:");
        for (Pair pair : pairs) {
            System.out.print(pair + " ");
        }

        Pair.sort(pairs);

        System.out.println("\nAfter Sorting:");
        for (Pair pair : pairs) {
            System.out.print(pair + " ");
        }
    }
}
