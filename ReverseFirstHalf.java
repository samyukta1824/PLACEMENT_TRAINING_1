class ReverseFirstHalf {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};

        int half = a.length / 2;

        for (int i = 0; i < half / 2; i++) {
            int temp = a[i];
            a[i] = a[half - 1 - i];
            a[half - 1 - i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}