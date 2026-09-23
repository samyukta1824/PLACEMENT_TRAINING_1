class SwapPositions {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int p1 = 1;
        int p2 = 3;

        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}