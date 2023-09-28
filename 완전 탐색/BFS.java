import java.util.Queue;
import java.util.LinkedList;

public class BFS {

    public static void main(String[] args) {
        Node root = new Node(0);
        root.lt = new Node(1);
        root.rt = new Node(2);
        root.lt.lt = new Node(3);
        root.lt.rt = new Node(4);
        root.rt.lt = new Node(5);
        root.rt.rt = new Node(6);
        bfs(root);
    }

    static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node node = queue.poll();
                System.out.println(node.value);
                if (node.lt != null) {
                    queue.offer(node.lt);
                }
                if (node.rt != null) {
                    queue.offer(node.rt);
                }
            }
        }
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
