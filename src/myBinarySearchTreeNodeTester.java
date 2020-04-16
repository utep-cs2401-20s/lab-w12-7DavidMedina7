import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeNodeTester {

    @Test
    // EXPECTED TREE:
    // ACTUAL TREE:
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the myBinarySearchTreeNode() method functions correctly
    // TESTING PURPOSE: This test guarantees that a tree will be created correctly for the sake of the other methods
    public void test_1() {

        int[] A = {4, 3, 2};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(new int[] {1, 2, 3});
        tree.print();
        tree.size();
        //System.out.print(tree.size());
    }

    @Test
    // EXPECTED PLACEMENT:
    // ACTUAL PLACEMENT:
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the insert() method functions correctly
    // TESTING PURPOSE: This test will guarantee that a new node is placed correctly in a tree
    public void test_2() {}

    @Test
    // EXPECTED HEIGHT: 4
    // ACTUAL HEIGHT: 4
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the height() method functions correctly
    // TESTING PURPOSE: This test will make sure that the correct height of a tree is computed as expected
    public void test_3() {
        int[] A = {7, 14, 18, 4, 11, 21};
        int expectedHeight = 4;
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(expectedHeight, tree.height());
    }

    @Test
    // VALUE OF SEARCH:
    // EXPECTED DEPTH:
    // ACTUAL DEPTH:
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the depth() method functions correctly
    // TESTING PURPOSE: This test will ensure that given a search key, computes the correct depth of the node
    public void test_4() {}

    @Test
    // EXPECTED SIZE: 6
    // ACTUAL SIZE: 6
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the size() method functions correctly
    // TESTING PURPOSE: This test will make sure that the size of a tree (number of nodes in the tree total) is computed correctly
    public void test_5() {
        int[] A = {7, 14, 18, 4, 11, 21};
        int expectedSize = 6;
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(expectedSize, tree.size());
    }
}