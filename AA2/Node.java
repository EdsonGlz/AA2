import java.util.ArrayList;
import java.util.List;

public class Node {
    public List<Integer> keys = new ArrayList<Integer>();
    public int n;
    public Node parent = null;
    public List<Node> children = new ArrayList<Node>();
    public boolean isLeaf = false;

    public Node()
    {

    }

    public boolean keysInOrder()
    {
        for (int i = 0; i < keys.size()-1; i++)
        {
            if(keys.get(i) > keys.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public boolean compare(int index)
    {
        if (this.isLeaf()){
            return true;
        }
        
        List<Integer> l = this.children.get(index).keys;
        int targetValue = this.keys.get(index);
        if (l.isEmpty())
            return true;
        for (Integer i : l) {
            if (i > targetValue)
                return false;
        }
        if (this.children.size() % 2 == 0){
            List<Integer> r = this.children.get(index+1).keys;
            if (r.isEmpty())
                return true;
            for (Integer i : r) {
                if (i < targetValue)
                    return false;
            }
        }

        return true;
    }

    public boolean missing()
    {
        if (this.keys.size() < ArbolB.T - 1)
        {
            return true;
        }
        return false;
    }

    public boolean exceeds()
    {
        if (this.keys.size() > (2*ArbolB.T) - 1)
        {
            return true;
        }
        return false;
    }

    public boolean sons()
    {
        if (this.children.size() != n-1)
        {
            return false;
        }
        return true;
    }

    public boolean isRoot()
    {
        if (this.parent == null)
        {
            return true;
        }
        return false;
    }

    public boolean isLeaf()
    {
        if (this.children.size() == 0)
        {
            return true;
        }
        return false;
    }
}
