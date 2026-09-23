class IncreasingAdjacentPairs {
    public static void main(String[] args) {
        int[] a = {10, 20, 15, 30, 40};

        int count = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}