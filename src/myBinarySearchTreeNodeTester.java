import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeNodeTester {

    @Test
    // EXPECTED TREE:
    //       3
    //      / \
    //     1   4
    //      \
    //       2
    // ACTUAL TREE:
    //       3
    //      / \
    //     1   4
    //      \
    //       2

    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the myBinarySearchTreeNode() method functions correctly
    // TESTING PURPOSE: This test guarantees that a tree will be created correctly for the sake of the other methods
    public void test_1() {

        // Tree being implemented
        int[] A = {3, 1, 2, 4};
        // Building the tree
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);

        // Checking the root (3)
        assertEquals(A[0], tree.myValue);
        // Checking the left of the root (1)
        assertEquals(A[1], tree.left.myValue);
        // Checking the right of node (1) -> (2)
        assertEquals(A[2], tree.left.right.myValue);
        // Checking the right of the root (4)
        assertEquals(A[3], tree.right.myValue);
    }

    @Test
    // TREE BEFORE PLACEMENT:
    //       3
    //      / \
    //     1   4
    //      \
    //       2
    // TREE AFTER PLACEMENT(s):
    //       3
    //      / \
    //     1   4
    //      \   \
    //       2   7
    //          /
    //         5
    // Inserting: 7, 5, 2 (DUPLICATE)
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the insert() method functions correctly
    // TESTING PURPOSE: This test will guarantee that a new node is placed correctly in a tree
    public void test_2() {

        // Tree being implemented
        int[] A = {3, 1, 2, 4};
        // Building the tree
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        // Inserting a new node to the tree
        tree.insert(7);
        tree.insert(5);
        tree.insert(2);

        // Expected tree to be implement
        int[] B = {3, 1, 2, 4, 7, 5, 2};
        // Building the expected tree
        myBinarySearchTreeNode treeExpected = new myBinarySearchTreeNode(B);

        // Checking the roots (3)
        assertEquals(tree.myValue, treeExpected.myValue);
        // Checking the left node of the root (1)
        assertEquals(tree.left.myValue, treeExpected.left.myValue);
        // Checking the right node of the root (4)
        assertEquals(tree.right.myValue, treeExpected.right.myValue);
        // Checking the right of node (1) -> (2)
        assertEquals(tree.left.right.myValue, treeExpected.left.right.myValue);
        // Checking the right of node (4) -> (7)
        assertEquals(tree.right.right.myValue, treeExpected.right.right.myValue);
        // Checking the left of node (7) -> (5)
        assertEquals(tree.right.right.left.myValue, treeExpected.right.right.left.myValue);
    }

    @Test
    // EXPECTED HEIGHT: 4
    // ACTUAL HEIGHT: 4
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the height() method functions correctly
    // TESTING PURPOSE: This test will make sure that the correct height of a tree is computed as expected
    public void test_3() {

        // Tree being implemented
        int[] A = {7, 14, 18, 4, 11, 21};

        // Expected height
        int expectedHeight = 4;

        // Building the tree
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);

        // Testing assertion
        assertEquals(expectedHeight, tree.height());
    }

    @Test
    // VALUE OF SEARCH: 8
    // EXPECTED DEPTH: 3
    // ACTUAL DEPTH: 3
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the depth() method functions correctly
    // TESTING PURPOSE: This test will ensure that given a search key, computes the correct depth of the node
    public void test_4() {

        // Tree being implemented
        int[] A = {3, 1, 2, 4};

        // Expected depth
        int expectedDepth = 3;

        // Building the tree
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);

        // Inserting nodes
        tree.insert(7);
        tree.insert(8);
        tree.insert(10);
        tree.insert(5);
        tree.insert(2); // Duplicate node
        tree.insert(10); // Duplicate node

        // Testing assertion
        assertEquals(expectedDepth, tree.depth(8));
    }

    @Test
    // EXPECTED SIZE: 6
    // ACTUAL SIZE: 6
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the size() method functions correctly
    // TESTING PURPOSE: This test will make sure that the size of a tree (number of nodes in the tree total) is computed correctly
    public void test_5() {

        // Tree being implemented
        int[] A = {7, 14, 18, 4, 11, 21};

        // Expected size
        int expectedSize = 6;

        // Building the tree
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);

        // Testing assertion
        assertEquals(expectedSize, tree.size());
    }
}