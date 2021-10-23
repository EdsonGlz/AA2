public class ArbolB {
    public static final int T=3;
    public Node root;

    public ArbolB(Node root)
    {
        this.root = root;
    }

    public boolean allNodesInOrder()
    {
        allNIO = true;
        allNodesInOrder(root);

        return allNIO;
    }

    public boolean allNIO;
    public void allNodesInOrder(Node n)
    {
        if (n == null)
        {
            return;
        }

        if (n.isLeaf){
            allNIO = allNIO && n.keysInOrder();
            return;            
        }

        allNIO = allNIO && n.keysInOrder();
        for (Node ni : n.children) {
            allNodesInOrder(ni);
        }
    }
    public boolean eje2Res;
    public boolean eje2()
    {
        eje2Res = true;
        eje2(root);

        return eje2Res;
    }
    public void eje2(Node n)
    {
        if (n == null)
        {
            return;
        }

        int j=0;

        for (Integer i : n.keys) {
            eje2Res = eje2Res && n.compare(j++);
        }

        for (Node ni : n.children) {
            eje2(ni);
        }
    }

    public boolean eje3Res;
    public boolean eje3()
    {
        eje3Res = true;
        eje3(root);

        return eje3Res;
    }

    public void eje3(Node n)
    {
        if (n == null)
        {
            return;
        }
        if (n.missing() && n.parent != null)
        {
            eje3Res = false;
        }

        for (Node ni : n.children) {
            eje3(ni);
        }
    }

    public boolean eje4Res;
    public boolean eje4()
    {
        eje4Res = true;
        eje4(root);

        return eje4Res;
    }

    public void eje4(Node n)
    {
        if (n == null)
        {
            return;
        }
        if (n.exceeds())
        {
            eje4Res = false;
        }

        for (Node ni : n.children) {
            eje4(ni);
        }
    }

    public boolean eje5Res;
    public boolean eje5()
    {
        eje5Res = true;
        eje5(root);

        return eje5Res;
    }

    public void eje5(Node n)
    {
        if (n == null)
        {
            return;
        }
        if (!n.isLeaf && n.parent != null && n.sons())
        {
            eje5Res = false;
        }

        for (Node ni : n.children) {
            eje5(ni);
        }
    }


    public boolean eje6Res;
    public boolean eje6()
    {
        eje6Res = true;
        eje6(root);

        return eje6Res;
    }

    public void eje6(Node n)
    {
        if (n == null)
        {
            return;
        }

        if (!n.isRoot() && !n.isLeaf())
        {
            if (n.isLeaf)
            {
                eje6Res = false;
            }
        }

        for (Node ni : n.children) {
            eje6(ni);
        }
    }

    public boolean eje7Res;
    public boolean eje7()
    {
        eje7Res = true;
        eje7(root);

        return eje7Res;
    }

    public void eje7(Node n)
    {
        if (n == null)
        {
            return;
        }

        if (n.isLeaf())
        {
            if (!n.isLeaf)
            {
                eje7Res = false;
            }
        }

        for (Node ni : n.children) {
            eje7(ni);
        }
    }


    

    public void print(Node n)
    {
        if (n == null)
        {
            return;
        }

        for (int key : n.keys)
            System.out.print(key + " ");
        System.out.println();
        for (Node ni : n.children) {
            print(ni);
        }
    }

}
