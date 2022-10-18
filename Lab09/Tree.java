import java.util.Iterator;

public class Tree implements TreeADT {

    private TreeNode root;
    private int size;

    public Tree() {
        root = null;
        size = 0;
    }

    public Tree(TreeNode r) {
        root = r;
        size = 1;
    }

    @Override
    public TreeNode root() {
        return root;
    }

    @Override
    public TreeNode parent(TreeNode node) {
        return node.getParent();
    }

    @Override
    public Iterator<TreeNode> children(TreeNode node) {
        return node.getChildren().iterator();
    }

    @Override
    public int numChildren(TreeNode node) {
        return node.getChildren().size();
    }

    @Override
    public boolean isInternal(TreeNode node) {
        return numChildren(node) != 0;
    }

    @Override
    public boolean isExternal(TreeNode node) {
        return numChildren(node) == 0;
    }

    @Override
    public boolean isRoot(TreeNode node) {
        return node.getParent() == null;
    }

    @Override
    public void preOrderTraversal(TreeNode node) {
        visit(node);
        Iterator<TreeNode> iter = node.getChildren().iterator();
        while (iter.hasNext()) {
            preOrderTraversal(iter.next());
        }
    }

    @Override
    public void postOrderTraversal(TreeNode node) {
        Iterator<TreeNode> iter = node.getChildren().iterator();
        while (iter.hasNext()) {
            postOrderTraversal(iter.next());
        }
        visit(node);
    }

    @Override
    public void breadthFirst(TreeNode tnode) {
        LinkedQueue q = new LinkedQueue();
        MyNode n = new MyNode(tnode, null);
        try {
            q.enqueue(n);
            while (!q.isEmpty()) {
                MyNode p = q.dequeue();
                TreeNode t = (TreeNode) p.getData();
                visit(t);
                Iterator<TreeNode> itr = t.getChildren().iterator();
                while (itr.hasNext()) {
                    MyNode tmp = new MyNode(itr.next(), null);
                    q.enqueue(tmp);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void visit(TreeNode node) {
        System.out.println(node.getData());
    }

    @Override
    public void addTreeNode(TreeNode parent, TreeNode child) {
        if (parent.addChild(child)) {
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int depth(TreeNode node) {
        if (isRoot(node)) {
            return 0;
        } else {
            return depth(node.getParent()) + 1;
        }
    }

    @Override
    public int height(TreeNode node) {
        if (isExternal(node)) {
            return 0;
        }
        return maxHeight(node.getChildren().iterator()) + 1;
    }

    private int maxHeight(Iterator<TreeNode> children) {
        int maxH = Integer.MIN_VALUE;
        while (children.hasNext()) {
            int h = height(children.next());
            if (h > maxH) {
                maxH = h;
            }
        }
        return maxH;
    }

}
