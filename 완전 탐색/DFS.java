public class DFS {

    public static void main(String[] args) {
        Node root = new Node(0);
        root.lt = new Node(1);
        root.rt = new Node(2);
        root.lt.lt = new Node(3);
        root.lt.rt = new Node(4);
        root.rt.lt = new Node(5);
        root.rt.rt = new Node(6);
        dfs(root);
    }

    static void dfs(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        dfs(root.lt);
        dfs(root.rt);
    }

    static class Node {
        int value;
        Node lt;
        Node rt;
        public Node(int value) {
            this.value = value;
            lt = null;
            rt = null;
        }
    }
}
