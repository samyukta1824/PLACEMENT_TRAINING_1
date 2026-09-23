class DifferenceFirstLast {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int difference = a[0] - a[a.length - 1];

        System.out.println(difference);
    }
}