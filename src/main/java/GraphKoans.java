import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by developer on 1/12/17.
 */
public class GraphKoans {

    public static class Node{
        public Node Left;
        public Node Right;
        public Integer Value;

        public Node(Integer value, Node left, Node right){
            this.Value = value;
            this.Left = left;
            this.Right = right;
        }

        public Node(Integer value){
            this(value, null, null);
        }
    }

    public static void BreadthFirstTraversal(Queue<Node> q, ArrayList<Integer> values){
        if(q.peek() == null) return;
        Node node = q.remove();

        if(node.Value != null) {
            values.add(node.Value);
        }
        if(node.Left != null){
            q.add(node.Left);
        }
        if(node.Right != null){
            q.add(node.Right);
        }

        BreadthFirstTraversal(q, values);
    }

    public static void DepthFirstTraversal(Node node, ArrayList<Integer> values){
        if(node.Value != null) {
            values.add(node.Value);
        }
        if(node.Left != null){
            DepthFirstTraversal(node.Left, values);
        }
        if(node.Right != null){
            DepthFirstTraversal(node.Right, values);
        }
    }
}
