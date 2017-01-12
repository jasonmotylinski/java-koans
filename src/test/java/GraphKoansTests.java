import org.junit.Test;

/**
 * Created by developer on 1/12/17.
 */
import java.util.*;

import static org.junit.Assert.assertTrue;

public class GraphKoansTests {

    @Test
    public void TraverseBreadthFirst(){
        GraphKoans.Node rootNode = new GraphKoans.Node(1, new GraphKoans.Node(2, new GraphKoans.Node(4), new GraphKoans.Node(5)), new GraphKoans.Node(3, new GraphKoans.Node(6), null));
        ArrayList<Integer> items = new ArrayList<Integer>();
        LinkedList<GraphKoans.Node> q = new LinkedList<GraphKoans.Node>();
        q.add(rootNode);
        GraphKoans.BreadthFirstTraversal(q, items);
        Integer[] values = new Integer[]{1,2,3,4,5,6};
        assertTrue(Arrays.equals(items.toArray(), values));
    }

    @Test
    public void TraverseDepthFirst(){
        GraphKoans.Node rootNode = new GraphKoans.Node(1, new GraphKoans.Node(2, new GraphKoans.Node(4), new GraphKoans.Node(5)), new GraphKoans.Node(3, new GraphKoans.Node(6), null));
        ArrayList<Integer> items = new ArrayList<Integer>();
        GraphKoans.DepthFirstTraversal(rootNode, items);
        Integer[] values = new Integer[]{1,2,4,5,3,6};
        assertTrue(Arrays.equals(items.toArray(), values));
    }
}
