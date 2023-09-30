public class Permutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] output = new int[arr.length];
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            permutation(arr, output, visited, 0, i + 1);
        }
    }

    static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
