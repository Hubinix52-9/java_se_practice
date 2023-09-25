import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    public class Ex47AbstractClassTest {
    private Ex47AbstractClass cls;
    @Before
    public void setUp(){cls = new Ex47AbstractClass();}
        @Test
        public void nodeClassTest() {
            Ex47AbstractClass.Node node = cls.new Node("5");
            Assert.assertEquals("5", node.getValue());
            Assert.assertNull(node.next());
            Assert.assertNull(node.previous());

            Ex47AbstractClass.Node leftNode = cls.new Node("3");
            node.setPrevious(leftNode);
            Assert.assertEquals(leftNode, node.previous());

            Ex47AbstractClass.Node rightNode = cls.new Node("7");
            node.setNext(rightNode);
            Assert.assertEquals(rightNode, node.next());

            Ex47AbstractClass.Node smallerNode = cls.new Node("2");
            Assert.assertTrue(leftNode.compareTo(smallerNode) > 0);
            Assert.assertTrue(leftNode.compareTo(node) < 0);
            Assert.assertTrue(leftNode.compareTo(rightNode) < 0);
            Assert.assertTrue(rightNode.compareTo(node) > 0);
            Assert.assertEquals(0, node.compareTo(node));
        }

        @Test
        public void myLinkedListClassTest() {
            Ex47AbstractClass.Node node = cls.new Node("5");
            Ex47AbstractClass.MyLinkedList linkedList = new Ex47AbstractClass.MyLinkedList(node);

            Ex47AbstractClass.Node node2 = cls.new Node("3");
            Ex47AbstractClass.Node node3 = cls.new Node("7");
            Ex47AbstractClass.Node node4 = cls.new Node("2");
            Ex47AbstractClass.Node node5 = cls.new Node("8");

            Assert.assertTrue(linkedList.addItem(node2));
            Assert.assertTrue(linkedList.addItem(node3));
            Assert.assertTrue(linkedList.addItem(node4));
            Assert.assertTrue(linkedList.addItem(node5));
            Assert.assertFalse(linkedList.addItem(node2));

            Assert.assertTrue(linkedList.removeItem(node2));
            Assert.assertFalse(linkedList.removeItem(node2));

            linkedList.traverse(linkedList.getRoot());
        }

        @Test
        public void searchTreeClassTest() {
            Ex47AbstractClass.Node node = cls.new Node("5");
            Ex47AbstractClass.SearchTree searchTree = new Ex47AbstractClass.SearchTree(node);

            Ex47AbstractClass.Node node2 = cls.new Node("3");
            Ex47AbstractClass.Node node3 = cls.new Node("7");
            Ex47AbstractClass.Node node4 = cls.new Node("2");
            Ex47AbstractClass.Node node5 = cls.new Node("8");

            Assert.assertTrue(searchTree.addItem(node2));
            Assert.assertTrue(searchTree.addItem(node3));
            Assert.assertTrue(searchTree.addItem(node4));
            Assert.assertTrue(searchTree.addItem(node5));
            Assert.assertFalse(searchTree.addItem(node2));

            Assert.assertTrue(searchTree.removeItem(node2));
            Assert.assertFalse(searchTree.removeItem(node2));

            searchTree.traverse(searchTree.getRoot());
        }
    }

