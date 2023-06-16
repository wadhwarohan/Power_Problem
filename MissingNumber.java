class MissingNumber {

    public static void findMissing(int arr[], int N) {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 1, 5, 7, 2, 3, 1 };
        int n = arr.length;
        findMissing(arr, n);
    }
}