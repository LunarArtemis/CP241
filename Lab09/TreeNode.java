import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TreeNode implements TreeNodeADT<Employee> {

    private TreeNode parent;
    private Employee data;
    private List<TreeNode> children;

    public TreeNode(){
        parent = null;
        data = null;
        children = new ArrayList<TreeNode>();
    }
    
    public TreeNode(Employee data){
        parent = null;
        this.data = data;
        children = new ArrayList<TreeNode>();
    }

    public TreeNode(Employee e, TreeNode parent){
        this.parent = parent;
        this.data = e;
        children = new ArrayList<TreeNode>();
    }

    @Override
    public boolean addChild(TreeNode child) {
        if(!searchChildByKey(child.getData())){
            children.add(child);
            child.setParent(this);
            return true;
        }
        return false;
    }

    @Override
    public boolean addChild(Employee data) {
        if(!searchChildByKey(data)){
            TreeNode tnode = new TreeNode(data);
            children.add(tnode);
            tnode.setParent(this);
            return true;
        }
        return false;
    }

    @Override
    public void addChildren(Iterator<TreeNode> children) {
        while(children.hasNext()){
            addChild(children.next());
        }
    }

    @Override
    public boolean searchChildByKey(Employee key) {
        Iterator<TreeNode> iter = children.iterator();
        while(iter.hasNext()){
            Employee e = iter.next().getData();
            if(e.equals(key)){
                return true;
            }
        }
        return false;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }
    
    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
    
}
